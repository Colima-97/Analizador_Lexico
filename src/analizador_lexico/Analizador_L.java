package analizador_lexico;
import javax.swing.JOptionPane;

public class Analizador_L{    
    
   static  MyIcon icon;
    public static void main(String[] args) {                       

        while(true){
            int valor = menu_principal();
            switch(valor){
                case 0:
                    String respuesta = menu_insercion();

                    if(respuesta == null || respuesta.isEmpty()){
                        error_message();                        
                    }else{
                        //
                    }
                    break;

                case 1:
                    //Your code here! @2
                    break;

                case 2:
                    //Your code here! @3
                    break;

                case 3:
                    menu_salida();
                    return;                                    
            }
        }
                
        
    }
    
    public static int menu_principal(){   
        icon = new MyIcon();
        String[] options = {
          "Escribir cadena","Mostrar anteriores","Ayuda","Salir"  
        };
        int seleccion = JOptionPane.showOptionDialog(null, "Seleccione una opción", "Menú principal", 0,0, icon,options,options[0]);
        return seleccion;
    }
    
    public static String menu_insercion(){
        icon = new MyIcon();
        String seleccion = JOptionPane.showInputDialog(null, "Escriba una cadena", "Escribir cadena", -1);
        return seleccion;
    }
    
    public static void menu_salida(){
        icon = new MyIcon();
        JOptionPane.showMessageDialog(null, "Hasta luego", "Salir", 0, icon);
    }
    
    public static void error_message(){
        icon = new MyIcon();
        JOptionPane.showMessageDialog(null, "Ups, algo salió mal", "Error", JOptionPane.ERROR_MESSAGE);
    }
        
}
