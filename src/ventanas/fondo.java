package ventanas;

import javax.swing.JFrame;

public class fondo extends JFrame {
	
	public static void main(String[] args) {
		fondo f = new fondo();
		f.setSize(400,300);
		f.setVisible(true);
		panel p = new panel("/fonts,img/fondo_ventana_inicio.jpg");
		f.add(p);
	}

}
