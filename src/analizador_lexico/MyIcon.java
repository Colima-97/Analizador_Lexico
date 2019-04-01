package analizador_lexico;

import java.awt.Component;
import java.awt.Graphics;
import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;

public class MyIcon implements Icon{

    @Override
    public void paintIcon(Component c, Graphics g, int x, int y) {
        Image image = new ImageIcon(getClass().getResource("/resources/coco.png")).getImage();
        g.drawImage(image,x,y,c);
    }

    @Override
    public int getIconWidth() {
        return 30;
    }

    @Override
    public int getIconHeight() {
        return 30;
    }

}
