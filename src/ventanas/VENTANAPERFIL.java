package ventanas;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;
import java.awt.event.ActionListener;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.UIManager;
import javax.swing.border.EmptyBorder;
import com.placeholder.PlaceHolder;

import cliente.CALENDARIO;
import cliente.COMIDA;
import cliente.DIADECOMIDAS;
import navegadores.NAVEGADOR;
import controladores.ControladorVentanaPerfil;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JDesktopPane;

public class VENTANAPERFIL extends JFrame implements VENTANA {

	public JPanel contentPane;
	public int id;
	public NAVEGADOR navegador;
	public JButton btnCerrarsesion;
	public JButton btnLimpiarSemana;
	public JButton btnLunes;
	public JButton btnMartes;
	public JButton btnMiercoles;
	public JButton btnJueves;
	public JButton btnViernes;
	public JButton btnSabado;
	public JButton btnDomingo;
	public JButton btnCerrarSesion;
	public JLabel lblLunes;
	public JButton btnMas;
	public JTextField txtNueva1;
	public JTextField txtHora1;
	public JTextField txtPorcion1;
	public JTextField txtCaloria1;
	public JTextField txtHora2;
	public JTextField txtNueva2;
	public JTextField txtCaloria2;
	public JTextField txtPorcion2;
	public JTextField txtNueva3;
	public JTextField txtHora3;
	public JTextField txtCaloria3;
	public JTextField txtPorcion3;
	public JTextField txtNueva4;
	public JTextField txtPorcion4;
	public JTextField txtCaloria4;
	public JTextField txtHora4;
	public JTextField txtNueva5;
	public JTextField txtHora5;
	public JTextField txtCaloria5;
	public JTextField txtPorcion5;
	public JTextField txtNueva6;
	public JTextField txtHora6;
	public JTextField txtCaloria6;
	public JTextField txtPorcion6;
	public JPanel panel_barraSemana;
	public JPanel panelBarraUsuario;

	public static void main(String[] args) {
	}

	
	public VENTANAPERFIL(int id, COMIDA comida, DIADECOMIDAS[] diaDeComidas) {
		this.id = id;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1000, 600);
		contentPane = new JPanel();
		contentPane.setForeground(new Color(255, 255, 255));
		contentPane.setBackground(UIManager.getColor("RadioButton.interiorBackground"));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		btnCerrarSesion = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesion.setBounds(32, 10, 97, 23);
		contentPane.add(btnCerrarSesion);
		
		btnLimpiarSemana = new JButton("Limpiar Semana");
		btnLimpiarSemana.setBounds(134, 10, 107, 23);
		contentPane.add(btnLimpiarSemana);
		
		panel_barraSemana = new JPanel();
		panel_barraSemana.setBounds(32, 44, 205, 430);
		panel_barraSemana.setBackground(new Color(102, 153, 102));
		contentPane.add(panel_barraSemana);
		panel_barraSemana.setLayout(null);
		
		lblLunes = new JLabel("LUNES");
		lblLunes.setFont(new Font("Tahoma", Font.BOLD, 19));
		lblLunes.setForeground(new Color(255, 255, 255));
		lblLunes.setBackground(new Color(255, 255, 255));
		lblLunes.setBounds(77, 0, 69, 29);
		panel_barraSemana.add(lblLunes);
		
		btnMas = new JButton("+");
		btnMas.setBounds(77, 382, 55, 37);
		panel_barraSemana.add(btnMas);
		
		//Nueva comida
		txtNueva1 = new JTextField();
		txtNueva1.setBackground(new Color(240, 255, 240));
		txtNueva1.setColumns(10);
		txtNueva1.setBounds(50, 30, 142, 20);
		PlaceHolder holder = new PlaceHolder(txtNueva1, "Inserte nueva comida");
		panel_barraSemana.add(txtNueva1, holder);

