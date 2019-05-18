package c011.virtualproxy;

import javax.swing.*;
import java.awt.*;
import java.net.URL;
import java.util.Objects;

public class ImageProxy implements Icon {

    ImageIcon imageIcon;
    URL imageURL;
    Thread retrievalThread;
    boolean retrieving = false;

    public ImageProxy(URL url) {
        imageURL = url;
    }

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        if (Objects.nonNull(imageIcon)) {
            imageIcon.paintIcon(c, g, x, y);
        } else {
            g.drawString("Loading CD cover, please wait...", x + 300, y + 190);
            if (!retrieving) {
                //只有一个线程会调用paint，所以这里的做法是线程安全的
                retrieving = true;
                //我们不希望挂起整个用户界面，所以用另一个线程取出图像
                retrievalThread = new Thread(() -> {
                    try {
                        //其构造器会在图像加载完成后才返回
                        imageIcon = new ImageIcon(imageURL, "CD Cover");
                        c.repaint();
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                });
                retrievalThread.start();
            }
        }
    }

    @Override
    public int getIconWidth() {
        if (Objects.nonNull(imageIcon)) {
            return imageIcon.getIconWidth();
        } else {
            return 800;
        }
    }

    @Override
    public int getIconHeight() {
        if (Objects.nonNull(imageIcon)) {
            return imageIcon.getIconHeight();
        } else {
            return 600;
        }
    }

}
