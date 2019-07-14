package controladores;

import ventanas.VENTANA;
import ventanas.VENTANAINICIO;
import ventanas.VENTANAREGISTRARSE;

import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cliente.CALENDARIO;
import cliente.REGISTRARSE;
import navegadores.NAVEGADOR;

public class ControladorVentanaRegistrarse implements ActionListener {

	private VENTANAREGISTRARSE ventana;
	private NAVEGADOR navegador;
	private REGISTRARSE registrarse;
	public CALENDARIO calendario;
	
	public ControladorVentanaRegistrarse(VENTANA ventana, NAVEGADOR navegador, REGISTRARSE registrarse) 
	{
		this.navegador = navegador;
        this.ventana = (VENTANAREGISTRARSE) ventana;
        this.ventana.asignarControlador(this);
        
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		{
			/*if(e.getSource() == ventana.getBtnAceptar()) {
				navegador.cambiarVentana(3, 2);
				
				String nombre = ventana.getTxtNombreUsuario().getText();
				String email = ventana.getTxtEmail().getText();
				String password = ventana.getTxtPassword().getText();
				int edad = ventana.getTxtEdad().getComponentCount();
				String biografia = ventana.getTxtBiografia().getContentType();
				//registrarse.registrar(nombre, edad, email, password, biografia, calendario);
			}*/
			
			if(e.getSource() == ventana.getBtnVolver())
			{
				navegador.cambiarVentana(3, 1);
			}
		}
		
	}
	
}
	

