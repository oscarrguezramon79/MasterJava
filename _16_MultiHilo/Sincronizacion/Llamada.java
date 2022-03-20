package _16_MultiHilo.Sincronizacion;

import _16_MultiHilo.Sincronizacion.Mensaje;

public class Llamada implements Runnable {
	private String texto;
	private Mensaje mensaje;
	Thread t;
	Llamada (Mensaje msg, String s){
		this.mensaje = msg;
		this.texto = s;
		t = new Thread (this);
		t.start();
	}
	
	public void  run() {
		this.mensaje.msg(this.texto);
	}
}
