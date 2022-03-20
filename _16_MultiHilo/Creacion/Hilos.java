package _16_MultiHilo.Creacion;

public class Hilos {
	public static void main (String args[]) {
		new Hilo2();  // Hilo implementacion de la interfaz Runnable
		new Hilo2B();
		try {
			for (int I = 50 ; I>0; I--) {
				System.out.println("Hilo principal.." + I);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e){
				System.out.println("interr.Hilo principal");
			
		}
		System.out.println("Fin del hilo principal");
	}
}
