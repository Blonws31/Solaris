import modulos.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import java.awt.Window.Type;
import javax.swing.JLabel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JFormattedTextField;
import java.awt.Color;


public class frmRegProducto extends JFrame {
	//VARIABLES DEL FORMULARIO
	//OBJETOS
	public Producto NProd;
	
	//CONTROLES
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtPC;
	private JTextField txtPV;
	private JTextField txtCodigo;
	/**
	 * Launch the application.
	 */
	//MAIN DEL FORMULARIO REGISTRO PRODUCTO
	public static void main(String[] args) {
			
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmRegProducto frame = new frmRegProducto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	//CONSTRUCTOR DEL FORMULARIO
	public frmRegProducto() {
		setResizable(false);
		setTitle("Registrar Nuevo Producto");
		setFont(new Font("Serif", Font.BOLD, 18));
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); 
		setBounds(100, 100, 500, 280);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		//LABELS
		JLabel lblNombre = new JLabel("Nombre:");
		lblNombre.setBounds(30, 60, 70, 15);
		contentPane.add(lblNombre);
		
		JLabel lblCodigo = new JLabel("Código:");
		lblCodigo.setBounds(30, 30, 70, 15);
		contentPane.add(lblCodigo);
		
		JLabel lblPC = new JLabel("Precio de Costo:");
		lblPC.setBounds(30, 90, 123, 15);
		contentPane.add(lblPC);
		
		JLabel lblPV = new JLabel("Precio de Venta:");
		lblPV.setBounds(30, 120, 123, 15);
		contentPane.add(lblPV);
		
		
		//Nuevo Botón salir del registro de productos y pasarla data a la lista de todos los productos
		//-----------------Botón OK-----------------------
		//--------------------INICIO------------------------
		JButton btnOK = new JButton("OK");
		btnOK.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {				
				//VALIDAR LOS DATOS QUE SE INGRESAN
				try{
					//validando los datos en todo el formulario
					frmRegProducto.this.validarDatos();
					//MOSTRAR MENSAJE NOTIFICANDO QUE SE HA REGISTRADO CON EXITO
					//si todo fue exitoso									
					frmRegProducto.this.NProd=new Producto(
															Producto.getUltimoCodigo(),
															frmRegProducto.this.txtNombre.getText(),
															frmRegProducto.this.txtPC.getText(),
															frmRegProducto.this.txtPV.getText()
															);
					//crear un nuevo producto con los dtos obtenidos
					//JOptionPane.showMessageDialog(null,frmRegProducto.this.NProd);
					JOptionPane.showMessageDialog(null, "El producto ha sido registrado ", frmRegProducto.this.getTitle(), JOptionPane.INFORMATION_MESSAGE);
					frmProducto.addRowToTable(frmRegProducto.this.NProd);
					txtCodigo.setText(NProd.GenerarCodigo());
					frmRegProducto.this.setVisible(false);
				}
				catch(Exception err){
					JOptionPane.showMessageDialog(null, err, frmRegProducto.this.getTitle(), JOptionPane.ERROR_MESSAGE);
					//System.out.println(err);					
				}
				//SALIR DEL FORMULARIO DE REGISTRO DE PRODUCTO
				//Producto a=new Product;
			
				
			}
		});
		btnOK.setBounds(200, 180, 100, 50);		
		contentPane.add(btnOK);
		//--------------------FIN------------------------	
		
		//Declaración de las cajas de texto
		txtNombre = new JTextField();
		txtNombre.setFont(new Font("Serif", Font.BOLD, 14));
		txtNombre.setBounds(200, 60, 200, 22);
		contentPane.add(txtNombre);
		txtNombre.setColumns(10);
		
		txtPC = new JTextField();
		txtPC.setFont(new Font("Serif", Font.BOLD, 14));
		txtPC.setColumns(10);
		txtPC.setBounds(200, 90, 200, 22);
		contentPane.add(txtPC);
		
		txtPV = new JTextField();
		txtPV.setFont(new Font("Serif", Font.BOLD, 14));
		txtPV.setColumns(10);
		txtPV.setBounds(200, 120, 200, 22);
		contentPane.add(txtPV);
		
		txtCodigo = new JTextField();
		txtCodigo.setHorizontalAlignment(SwingConstants.CENTER);
		txtCodigo.setText(NProd.GenerarCodigo());
		txtCodigo.setEnabled(false);
		txtCodigo.setFont(new Font("Serif", Font.BOLD, 14));
		txtCodigo.setColumns(10);
		txtCodigo.setBounds(200, 30, 200, 22);
		contentPane.add(txtCodigo);

	}
	//MÉTODOS
	public void validarDatos() 
	throws Exception
	{				
		
		if(txtNombre.getText().length()==0 || txtPC.getText().length()==0 || txtPV.getText().length()==0 )
			throw new Exception("Campos del formulario vacios"); 
			
		
	}

	
}
