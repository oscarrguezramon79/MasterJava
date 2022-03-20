package _18_Applet;

import java.applet.Applet;
import java.awt.Graphics;



public class Hola extends Applet{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paint (Graphics p) {
		p.drawString("Hola amigos", 25, 25);
	}

}
