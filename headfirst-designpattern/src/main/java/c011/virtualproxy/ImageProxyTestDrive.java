package c011.virtualproxy;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class ImageProxyTestDrive {

    ImageComponent imageComponent;
    JFrame frame = new JFrame("CD Cover Viewer");
    JMenuBar menuBar;
    JMenu menu;
    Map<String, String> cds = new ConcurrentHashMap<>();

    public static void main(String[] args) throws MalformedURLException {
        ImageProxyTestDrive testDrive = new ImageProxyTestDrive();
    }

    public ImageProxyTestDrive() throws MalformedURLException {
        cds.put("tongmeng", "https://ss1.baidu.com/-4o3dSag_xI4khGko9WTAnF6hhy/image/h%3D300/" +
                "sign=a9e671b9a551f3dedcb2bf64a4eff0ec/4610b912c8fcc3cef70d70409845d688d53f20f7.jpg");
        cds.put("zhiwu", "http://gss0.baidu.com/9fo3dSag_xI4khGko9WTAnF6hhy/" +
                "zhidao/pic/item/d833c895d143ad4b031f6a7983025aafa40f0651.jpg");

        URL initialUrl = new URL(cds.get("tongmeng"));
        menuBar = new JMenuBar();
        menu = new JMenu("Favorite CDs");
        menuBar.add(menu);
        frame.setJMenuBar(menuBar);

        for (Map.Entry<String, String> entry : cds.entrySet()) {
            JMenuItem jMenuItem = new JMenuItem(entry.getKey());
            menu.add(jMenuItem);
            jMenuItem.addActionListener(new AbstractAction() {
                @Override
                public void actionPerformed(ActionEvent event) {
                    imageComponent.setIcon(new ImageProxy(getCDUrl(event.getActionCommand())));
                    frame.repaint();
                }
            });
        }

        Icon icon = new ImageProxy(initialUrl);
        imageComponent = new ImageComponent(icon);
        frame.getContentPane().add(imageComponent);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(800, 600);
        frame.setVisible(true);
    }

    URL getCDUrl(String name) {
        try {
            return new URL(cds.get(name));
        } catch (MalformedURLException e) {
            e.printStackTrace();
            return null;
        }
    }

}
