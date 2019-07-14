package ventanas;

import java.awt.EventQueue;

import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.UIManager;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Color;
import java.awt.Component;
import java.awt.Dimension;

import javax.swing.JTextPane;

import javax.swing.JPasswordField;

import cliente.REGISTRARSE;

import ventanas.fondo;
import ventanas.panel;

import javax.swing.JTextField;
import java.awt.SystemColor;
import java.awt.Window;

public class VENTANAINICIO extends JFrame implements VENTANA {

	
	
	private JPanel contentPane;
	private int id;
	private JTextPane TextoBienvenida;
	private JTextField txtNombreDeUsuario;
	private JButton btnIngresar;
	private JButton btnRegistrarse;
	private JPasswordField txtPassword;
	private JTextField txtNombreUsuario;
	public JButton getBtnIngresar;
	private JPanel panel_ingresar;
	private JPanel panel_imagen;
	private JPanel panel_registrarse;
	private ImageIcon imagen;
	private ImageIcon fondo;
	boolean ImageIcon;
	
	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			private REGISTRARSE registrarse;

			public void run() {
				try {
					VENTANAINICIO frame = new VENTANAINICIO(1, registrarse);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				fondo f = new fondo();
				f.setSize(400,300);
				f.setVisible(true);
				panel p = new panel("/fonts,img/fondo_ventana_inicio.jpg");
				f.getContentPane().add(p);
			}
		});
	}

	/**
	 * Create the frame.
	 * @param registrarse 
	 */
	public VENTANAINICIO(int id, REGISTRARSE registrarse) {
		setBackground(Color.LIGHT_GRAY);
		this.id = id;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(SystemColor.menu);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		
		panel_imagen = new JPanel();
		panel_imagen.setBounds(0, 0, 92, 64);
		
		imagen = new ImageIcon("C://TP FINAL 2/fonts,img/fondo_ventana_inicio.jpg");
		
		fondo = new ImageIcon(imagen.getImage().getScaledInstance(panel_imagen.getWidth(), panel_imagen.getHeight(), Image.SCALE_DEFAULT));
		
		contentPane.add(panel_imagen);
		
	
		panel_imagen.setVisible(true);
		
		TextoBienvenida = new JTextPane();
		TextoBienvenida.setBackground(SystemColor.menu);
		TextoBienvenida.setBounds(44, 67, 366, 108);
		contentPane.add(TextoBienvenida);
		TextoBienvenida.setEditable(false);
		TextoBienvenida.setForeground(new Color(0, 100, 0));
		TextoBienvenida.setFont(new Font("Bebas Neue", Font.PLAIN, 30));
		TextoBienvenida.setText("Organiz\u00E1 tus d\u00EDas, \r\nDescubr\u00ED recetas nuevas, \r\nBienvenidx a tu nuevo estilo de vida.");
		
		panel_ingresar = new JPanel();
		panel_ingresar.setBackground(new Color(0, 100, 0));
		panel_ingresar.setBounds(631, 67, 277, 255);
		contentPane.add(panel_ingresar);
		panel_ingresar.setLayout(null);
		
		btnIngresar = new JButton("Ingresar");
		btnIngresar.setBounds(97, 194, 89, 23);
		panel_ingresar.add(btnIngresar);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(76, 118, 134, 20);
		panel_ingresar.add(txtPassword);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setBounds(76, 67, 134, 20);
		panel_ingresar.add(txtNombreUsuario);
		txtNombreUsuario.setColumns(10);
		
		panel_registrarse = new JPanel();
		panel_registrarse.setBackground(new Color(0, 100, 0));
		panel_registrarse.setBounds(631, 333, 277, 199);
		contentPane.add(panel_registrarse);
		panel_registrarse.setLayout(null);
		
		btnRegistrarse = new JButton("Registrarse");
		btnRegistrarse.setBounds(85, 83, 108, 23);
		panel_registrarse.add(btnRegistrarse);
		
		
	}
		//1 cada elemento que creamos tenemos que iniciarlizarlo en los atributos
		//2 generamos los getters y setters por cada elemento
		//3 ingresar los elementos que tienen "accion" o sea botones en el metodo AsignarControlador
		//4 vamos a la clase del controlador correspondiente a la ventana y en el metodo  actionPerformed(ActionEvent e) agregamos las acciones de los botones
		
	


	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}
	public JTextPane getTextoBienvenida() {
		return TextoBienvenida;
	}

	public void setTextoBienvenida(JTextPane textoBienvenida) {
		TextoBienvenida = textoBienvenida;
	}
	
	public JTextField getTxtNombreDeUsuario() {
		return txtNombreDeUsuario;
	}

	public void setTxtNombreDeUsuario(JTextField txtNombreDeUsuario) {
		this.txtNombreDeUsuario = txtNombreDeUsuario;
	}

	public JButton getBtnIngresar() {
		return btnIngresar;
	}

	public void setBtnIngresar(JButton btnIngresar) {
		this.btnIngresar = btnIngresar;
	}

	public JButton getBtnRegistrarse() {
		return btnRegistrarse;
	}

	public void setBtnRegistrarse(JButton btnRegistrarse) {
		this.btnRegistrarse = btnRegistrarse;
	}

	public JPasswordField getTxtPassword() {
		return txtPassword;
	}

	public void setTxtPassword(JPasswordField txtPassword) {
		this.txtPassword = txtPassword;
	}

	public JTextField getTxtNombreUsuario() {
		return txtNombreUsuario;
	}

	public void setTxtNombreUsuario(JTextField txtNombreUsuario) {
		this.txtNombreUsuario = txtNombreUsuario;
	}

	public void asignarControlador(ActionListener ctrlV1) {
		
		btnRegistrarse.addActionListener(ctrlV1);
		btnIngresar.addActionListener(ctrlV1);
	}

	@Override
	public int getIdVentana() {
		return this.id;
	}

	public void mostrarVentana()
	{
		show();
	}
	public void ocultarVentana()
	{
		dispose();
	}
}

