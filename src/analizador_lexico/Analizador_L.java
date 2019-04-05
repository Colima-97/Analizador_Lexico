package analizador_lexico;
import javax.swing.JOptionPane;

public class Analizador_L{    
    
    public static void main(String[] args) {                       
        Ventana v1 = new Ventana();
        v1.setVisible(true);  
        
    }
    
    public static void error_message(){        
        JOptionPane.showMessageDialog(null, "Ups, algo salió mal", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
}
