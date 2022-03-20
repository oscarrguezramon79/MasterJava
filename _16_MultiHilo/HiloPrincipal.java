package _16_MultiHilo;

public class HiloPrincipal {
	public static void main (String args[]) {
		Thread t = Thread.currentThread();
		System.out.println("Hilo actual : " + t);
		t.setName("Hilo principal");
		System.out.println("Nombre actual : " + t);
		try {
			for (int n = 5; n>0; n--) {
				System.out.println(n);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
			System.out.println("Hilo interrumpido");
		}
	}
}

