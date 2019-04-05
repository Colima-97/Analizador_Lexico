package analizador_lexico;

import java.awt.Graphics;
import javax.swing.*;

public class Lamina extends JPanel{
    
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawString("Escriba una cadena", 50, 50);
    }
    
}
