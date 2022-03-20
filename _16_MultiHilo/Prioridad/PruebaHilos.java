package _16_MultiHilo.Prioridad;

public class PruebaHilos {
	public static void main (String [] args) {
		Thread.currentThread().setPriority(Thread.MAX_PRIORITY);
		Hilo uno = new Hilo (Thread.NORM_PRIORITY + 1);
		Hilo dos = new Hilo (Thread.NORM_PRIORITY - 1);
		
		dos.comenzar();
		uno.comenzar();
		try {Thread.sleep(1000);}
		catch (InterruptedException exc) {}
		
		dos.parar();
		uno.parar();
		
		try {
			dos.t.join();
			uno.t.join();
		}
		catch (InterruptedException exc) {
			System.out.println("Hilo con prioridad alta: " + uno.accesos);
			System.out.println ("Hilo con prioridad baja: " + dos.accesos);
		}
	}

}