		txtNueva3 = new JTextField();
		txtNueva3.setBackground(new Color(240, 255, 240));
		txtNueva3.setColumns(10);
		txtNueva3.setBounds(50, 142, 142, 20);
		PlaceHolder holder1 = new PlaceHolder(txtNueva3, "Inserte nueva comida");
		txtNueva3.setVisible(false);
		panel_barraSemana.add(txtNueva3, holder1);
		
		txtNueva2 = new JTextField();
		txtNueva2.setBackground(new Color(240, 255, 240));
		txtNueva2.setColumns(10);
		txtNueva2.setBounds(50, 90, 142, 20);
		PlaceHolder holder2 = new PlaceHolder(txtNueva2, "Inserte nueva comida");
		txtNueva2.setVisible(false);
		panel_barraSemana.add(txtNueva2, holder2);
		
		txtNueva4 = new JTextField();
		txtNueva4.setBackground(new Color(240, 255, 240));
		txtNueva4.setColumns(10);
		txtNueva4.setBackground(new Color(240, 255, 240));
		txtNueva4.setBounds(50, 194, 142, 20);
		PlaceHolder holder3 = new PlaceHolder(txtNueva4, "Inserte nueva comida");
		txtNueva4.setVisible(false);
		panel_barraSemana.add(txtNueva4, holder3);

		txtNueva5 = new JTextField();
		txtNueva5.setColumns(10);
		txtNueva5.setBackground(new Color(240, 255, 240));
		txtNueva5.setBounds(50, 246, 142, 20);
		PlaceHolder holder4 = new PlaceHolder(txtNueva5, "Inserte nueva comida");
		txtNueva5.setVisible(false);
		panel_barraSemana.add(txtNueva5, holder4);
		
		txtNueva6 = new JTextField();
		txtNueva6.setColumns(10);
		txtNueva6.setBackground(new Color(240, 255, 240));
		txtNueva6.setBounds(50, 298, 142, 20);
		PlaceHolder holder5 = new PlaceHolder(txtNueva6, "Inserte nueva comida");
		txtNueva6.setVisible(false);
		panel_barraSemana.add(txtNueva6, holder5);
		
		//hora
		txtHora1 = new JTextField();
		txtHora1.setBackground(new Color(255, 222, 173));
		txtHora1.setBounds(10, 30, 36, 20);
		panel_barraSemana.add(txtHora1);
		txtHora1.setColumns(10);
		
		txtHora6 = new JTextField();
		txtHora6.setColumns(10);
		txtHora6.setBackground(new Color(255, 222, 173));
		txtHora6.setBounds(10, 298, 36, 20);
		panel_barraSemana.add(txtHora6);
		txtHora6.setVisible(false);

		txtHora3 = new JTextField();
		txtHora3.setBackground(new Color(255, 222, 173));
		txtHora3.setColumns(10);
		txtHora3.setBounds(10, 142, 36, 20);
		panel_barraSemana.add(txtHora3);
		txtHora3.setVisible(false);

		txtHora4 = new JTextField();
		txtHora4.setBackground(new Color(255, 222, 173));
		txtHora4.setColumns(10);
		txtHora4.setBounds(10, 194, 36, 20);
		panel_barraSemana.add(txtHora4);
		txtHora4.setVisible(false);
		
		txtHora2 = new JTextField();
		txtHora2.setBackground(new Color(255, 222, 173));
		txtHora2.setColumns(10);
		txtHora2.setBounds(10, 90, 36, 20);
		panel_barraSemana.add(txtHora2);
		txtHora2.setVisible(false);
		
		txtHora5 = new JTextField();
		txtHora5.setColumns(10);
		txtHora5.setBackground(new Color(255, 222, 173));
		txtHora5.setBounds(10, 246, 36, 20);
		panel_barraSemana.add(txtHora5);
		txtHora5.setVisible(false);
		
		//Calorias
		
		txtCaloria3 = new JTextField();
		txtCaloria3.setColumns(10);
		txtCaloria3.setBounds(50, 163, 69, 20);
		panel_barraSemana.add(txtCaloria3);
		txtCaloria3.setVisible(false);
		
