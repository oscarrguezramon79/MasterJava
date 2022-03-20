package _16_MultiHilo.Sincronizacion;

public class Mensaje {
	synchronized void msg (String texto) {
		System.out.println("["+ texto);
		try {
			Thread.sleep(1000);
		}catch (InterruptedException e) {
			System.out.println("Interrumpido");
		}
		System.out.println("]");
	}
}
