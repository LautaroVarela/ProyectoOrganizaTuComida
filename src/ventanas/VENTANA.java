package ventanas;

import java.awt.event.ActionListener;

import controladores.ControladorVentanaInicio;
import controladores.ControladorVentanaPerfil;
import controladores.ControladorVentanaRegistrarse;

public interface VENTANA 
{ 
	static void asignarControlador(ActionListener controlador) {}
	int getIdVentana();
	void mostrarVentana();
	void ocultarVentana();


 
	
}
