/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package analizador_lexico;

/**
 *
 * @author Luis J. Ortiz
 */
public class Analizador_kernel {
    
    
    public String AnalizarCodigo(String codigo){
        codigo+=" ";
        String separador = "";
        String resultado = "";
        int i=0;
        while(i<codigo.length()){
                char c = codigo.charAt(i);
                switch (c) {
                    case ' ': case '\t': case '\n': case '\r': case '\f': case'(': case')':
                        if(!separador.isEmpty()){
                            String token = verificarToken(separador);
                            resultado += separador + ": Es un(a) " + token + "\n";
                            separador = "";
                        }
                        break;
                    case '=': case '+': case '-': case '*': case '/':
                        if(!separador.isEmpty()){
                            String token = verificarToken(separador);
                            String operador = verificarOperador(c);
                            resultado += separador + ": Es un(a) " + token + "\n";
                            resultado += c + ": Es un " + operador + "\n";
                            separador = "";
                        }else{
                            String operador = verificarOperador(c);
                            resultado += c + ": Es un " + operador + "\n";
                        }
                        break;
                    default:
                        separador += c;
                }
            i++;
        };
        return resultado;        
    }
    private static String verificarToken(String cadena){
        String token;
        if(cadena.contains("$")){
            if(cadena.charAt(0)=='$'){
                if(Character.isLetter(cadena.charAt(1))){
                    token = "Identificador";
                }else{
                    token = "ERROR(El primer caracter despues del simbolo $ no puede ser un numero)";
                }
            }else{
                token = "ERROR(El simbolo $ tiene que estar al principio del identificador)";
            }
        }else{
            if(cadena.equals("if")||cadena.equals("else")||cadena.equals("for")||cadena.equals("while")||cadena.equals("null")){
                token = "Palabra Reservada";
            }else{
                if(isNumeric(cadena)){
                    token = "Numero";
                }else{
                    token = "ERROR(Cadena no identificada. ¿No habras olvidado el simbolo $?)";
                }
            }
        }
        return token;
    }
    private static String verificarOperador(char c){
        String token;
        switch (c) {
            case '=': 
                token = "Operador(Igual)";
                break;
            case '+': 
                token = "Operador(Suma)";
                break;
            case '-': 
                token = "Operador(Resta)";
                break;
            case '*': 
                token = "Operador(Multiplicacion)";
                break;
            case '/':
                token = "Operador(Division)";
                break;
            default:
                token = "ERROR(No deberia ser posible que salga este error. ¿Que mierdas has hecho?)";
        }
        return token;
    }
    private static boolean isNumeric(String cadena){
        boolean resultado;
        try {
            Integer.parseInt(cadena);
            resultado = true;
        } catch (NumberFormatException excepcion) {
            resultado = false;
        }
        return resultado;
    }
}