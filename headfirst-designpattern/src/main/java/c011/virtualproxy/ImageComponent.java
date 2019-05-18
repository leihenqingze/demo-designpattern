package c011.virtualproxy;

import lombok.Setter;

import javax.swing.*;
import java.awt.*;

public class ImageComponent extends JComponent {

    @Setter
    private Icon icon;

    public ImageComponent(Icon icon) {
        this.icon = icon;
    }

    @Override
    public void paintComponents(Graphics g) {
        super.paintComponents(g);
        int w = icon.getIconWidth();
        int h = icon.getIconHeight();
        int x = (800 - w) / 2;
        int y = (600 - h) / 2;
        icon.paintIcon(this, g, x, y);
    }

}