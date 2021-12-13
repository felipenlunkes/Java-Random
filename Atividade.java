  
  
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
	   
	   
	public class Atividade extends JFrame implements ActionListener{   
	   
	    private static final long serialVersionUID = 1L;   
	    JTextField jtProduto = new JTextField(40);   
	    JTextField jtPreco = new JTextField(40);
	    JTextField jtQuantidade = new JTextField(11);   
	    JLabel jlProduto = new JLabel("Produto:");   
	    JLabel jlPreco = new JLabel("Preço:");   
	    JLabel jlQuantidade = new JLabel("Quantidade:"); 
	    JLabel total_pagar = new JLabel("Total a pagar:");
	    JLabel mostrar_total = new JLabel("");  
	    JButton limpar = new JButton("Nova compra...");
	      
	          
	    JButton jbSalvar = new JButton("Salvar");   
	       
	    public Atividade() {   
	        super();   
	        //setLayout(new FlowLayout(FlowLayout.RIGHT));   
	        setLayout(null);
	        setTitle("Cadastro de produtos por Felipe Miguel e Raíssa Hamanaka");   
	        jlProduto.setBounds(18,18,100,30);
	        jtProduto.setBounds(110,18,100,30);
	        jlPreco.setBounds(18,80,100,30);
	        jtPreco.setBounds(110,80,100,30);
	  
	        jbSalvar.setBounds(400,18,200,30);
	        jlQuantidade.setBounds(18,140,100,30);
	        jtQuantidade.setBounds(110,140,100,30);
	        total_pagar.setBounds(18,200,100,30);
	        mostrar_total.setBounds(130,200,100,30);
	        limpar.setBounds(400,80,200,30);
	        
	        add(jlProduto);   
	        add(jtProduto);   
	        add(jlPreco);   
	        add(jtPreco); 
	      
	        add(jlQuantidade);
	        add(jtQuantidade);  
	        add(total_pagar);
	        add(mostrar_total);
	        add(jbSalvar);   
	        add(limpar);
	        setSize(700,300);   
	        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);   
	        setLocationRelativeTo(null);   
	        setVisible(true);   
	        jbSalvar.addActionListener(this); 
	        limpar.addActionListener(this);  
	    }   
	    public static void main(String []args){   
	        new Atividade();   
    }   
       
	    public void actionPerformed(ActionEvent arg0) {   
         
         if (arg0.getSource() == jbSalvar){
	     try {  
			    JOptionPane.showMessageDialog(null,"Cadastrando...");  
 	            Class.forName("com.mysql.jdbc.Driver"); 	     
	            Connection c = DriverManager.getConnection("jdbc:mysql://192.168.50.100/feliperaissa", "root", "suporte");   
	            Statement stm = c.createStatement();   
	            String produto = jtProduto.getText();   
	            String quantidade = jtQuantidade.getText();
	           String  valor = jtPreco.getText();
	           double preco = Double.parseDouble(valor); 
	           int qua = Integer.parseInt(quantidade);
	           double quantidadedouble = Double.parseDouble(quantidade);
	           double totalapagar = preco * quantidadedouble;
	           String label = String.valueOf(totalapagar);
	               
	            stm.executeUpdate("insert into produto (produto,quantidade,preco,total) values ('"+produto+"','"+preco+"','"+qua+"','"+totalapagar+"')");   
	            JOptionPane.showMessageDialog(null, "Dados salvos com sucesso.");   
	            mostrar_total.setText("R$ "+totalapagar+"");
	          
	        }   	
	           
	           
	        catch(SQLException ex){   
	            JOptionPane.showMessageDialog(null,"Ocorreu um erro no Banco de Dados utilizado. Erro "+ex.getMessage());   
	        }   
	        catch(Exception ex){   
	            JOptionPane.showMessageDialog(null,"Erro não definido durante o cadastro dos produtos.");   
	        }   
	          
		  }
		  
		  if (arg0.getSource() == limpar){
			  
		
			    jtProduto.setText("");   
	            jtPreco.setText("");   
	            jtQuantidade.setText("");
	            mostrar_total.setText("");
			
			}   
	    }   
	}  
