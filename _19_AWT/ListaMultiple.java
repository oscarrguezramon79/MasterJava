package _19_AWT;

import java.awt.*;

public class ListaMultiple extends javax.swing.JFrame{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	List lm = new List (4, false);

	@SuppressWarnings("deprecation")
	public void init(){
		Button boton = new Button("Aceptar");
		List lm = new List (4, false);
		lm.addItem ("Mercurio");
		lm.addItem ("Venus");
		lm.addItem ("Tierra");
		lm.addItem ("Marte");
		lm.addItem ("Jupiter");
		add(lm);
		add(boton);
	}
	
	@SuppressWarnings("deprecation")
	public boolean action (Event evt, Object obj){

		int i= 0;
		if (evt.target instanceof Button){
			if ("Aceptar".equals (obj)){
				String seleccion [];
				seleccion = lm.getSelectedItems ();
				for (i = 0; i<seleccion.length; i++);
					System.out.println(seleccion [i]);
				}
			}
		return true;
	}

}
