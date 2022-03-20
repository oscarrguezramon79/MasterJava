package _16_MultiHilo.Comunicacion;

public class Cola {
	int n;
	boolean setValor = false;
	synchronized int get() {
		try {
			wait();
		}
		catch (InterruptedException e) {
			System.out.println ("Se captura la exception");
		}
		System.out.println("Consume: " + n);
		setValor = false;
		notify();
		return n;
	}
	
	synchronized void put (int n) {
		try {
			wait();
		}
		catch (InterruptedException e) {
			System.out.println("Se captura la exception");
		}
		this.n = n;
		setValor = true;
		System.out.println("Produce:" + n);
		notify();
	}
}
