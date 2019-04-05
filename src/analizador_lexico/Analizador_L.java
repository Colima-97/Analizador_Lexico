package analizador_lexico;
import javax.swing.JOptionPane;

public class Analizador_L{    
    
    public static void main(String[] args) {                       
        Ventana v1 = new Ventana();
        v1.setVisible(true);         
    }
    
    public void error_message(String errorType){
        String error = "El error se debe a "+errorType;
        JOptionPane.showMessageDialog(null, error, "Error", JOptionPane.ERROR_MESSAGE);
    }
        
}
