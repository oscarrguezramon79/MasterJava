package _21_SWING;

import java.awt.Frame;
import java.awt.event.*;

public class Escuchador implements WindowListener {
	private Frame marco;
	Escuchador (Frame marco){
		this.marco = marco;
	}
	public void windowClosed(WindowEvent evt) {}
	public void windowIcodified(WindowEvent evt) {}
	public void windowOpened(WindowEvent evt) {}
	public void windowClosing(WindowEvent evt) {
		System.out.println("Cerrando ventana");
		marco.setVisible(false);
		System.exit(0);
	}
	public void windowDeiconified(WindowEvent evt) {}
	public void windowActivated(WindowEvent evt) {}
	public void windowDeactivated(WindowEvent evt) {}
	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		
	}
	
}
