import java.awt.FlowLayout;   
	import java.awt.event.ActionEvent;   
	import java.awt.event.ActionListener;   
	import java.sql.Connection;   
	import java.sql.DriverManager;   
	import java.sql.SQLException;   
	import java.sql.Statement;   
	   
	import javax.swing.JButton;   
	import javax.swing.JFrame;   
	import javax.swing.JLabel;   
	import javax.swing.JOptionPane;   
	import javax.swing.JTextField;   
	   
	   
	public class Aula01B extends JFrame implements ActionListener{   
	   
	    private static final long serialVersionUID = 1L;   
	    JTextField jtNome = new JTextField(40);   
	    JTextField jtEmail = new JTextField(40);   
	    JLabel jlNome = new JLabel("Nome");   
	    JLabel jlEmail = new JLabel("E-mail");   
	       
	    JButton jbSalvar = new JButton("Salvar");   
	       
	    public Aula01B() {   
	        super();   
	        setLayout(new FlowLayout(FlowLayout.RIGHT));   
	        setTitle("Cadastro");   
	        add(jlNome);   
	        add(jtNome);   
	        add(jlEmail);   
	        add(jtEmail);   
	        add(jbSalvar);   
	        setSize(500,113);   
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	        setLocationRelativeTo(null);   
	        setVisible(true);   
	        jbSalvar.addActionListener(this);   
	    }   
	    public static void main(String []args){   
	        new Aula01B();   
    }   
       
	    public void actionPerformed(ActionEvent arg0) {   

	     try {   JOptionPane.showMessageDialog(null,"estamos aqui");  
 	            Class.forName("com.mysql.jdbc.Driver"); 	     
	            Connection c = DriverManager.getConnection("jdbc:mysql://127.0.0.1/novobanco", "root", "root");   
	            Statement stm = c.createStatement();   
	            String nome = jtNome.getText();   
	            String email = jtEmail.getText();   
	               
	            stm.executeUpdate("insert into cadastro (nome,email) values ('"+nome+"','"+email+"')");   
	            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso.");   
	            jtNome.setText("");   
	            jtEmail.setText("");   
	        }   	
	           
	           
	        catch(SQLException ex){   
	            System.out.println("Há um erro no SQL "+ex.getMessage());   
	        }   
	        catch(Exception ex){   
	            System.out.println("Erro não definido");   
	        }   
	           
	    }   
	}  
