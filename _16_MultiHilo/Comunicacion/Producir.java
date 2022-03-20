package _16_MultiHilo.Comunicacion;

public class Producir implements Runnable{
	private Cola q;
	Producir (Cola q){
		this.q = q;
		new Thread (this, "Productor").start();
	}
	public void run() {
		int i =0;
		while (true) {
			q.put(i++);
		}
	}

}
