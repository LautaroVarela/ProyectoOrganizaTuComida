package controladores;

import ventanas.VENTANA;
import ventanas.VENTANAINICIO;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import cliente.REGISTRARSE;
import navegadores.NAVEGADOR;

public class ControladorVentanaInicio  implements ActionListener {

	private VENTANAINICIO ventana;
	private NAVEGADOR navegador;
	
	
	public ControladorVentanaInicio (VENTANA ventana, NAVEGADOR nav, REGISTRARSE registrarse) 
	{
		this.navegador = nav;
		this.ventana = (VENTANAINICIO) ventana;
		this.ventana.asignarControlador(this);
	}


	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource() == ventana.getBtnIngresar()) {
			
			navegador.cambiarVentana(1,2);
			
		}
		
		
		if(e.getSource() == ventana.getBtnRegistrarse()) {
			
			navegador.cambiarVentana(2,3);
			
		}

}





	





	
}