
import java.awt.Cursor; 
import java.awt.FlowLayout;  
import java.awt.event.ActionEvent;  
import java.awt.event.ActionListener;  
import javax.swing.*;

public class Swing implements ActionListener{
JFrame janela = new JFrame();  
    JLabel jlCodigo = new JLabel("Código:");  
    JLabel jlNome = new JLabel("Nome:");  
    JLabel jlEndereco = new JLabel("Endereço:");  
    JLabel jlBairro = new JLabel("Bairro:");  
    JLabel jlEstado = new JLabel("Estado:"); 
    JLabel jlCidade = new JLabel("Cidade:");   
    JTextField jtCodigo = new JTextField(40);  
    JTextField jtNome = new JTextField(40); 
 JTextField jtEndereco = new JTextField(40);   
 JTextField jtBairro = new JTextField(40);  
 JTextField jtEstado = new JTextField(40); 
 JTextField jtCidade = new JTextField(40);   
    JPasswordField jpSenha = new JPasswordField(40);  
    JButton jbConferir = new JButton("Salvar");  
	    
    public Swing(){ 
        janela.setTitle("Agenda eletrônica");
        janela.setSize(600,600);
        janela.getContentPane().setLayout(new FlowLayout(FlowLayout.RIGHT));
        janela.getContentPane().add(jlCodigo);  
        janela.getContentPane().add(jtCodigo);
janela.getContentPane().add(jlNome);  
janela.getContentPane().add(jtNome);  
janela.getContentPane().add(jlEndereco);  
janela.getContentPane().add(jtEndereco); 
janela.getContentPane().add(jlBairro);
janela.getContentPane().add(jtBairro);    
        janela.getContentPane().add(jlSenha);
        janela.getContentPane().add(jpSenha); 
        jbConferir.setCursor(new Cursor(Cursor.HAND_CURSOR));  
        janela.add(jbConferir);
        janela.setLocationRelativeTo(null); 
        janela.setVisible(true);      
        janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        janela.setResizable(false); 
        jbConferir.addActionListener(this);  
    }  
    public static void main(String[] args) {
        new Swing();
    }  
   public void actionPerformed(ActionEvent objeto){
        if (objeto.getSource()==jbConferir){
            String usuario=jtUsuario.getText();  
            String senha=new String (jpSenha.getPassword());
            if ((usuario.equals("kilder"))&&(senha.equals("abc"))) { 
                JOptionPane.showMessageDialog(null,"Usuário e senha aceitos.","Controle de acesso",JOptionPane.INFORMATION_MESSAGE); 
            }else{
                JOptionPane.showMessageDialog(null,"Usuário ou senha incorretos","Controle de acesso",JOptionPane.ERROR_MESSAGE);  
                jtUsuario.requestFocus(); 
            }
        }  
         
}
}


 
