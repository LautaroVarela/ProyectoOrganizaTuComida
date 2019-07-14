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

import cliente.CALENDARIO;
import cliente.COMIDA;
import cliente.DIADECOMIDAS;
import navegadores.NAVEGADOR;
import controladores.ControladorVentanaPerfil;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JList;
import javax.swing.JTree;
import javax.swing.JSeparator;
import javax.swing.JFormattedTextField;
import javax.swing.JSlider;
import javax.swing.JScrollBar;
import javax.swing.JSpinner;
import javax.swing.JMenuItem;
import javax.swing.JCheckBoxMenuItem;
import javax.swing.JPopupMenu;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JMenuBar;
import java.awt.List;
import javax.swing.JMenu;
import java.awt.TextField;
import javax.swing.JEditorPane;
import java.awt.Choice;

public class VENTANAPERFIL extends JFrame implements VENTANA {

	private JPanel contentPane;
	private int id;
	private NAVEGADOR navegador;
	private JButton btnCerrarsesion;
	private JButton btnLimpiarSemana;
	private JButton btnLunes;
	private JButton btnMartes;
	private JButton btnMiercoles;
	private JButton btnJueves;
	private JButton btnViernes;
	private JButton btnSabado;
	private JButton btnDomingo;
	private JButton btnCerrarSesion;
	private Component lblLunes;
	private JButton btnMas;
	private JList list;
	private JTextField textField_1;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_11;
	private JTextField textField_2;
	private JTextField textField_12;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JSeparator separator_1;
	private JTextField textField;
	private JTextField textField_6;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_16;
	private JTextField textField_17;

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
		
		JPanel panel_2 = new JPanel();
		panel_2.setLayout(null);
		panel_2.setBackground(new Color(102, 153, 102));
		panel_2.setBounds(260, 83, 245, 243);
		contentPane.add(panel_2);
		
		list = new JList();
		list.setBounds(90, 121, 56, -62);
		panel_2.add(list);
		
		JMenu mnNewMenu = new JMenu("New menu");
		mnNewMenu.setBounds(10, 35, 107, 22);
		panel_2.add(mnNewMenu);
		
		textField_3 = new JTextField();
		mnNewMenu.add(textField_3);
		textField_3.setColumns(10);
		
		textField_1 = new JTextField();
		mnNewMenu.add(textField_1);
		textField_1.setColumns(10);
		
		btnCerrarSesion = new JButton("Cerrar Sesi\u00F3n");
		btnCerrarSesion.setBounds(32, 10, 97, 23);
		contentPane.add(btnCerrarSesion);
		
		btnLimpiarSemana = new JButton("Limpiar Semana");
		btnLimpiarSemana.setBounds(134, 10, 107, 23);
		contentPane.add(btnLimpiarSemana);
		
		JPanel panel_barraSemana = new JPanel();
		panel_barraSemana.setBounds(32, 44, 205, 430);
		panel_barraSemana.setBackground(new Color(102, 153, 102));
		contentPane.add(panel_barraSemana);
		panel_barraSemana.setLayout(null);
		
		lblLunes = new JLabel("LUNES");
		lblLunes.setBounds(87, 5, 31, 14);
		panel_barraSemana.add(lblLunes);
		
		btnMas = new JButton("+");
		btnMas.setBounds(77, 396, 41, 23);
		panel_barraSemana.add(btnMas);
		
		textField_4 = new JTextField();
		textField_4.setColumns(10);
		textField_4.setBounds(50, 30, 142, 20);
		panel_barraSemana.add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setBounds(10, 30, 36, 20);
		panel_barraSemana.add(textField_5);
		textField_5.setColumns(10);
		
		textField_11 = new JTextField();
		textField_11.setColumns(10);
		textField_11.setBounds(123, 51, 69, 20);
		panel_barraSemana.add(textField_11);
		
		JSeparator separator = new JSeparator();
		separator.setBounds(10, 83, 182, 14);
		panel_barraSemana.add(separator);
		separator.setBackground(new Color(102, 204, 102));
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(50, 51, 69, 20);
		panel_barraSemana.add(textField_2);
		
		textField_12 = new JTextField();
		textField_12.setColumns(10);
		textField_12.setBounds(10, 100, 36, 20);
		panel_barraSemana.add(textField_12);
		
		textField_13 = new JTextField();
		textField_13.setColumns(10);
		textField_13.setBounds(50, 100, 142, 20);
		panel_barraSemana.add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setColumns(10);
		textField_14.setBounds(50, 121, 69, 20);
		panel_barraSemana.add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setColumns(10);
		textField_15.setBounds(123, 121, 69, 20);
		panel_barraSemana.add(textField_15);
		
		separator_1 = new JSeparator();
		separator_1.setBackground(new Color(102, 204, 102));
		separator_1.setBounds(10, 224, 182, 14);
		panel_barraSemana.add(separator_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(50, 171, 142, 20);
		panel_barraSemana.add(textField);
		
		textField_6 = new JTextField();
		textField_6.setColumns(10);
		textField_6.setBounds(10, 171, 36, 20);
		panel_barraSemana.add(textField_6);
		
		textField_7 = new JTextField();
		textField_7.setColumns(10);
		textField_7.setBounds(50, 192, 69, 20);
		panel_barraSemana.add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setColumns(10);
		textField_8.setBounds(123, 192, 69, 20);
		panel_barraSemana.add(textField_8);
		
		textField_9 = new JTextField();
		textField_9.setColumns(10);
		textField_9.setBounds(50, 241, 142, 20);
		panel_barraSemana.add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setColumns(10);
		textField_10.setBounds(123, 262, 69, 20);
		panel_barraSemana.add(textField_10);
		
		textField_16 = new JTextField();
		textField_16.setColumns(10);
		textField_16.setBounds(50, 262, 69, 20);
		panel_barraSemana.add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setColumns(10);
		textField_17.setBounds(10, 241, 36, 20);
		panel_barraSemana.add(textField_17);
		
		JPanel panel = new JPanel();
		panel.setLayout(null);
		panel.setBackground(new Color(102, 153, 102));
		panel.setBounds(10, 485, 964, 65);
		contentPane.add(panel);
		
		
		
		
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
	
	
	/**
	 * @return the btnMas
	 */
	public JButton getBtnMas() {
		return btnMas;
	}


	/**
	 * @param btnMas the btnMas to set
	 */
	public void setBtnMas(JButton btnMas) {
		this.btnMas = btnMas;
	}


	public void asignarControlador(ActionListener ctrlV2) {
		btnLunes.addActionListener(ctrlV2);
		btnMartes.addActionListener(ctrlV2);
		btnMiercoles.addActionListener(ctrlV2);
		btnJueves.addActionListener(ctrlV2);
		btnViernes.addActionListener(ctrlV2);
		btnSabado.addActionListener(ctrlV2);
		btnDomingo.addActionListener(ctrlV2);
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
	private static void addPopup(Component component, final JPopupMenu popup) {
	}
}
