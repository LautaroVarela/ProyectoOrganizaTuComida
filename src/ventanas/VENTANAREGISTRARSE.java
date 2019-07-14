package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Image;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;

import com.placeholder.PlaceHolder;

import cliente.CALENDARIO;
import cliente.REGISTRARSE;
import javax.swing.JEditorPane;
import javax.swing.JProgressBar;
import javax.swing.JTextArea;
import javax.swing.JFormattedTextField;
import java.awt.Font;
import java.awt.Component;
import java.awt.event.KeyEvent;
import javax.swing.SwingConstants;
import javax.swing.JSpinner;
import javax.swing.JComboBox;

public class VENTANAREGISTRARSE extends JFrame implements VENTANA {

	CALENDARIO calendario;
	private JPanel contentPane;
	private int id;
	private JTextField txtNombreUsuario;
	private JTextField txtEmail;
	private JPasswordField txtPassword;
	private JEditorPane txtBiografia;
	private JLabel lblContanosSobreT;
	private JLabel lblRegistrate;
	private JButton btnAceptar;
	private JLabel label;
	private JPanel panel;
	private JButton btnVolver;
	private JSpinner txtEdad;
	private Component lblEdad;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			private REGISTRARSE registrarse;

			public void run() {
				try {
					VENTANAREGISTRARSE v3 = new VENTANAREGISTRARSE(3, registrarse);
					v3.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public VENTANAREGISTRARSE(int id, REGISTRARSE registrarse) {
		this.id = id;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(UIManager.getColor("RadioButton.interiorBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		label = new JLabel("");
		Image fondo = new ImageIcon(this.getClass().getResource("/fondo.JPG")).getImage();
		
		panel = new JPanel();
		panel.setBackground(new Color(0, 100, 0));
		panel.setBounds(339, 39, 319, 434);
		contentPane.add(panel);
		panel.setLayout(null);
		
		txtNombreUsuario = new JTextField();
		txtNombreUsuario.setBounds(73, 63, 167, 20);
		PlaceHolder holderUsuario = new PlaceHolder(txtNombreUsuario, "Nombre de Usuario");
		panel.add(txtNombreUsuario, holderUsuario);
		txtNombreUsuario.setColumns(10);
		
		txtEmail = new JTextField();
		txtEmail.setBounds(73, 94, 167, 20);
		PlaceHolder holderEmail = new PlaceHolder(txtEmail, "Escriba su correo electrónico");
		panel.add(txtEmail, holderEmail);
		txtEmail.setColumns(10);
		
		txtPassword = new JPasswordField();
		txtPassword.setBounds(73, 125, 167, 20);
		PlaceHolder holderPassword = new PlaceHolder(txtPassword, "Creá tu contraseña");
		panel.add(txtPassword, holderPassword);
		
		txtBiografia = new JEditorPane();
		txtBiografia.setBounds(73, 219, 167, 129);
		panel.add(txtBiografia);
		
		lblContanosSobreT = new JLabel("Contanos sobre t\u00ED.");
		lblContanosSobreT.setForeground(new Color(255, 255, 255));
		lblContanosSobreT.setFont(UIManager.getFont("ColorChooser.font"));
		lblContanosSobreT.setBounds(73, 204, 101, 14);
		panel.add(lblContanosSobreT);
		
		lblRegistrate = new JLabel("REGISTRATE");
		lblRegistrate.setForeground(new Color(255, 255, 255));
		lblRegistrate.setFont(new Font("Tahoma", Font.PLAIN, 20));
		lblRegistrate.setHorizontalAlignment(SwingConstants.CENTER);
		lblRegistrate.setDisplayedMnemonic(KeyEvent.VK_ENTER);
		lblRegistrate.setAlignmentX(Component.CENTER_ALIGNMENT);
		lblRegistrate.setBounds(39, 0, 232, 49);
		panel.add(lblRegistrate);
		
		btnAceptar = new JButton("Aceptar");
		btnAceptar.setBounds(202, 385, 89, 23);
		panel.add(btnAceptar);
		
		btnVolver = new JButton("Volver");
		btnVolver.setBounds(26, 385, 89, 23);
		panel.add(btnVolver);
		
		txtEdad = new JSpinner();
		txtEdad.setBounds(114, 156, 42, 20);
		panel.add(txtEdad);
		
		lblEdad = new JLabel("Edad:");
		lblEdad.setForeground(Color.WHITE);
		lblEdad.setFont(UIManager.getFont("ColorChooser.font"));
		lblEdad.setBounds(73, 162, 101, 14);
		panel.add(lblEdad);
		
		label.setIcon(new ImageIcon(fondo));
		label.setBounds(0, 0, 984, 561);
		contentPane.add(label);
		
		
	}
	

	public JTextField getTxtNombreUsuario() {
		return txtNombreUsuario;
	}
	public void setTxtNombreUsuario(JTextField txtNombreUsuario) {
		this.txtNombreUsuario = txtNombreUsuario;
	}
	public JTextField getTxtEmail() {
		return txtEmail;
	}
	public void setTxtEmail(JTextField txtEmail) {
		this.txtEmail = txtEmail;
	}
	public JPasswordField getTxtPassword() {
		return txtPassword;
	}
	public void setTxtPassword(JPasswordField txtPassword) {
		this.txtPassword = txtPassword;
	}
	public JEditorPane getTxtBiografia() {
		return txtBiografia;
	}
	public void setTxtBiografia(JEditorPane txtBiografia) {
		this.txtBiografia = txtBiografia;
	}
	public JSpinner getTxtEdad() {
		return txtEdad;
	}
	public void setTxtEdad(JSpinner txtEdad) {
		this.txtEdad = txtEdad;
	}

	public JButton getBtnVolver() {
		return btnVolver;
	}
	public void setBtnVolver(JButton btnVolver) {
		this.btnVolver = btnVolver;
	}
	public JButton getBtnAceptar() {
		return btnAceptar;
	}
	public void setBtnAceptar(JButton btnAceptar) {
		this.btnAceptar = btnAceptar;
	}

	
	
public void asignarControlador(ActionListener ctrlV3) {
		
		btnAceptar.addActionListener(ctrlV3);
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
