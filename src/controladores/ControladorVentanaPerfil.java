package controladores;

import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComponent;
import javax.swing.JTextField;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import cliente.CALENDARIO;
import cliente.COMIDA;
import cliente.DIADECOMIDAS;

import java.awt.Component;
import java.awt.Dimension;
import java.awt.Window;
import java.awt.event.ActionEvent;

import ventanas.VENTANA;
import ventanas.VENTANAPERFIL;
import navegadores.NAVEGADOR;

public class ControladorVentanaPerfil implements ActionListener{

	public NAVEGADOR navegador;
	public VENTANAPERFIL ventana;
	public JSONObject objetoComidas;
	public JSONArray listaJsonComida;
	public JTextField txtNueva2;
	public JTextField txtCaloria2;
	public JTextField txtPorcion2;
	public JTextField txtHora2;
	public Object panel_barraSemana;
	
	public ControladorVentanaPerfil(VENTANA ventana, NAVEGADOR navegador, COMIDA comida, DIADECOMIDAS[] dIADECOMIDAS) 
	
	{
		
		this.navegador= navegador;
		this.ventana=(VENTANAPERFIL) ventana;
		
		
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == ventana.getBtnCerrarsesion()) 
		{
			navegador.cambiarVentana(2, 1);
		}
		
		if (e.getSource() == ventana.getBtnLimpiarSemana()) {
				//borra todas las comidas de la semana
			objetoComidas.remove(listaJsonComida);
				
		}
		if (e.getSource() == ventana.getBtnMas()) {
			txtNueva2.setVisible(true);
			txtCaloria2.setVisible(true);
			txtPorcion2.setVisible(true);
			txtHora2.setVisible(true);
			((JComponent) panel_barraSemana).setPreferredSize(new Dimension(205, 189));
		}
			
			}
		
		
	}


