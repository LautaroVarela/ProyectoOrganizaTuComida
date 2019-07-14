package navegadores;

import java.util.HashMap;

import ventanas.VENTANA;

public class NAVEGADOR 
{
	
	NAVEGADOR navegador;

private HashMap<Integer, VENTANA> contenedor;
	
	public NAVEGADOR() 
	{
		contenedor = new HashMap<Integer, VENTANA>();
	}
	
	public NAVEGADOR getNavegador() {
		return navegador;
	}
	public void setNavegador(NAVEGADOR navegador) {
		this.navegador = navegador;
	}



	public void agregarVentana(VENTANA v)
	{
		contenedor.put(v.getIdVentana(), v);
	}
	
	public VENTANA getVentana(Integer llave)
	{
		return contenedor.get(llave);
	}
	
	
	
	public void cambiarVentana(int idVentanaActual, int idVentanaSiguiente)
	{
		VENTANA ventanaActual = contenedor.get(idVentanaActual);
		VENTANA ventanaSiguiente = contenedor.get(idVentanaSiguiente);
		intercambiarVentanas(ventanaActual, ventanaSiguiente);
	}

	private void intercambiarVentanas(VENTANA ventanaActual, VENTANA ventanaSiguiente) 
	{
		ventanaActual.ocultarVentana();
		ventanaSiguiente.mostrarVentana();
	}
	
}
