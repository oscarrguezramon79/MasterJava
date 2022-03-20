package _16_MultiHilo.Comunicacion;

public class Consumir implements Runnable {
	private Cola q;
	Consumir (Cola q){
		this.q = q;
		new Thread (this, "Consumidor").start();
	}
	public void run() {
		while (true) {
			q.get();
		}
	}
}
