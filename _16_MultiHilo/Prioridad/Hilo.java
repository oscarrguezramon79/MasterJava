package _16_MultiHilo.Prioridad;

public class Hilo implements Runnable {
	Thread t;
	int accesos = 0;
	private boolean salirB = false;
	
	Hilo (int prioridad){
		t = new Thread (this, "Hilo hijo");
		t.setPriority(prioridad);
	}
	
	public void run() {
		while (! salirB)
			accesos ++;
	}
	void parar () {salirB = true;}
	void comenzar() {t.start ();}
}
