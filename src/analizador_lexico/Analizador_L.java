package analizador_lexico;
import javax.swing.JOptionPane;

public class Analizador_L{    
    
    public static void main(String[] args) {                       
        int valor = menu_principal();
        switch(valor){
            case 0:
                //Your code here! @1
                break;
            
            case 1:
                //Your code here! @2
                break;
            
            case 2:
                //Your code here! @3
                break;
                
            case 3:
                //Your code here! @4
                break;                
        }
                
        
    }
    
    public static int menu_principal(){
        MyIcon icon = new MyIcon();
        String[] options = {
          "Op1","Op2","Op3","Op4"  
        };
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú principal", JOptionPane.DEFAULT_OPTION,JOptionPane.QUESTION_MESSAGE, icon,options,options[0]);
        return seleccion;
    }
        
}
