package _21_SWING;

import java.awt.*;

public class Adaptadores {

	@SuppressWarnings("unused")
	public static void main (String args[]) {
		Frame ventana = new Frame();
		ventana.setSize(400,200);
		ventana.setTitle("Escuchar eventos de ventana");
		ventana.setVisible(true);
		Escuchador escuchador = new Escuchador(ventana);
		Adaptador adaptador = new Adaptador(ventana);
		//Probar cada uno de los dos metodos. El resultado es identico
		ventana.addWindowListener(escuchador);
		//ventana.addWindowListener(adaptador);
	}
}
