package analizador_lexico;
import javax.swing.*;

public class Ventana extends JFrame{
    
    public Ventana(){
        setSize(600,600);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setTitle("Analizador Léxico");
        setLocationRelativeTo(null);
        Lamina miLamina=new Lamina();
        add(miLamina);
    }    
    
}
