import modulos.*;
import java.util.*;
import java.awt.BorderLayout;
import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.LineBorder;
import java.awt.Color;


public class frmProducto extends JFrame {
	//VARIABLES DEL FORMULARIO
	private JPanel contentPane;
	private JTable tbProducto;
	public frmRegProducto RegProd=new frmRegProducto();
	public static DefaultTableModel tbm=new DefaultTableModel();
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmProducto frame = new frmProducto();
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
	public frmProducto() {
		setBackground(Color.WHITE);
		setResizable(false);
		setFont(new Font("Serif", Font.BOLD, 14));
		setTitle("Productos");
		//setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLabel lblListaDeProductos = new JLabel("Lista de Productos disponibles");
		contentPane.add(lblListaDeProductos, BorderLayout.NORTH);
		
		//TABLA CON UN MODELO HECHO POR CÓDIGO
		
		Vector<String> row=new Vector<String>();
		row.add("Codigo");
		row.add("Nombre");
		row.add("Precio Compra");
		row.add("Precio Venta");
		
		//columnas
		tbm.addColumn("Codigo");
		tbm.addColumn("Nombre");
		tbm.addColumn("Precio Compra");
		tbm.addColumn("Precio Venta");
		
		tbm.addRow(row);
		
		tbProducto = new JTable(tbm);
		tbProducto.setEnabled(false);
		
		tbProducto.setBorder(new LineBorder(new Color(0, 0, 0)));
		tbProducto.setCellSelectionEnabled(false);
		
		
		contentPane.add(tbProducto, BorderLayout.CENTER);
		
		//Nuevo Botón para añadir Un nuevo producto
		//-----------------Botón Nuevo Producto-----------------------
		//--------------------INICIO------------------------
		JButton btnNuevoProducto = new JButton("Añadir Nuevo Producto");
			//al hacer click
		//btnNuevoProducto
		btnNuevoProducto.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				
				frmProducto.this.RegProd.show();
				
				
			}
		});
		contentPane.add(btnNuevoProducto, BorderLayout.SOUTH);		
		//--------------------FIN------------------------
	}
	public static void addRowToTable(Producto Prod)
	{
		tbm.addRow(Prod.getProducto());
		
	}
}
