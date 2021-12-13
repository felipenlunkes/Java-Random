
import java.awt.Cursor; 
import java.awt.FlowLayout;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import javax.swing.*;

public class Formulario implements ActionListener{
JFrame janela = new JFrame();  
    
    JTextField jtNumeros = new JTextField(40);   
 
    JButton jb1 = new JButton("1");
    JButton jb2 = new JButton("2");  
    JButton jb3 = new JButton("3");  
    JButton jb4 = new JButton("4");  
    JButton jb5 = new JButton("5");  
    JButton jb6 = new JButton("6");  
    JButton jb7 = new JButton("7");  
    JButton jb8 = new JButton("8"); 
    JButton jb9 = new JButton("9");   
    JButton jb0 = new JButton("0");
    JButton jbmais = new JButton("+");
    JButton jbmenos = new JButton("-");
    JButton jbdiv = new JButton("/");
    JButton jbmul = new JButton("*");
    JLabel jlespaco1= new JLabel("                                                                ");
    JLabel jlespaco2= new JLabel("                                                  ");
    JLabel jlespaco3= new JLabel("                                                 ");
	    
    public Formulario(){ 
        janela.setTitle("Calculadora Basica");
        janela.setSize(400,400);
   
         //janela.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER));
         janela.setLayout(null);
         jtNumeros.setBounds(1,1,300,50);
        jb1.setBounds(18,100,100,30);
        jb2.setBounds(18,140,100,30);
        jb3.setBounds(18,180,100,30);
        jb4.setBounds(150,100,100,30);
        jb5.setBounds(150,140,100,30);
        jb6.setBounds(150,180,100,30);
        jb7.setBounds(280,100,100,30);
        jb8.setBounds(280,140,100,30);
        jb9.setBounds(280,180,100,30);
        jb0.setBounds(150,220,100,30);
        
        jbdiv.setBounds(18,250,100,30);
        jbmul.setBounds(18,290,100,30);
        jbmais.setBounds(18,330,100,30);
        jbmenos.setBounds(18,390,100,30);
        
        janela.getContentPane().add(jtNumeros);  
        janela.getContentPane().add(jb1);
        janela.getContentPane().add(jb2);
        janela.getContentPane().add(jb3);
        janela.getContentPane().add(jb4);
        janela.getContentPane().add(jb5);
        janela.getContentPane().add(jb6);
        janela.getContentPane().add(jb7);
        janela.getContentPane().add(jb8);
        janela.getContentPane().add(jb9);
        janela.getContentPane().add(jb0);
        janela.getContentPane().add(jbmais);
        janela.getContentPane().add(jbmenos);
        janela.getContentPane().add(jbdiv);
        janela.getContentPane().add(jbmul);
         
        jb1.setCursor(new Cursor(Cursor.HAND_CURSOR));  
         jb2.setCursor(new Cursor(Cursor.HAND_CURSOR));  
          jb3.setCursor(new Cursor(Cursor.HAND_CURSOR));  
           jb4.setCursor(new Cursor(Cursor.HAND_CURSOR));  
            jb5.setCursor(new Cursor(Cursor.HAND_CURSOR));  
             jb6.setCursor(new Cursor(Cursor.HAND_CURSOR));  
              jb7.setCursor(new Cursor(Cursor.HAND_CURSOR));   
               jb8.setCursor(new Cursor(Cursor.HAND_CURSOR));
                jb9.setCursor(new Cursor(Cursor.HAND_CURSOR));  
                 jb0.setCursor(new Cursor(Cursor.HAND_CURSOR));   
                  jbmais.setCursor(new Cursor(Cursor.HAND_CURSOR));   
                  jbmenos.setCursor(new Cursor(Cursor.HAND_CURSOR));   
                  jbdiv.setCursor(new Cursor(Cursor.HAND_CURSOR));   
                  jbmul.setCursor(new Cursor(Cursor.HAND_CURSOR));   
                  jb9.setLayout(new FlowLayout(FlowLayout.CENTER));
         
          
        janela.add(jb1);
        janela.add(jb2);
        janela.add(jb3);
        janela.add(jb4);
        janela.add(jb5);
        janela.add(jb6);
        
        janela.add(jb7);
       
        janela.add(jb8);
        janela.add(jb9);
        
        janela.add(jb0);
       
    
        janela.add(jbmais);
        janela.add(jbmenos);
        
        janela.add(jbdiv);
        janela.add(jbmul);
       
        janela.setLocationRelativeTo(null); 
        janela.setVisible(true);      
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false); 
        jb1.addActionListener(this);  
         jb2.addActionListener(this);  
          jb3.addActionListener(this);  
           jb4.addActionListener(this);  
            jb5.addActionListener(this);  
             jb6.addActionListener(this);  
              jb7.addActionListener(this);  
               jb8.addActionListener(this);  
                jb9.addActionListener(this);  
                 jb0.addActionListener(this);  
                  jbmais.addActionListener(this);
                   jbmenos.addActionListener(this);
                    jbdiv.addActionListener(this);
                     jbmul.addActionListener(this);
        
    }  
    public static void main(String[] args) {
        new Formulario();
    }  
   public void actionPerformed(ActionEvent objeto){
    
  
    
}
}


 
