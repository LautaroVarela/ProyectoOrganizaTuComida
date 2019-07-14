package ventanas;

import java.awt.Dimension;
import java.awt.Graphics;

import javax.swing.ImageIcon;
import javax.swing.JPanel;

public class panel extends JPanel{
	ImageIcon imagen;
	String nombre;
	
	public panel(String nombre) {
		this.nombre=nombre;
		
	}
	
	public void paint(Graphics g) {
		Dimension bounds = getSize();
		imagen=new ImageIcon(getClass().getResource(nombre));
		g.drawImage(imagen.getImage(), 0, 0, bounds.width, bounds.height, null);
		setOpaque(false);
		super.paint(g);
	}

}
