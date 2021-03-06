package analizador_lexico;

//import java.awt.SystemColor;
import java.awt.Color;
import java.awt.Image;
import javax.swing.ImageIcon;
import javax.swing.JFrame;

public class Ventana extends JFrame{
    
    public Ventana(){        
        try{
            Image icon = new ImageIcon(getClass().getResource("/resources/coco.png")).getImage();
            setIconImage(icon);
        }catch(Exception e){
            Analizador_L error = new Analizador_L();
            error.error_message("no se encontró el icono");
        }
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Analizador Léxico");
        setLocationRelativeTo(null);
        setResizable(false);
        Lamina miLamina=new Lamina();
        add(miLamina);        
        //miLamina.setBackground(SystemColor.window);     //Color por defecto del sistema operativo
        miLamina.setBackground(new Color(146,163,255));//Un color lindo
        miLamina.setForeground(Color.DARK_GRAY);    //Aseguro de un único color (no el Background) el JPanel
    }    
    
}
