package analizador_lexico;

//import java.awt.Color;
//import java.awt.geom.*;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionListener;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class Lamina extends JPanel implements ActionListener{        
    protected JTextField jtfCadena;
    protected JButton jbtnOK;
    protected JTextArea jtaMostrar;
    protected JScrollPane jspScroll;
    
    public Lamina(){
        setLayout(null);
        
        //TextFields
        jtfCadena = new JTextField();
        jtfCadena.addActionListener(this);
        jtfCadena.setFont(new Font("Times New Roman",Font.BOLD,20));
        jtfCadena.setSelectionColor(Color.YELLOW);                
        jtfCadena.setBounds(50, 55, 380, 50);
        add(jtfCadena);
        
        //JButton
        jbtnOK = new JButton();
        jbtnOK.addActionListener(this);
        jbtnOK.setText("Analizar");
        jbtnOK.setFont(new Font("Times New Roman",Font.BOLD,15));                        
        jbtnOK.setBounds(450, 55, 100, 50);
        add(jbtnOK);
        
        //TextArea
        jtaMostrar = new JTextArea();
        jtaMostrar.setFont(new Font("Times New Roman",Font.BOLD,18));
        jtaMostrar.setEditable(false);  
        jtaMostrar.setLineWrap(true);
        
        //ScrollPane
        jspScroll = new JScrollPane(jtaMostrar);
        jspScroll.setBounds(50,130,500,400);
        add(jspScroll);        
              
        
        
    }
    
    //Método usado para dibujar
    public void paintComponent(Graphics g){
        super.paintComponent(g);        
        Graphics2D g2 = (Graphics2D) g;
        Font miFuente=new Font("Times New Roman",Font.BOLD,24);
        //g2.setColor(Color.DARK_GRAY); //Quito el color, pues puse el Foreground en el constructor JFrame
        g2.setFont(miFuente);
        g2.drawString("Escriba una cadena", 50, 50);                 
    }
    
    //Este método se implementa para escuchar los eventos
    @Override
    public void actionPerformed(ActionEvent ae) {        
        String cadena = jtfCadena.getText();                    
        
        if(cadena.trim().isEmpty()){
            jtfCadena.setText("");
        }else{
            //jtaMostrar.append(cadena.trim()+"\n");
            Analizador_kernel analizar = new Analizador_kernel();   
            String nueva_cadena = analizar.AnalizarCodigo(cadena.trim());
            jtaMostrar.setText(nueva_cadena);            
            jtfCadena.setText("");
        }
        
    }
        
}