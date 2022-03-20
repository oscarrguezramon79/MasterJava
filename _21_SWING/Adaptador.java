package _21_SWING;

import java.awt.Frame;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class Adaptador extends WindowAdapter {
	private Frame marco;
	Adaptador (Frame marco){
		this.marco = marco;
	}
	public void windowClosing (WindowEvent evt) {
		System.out.println("Cerrando ventana");
		marco.setVisible(false);
		System.exit(0);
	}
}