		txtCaloria4 = new JTextField();
		txtCaloria4.setColumns(10);
		txtCaloria4.setBounds(50, 215, 69, 20);
		panel_barraSemana.add(txtCaloria4);
		txtCaloria4.setVisible(false);
		
		txtCaloria5 = new JTextField();
		txtCaloria5.setColumns(10);
		txtCaloria5.setBounds(50, 267, 69, 20);
		panel_barraSemana.add(txtCaloria5);
		txtCaloria5.setVisible(false);
		
		
		txtCaloria6 = new JTextField();
		txtCaloria6.setColumns(10);
		txtCaloria6.setBounds(50, 319, 69, 20);
		panel_barraSemana.add(txtCaloria6);
		txtCaloria6.setVisible(false);
		
		txtCaloria1 = new JTextField();
		txtCaloria1.setColumns(10);
		txtCaloria1.setBounds(50, 51, 69, 20);
		panel_barraSemana.add(txtCaloria1);

		txtCaloria2 = new JTextField();
		txtCaloria2.setColumns(10);
		txtCaloria2.setBounds(50, 111, 69, 20);
		panel_barraSemana.add(txtCaloria2);
		txtCaloria2.setVisible(false);
		
		//Porciones
		
		txtPorcion6 = new JTextField();
		txtPorcion6.setColumns(10);
		txtPorcion6.setBounds(123, 319, 69, 20);
		panel_barraSemana.add(txtPorcion6);
		txtPorcion6.setVisible(false);
		
		
	    txtPorcion1 = new JTextField();
		txtPorcion1.setColumns(10);
		txtPorcion1.setBounds(123, 51, 69, 20);
		panel_barraSemana.add(txtPorcion1);
		
		txtPorcion5 = new JTextField();
		txtPorcion5.setColumns(10);
		txtPorcion5.setBounds(123, 267, 69, 20);
		panel_barraSemana.add(txtPorcion5);
		txtPorcion5.setVisible(false);
		
		txtPorcion2 = new JTextField();
		txtPorcion2.setColumns(10);
		txtPorcion2.setBounds(123, 111, 69, 20);
		panel_barraSemana.add(txtPorcion2);
		txtPorcion2.setVisible(false);
		
		txtPorcion3 = new JTextField();
		txtPorcion3.setColumns(10);
		txtPorcion3.setBounds(123, 163, 69, 20);
		panel_barraSemana.add(txtPorcion3);
		txtPorcion3.setVisible(false);
		
		txtPorcion4 = new JTextField();
		txtPorcion4.setColumns(10);
		txtPorcion4.setBounds(123, 215, 69, 20);
		panel_barraSemana.add(txtPorcion4);
		txtPorcion4.setVisible(false);
		
		
		
		panelBarraUsuario = new JPanel();
		panelBarraUsuario.setBackground(new Color(102, 153, 102));
		panelBarraUsuario.setBounds(10, 485, 964, 65);
		contentPane.add(panelBarraUsuario);
		panelBarraUsuario.setLayout(null);
		
		
		
		
	}
	
	
	
	
	

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public NAVEGADOR getNavegador() {
		return navegador;
	}

	public void setNavegador(NAVEGADOR navegador) {
		this.navegador = navegador;
	}

	public JButton getBtnCerrarsesion() {
		return btnCerrarsesion;
	}

	public void setBtnCerrarsesion(JButton btnCerrarsesion) {
		this.btnCerrarsesion = btnCerrarsesion;
	}

	public JButton getBtnLimpiarSemana() {
		return btnLimpiarSemana;
	}

	public void setBtnLimpiarSemana(JButton btnLimpiarSemana) {
		this.btnLimpiarSemana = btnLimpiarSemana;
	}
	public JButton getBtnMas() {
		return btnMas;
	}
	public void setBtnMas(JButton btnMas) {
		this.btnMas = btnMas;
	}


	public void asignarControlador(ActionListener ctrlV2) {
		btnCerrarsesion.addActionListener(ctrlV2);
		btnLimpiarSemana.addActionListener(ctrlV2);
		btnMas.addActionListener(ctrlV2);
		
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
