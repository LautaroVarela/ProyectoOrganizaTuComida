package usuario;

import java.awt.EventQueue;


import cliente.COMIDA;
import cliente.DIADECOMIDAS;
import cliente.REGISTRARSE;
import controladores.ControladorVentanaInicio;
import controladores.ControladorVentanaPerfil;
import controladores.ControladorVentanaRegistrarse;
import navegadores.NAVEGADOR;
import ventanas.VENTANA;
import ventanas.VENTANAINICIO;
import ventanas.VENTANAPERFIL;
import ventanas.VENTANAREGISTRARSE;


public class PRINCIPAL {
	
	
	public static void main(String[] args) {
		
		EventQueue.invokeLater(new Runnable() {
			



			public void run() {
				try {
					
					REGISTRARSE registrarse = new REGISTRARSE();
					COMIDA comida = new COMIDA();
					DIADECOMIDAS[] diaDeComidas = new DIADECOMIDAS[6];
					
					//construyo las ventanas con el ID como identificacion para el navegador
					VENTANAINICIO v1 = new VENTANAINICIO(1, registrarse);
					VENTANAPERFIL v2 = new VENTANAPERFIL(2, comida, diaDeComidas);
					VENTANAREGISTRARSE v3 = new VENTANAREGISTRARSE(3,registrarse);
					
					
					//construyo un solo navegador
					NAVEGADOR nav = new NAVEGADOR();
					
					//construyo los controladores (un por ventana)
					
					ControladorVentanaInicio ctrlV1 = new ControladorVentanaInicio(v1,nav, registrarse);
					ControladorVentanaPerfil ctrlV2 = new ControladorVentanaPerfil(v2,nav, comida, diaDeComidas);
					ControladorVentanaRegistrarse ctrlV3 = new ControladorVentanaRegistrarse(v3, nav, registrarse);
					
					//asignaciones a controladores
					VENTANA.asignarControlador(ctrlV1);
					VENTANA.asignarControlador(ctrlV2);
					VENTANA.asignarControlador(ctrlV3);
					
					//agrega los ventanas al navegador
					nav.agregarVentana(v1);
					nav.agregarVentana(v2);
					nav.agregarVentana(v3);
					
					//comienza el programa con la ventana seleccionada en modo visible
					v1.setVisible(true);
					v1.mostrarVentana();
					
					
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
}
