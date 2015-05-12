import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import java.awt.Color;

import javax.swing.JOptionPane;
import javax.swing.JToolBar;
import javax.swing.JDesktopPane;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JMenu;

import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;


public class frmSolaris extends JFrame {

	private JPanel contentPane;
	public frmProducto ProdPL=new frmProducto();
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					frmSolaris frame = new frmSolaris();
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
	public frmSolaris() {
		setFont(new Font("Serif", Font.BOLD, 14));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle("Solaris");
		setBounds(100, 100, 450, 300);
		
		JMenuBar menuBar = new JMenuBar();
		menuBar.setBackground(new Color(50, 205, 50));
		setJMenuBar(menuBar);
		
		JMenu mnProducto = new JMenu("Producto");
		mnProducto.setForeground(Color.WHITE);
		mnProducto.setFont(new Font("Serif", Font.BOLD, 14));
		menuBar.add(mnProducto);
		//-------------------MENU ---------------------
		//------------------INICIO-------------------
		JMenu mnProductoLP = new JMenu("Lista de Productos");
		mnProductoLP.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {				
				frmSolaris.this.ProdPL.show();					
			}
		});
		mnProductoLP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
						
			}
		});
		mnProductoLP.setFont(new Font("Serif", Font.BOLD, 14));
		mnProductoLP.setBackground(new Color(50, 205, 50));		
		//--------------------FIN---------------------
		
		mnProducto.add(mnProductoLP);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
