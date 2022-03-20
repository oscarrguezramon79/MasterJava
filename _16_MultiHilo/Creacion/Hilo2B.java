package _16_MultiHilo.Creacion;

public class Hilo2B extends Thread {
	Hilo2B(){
		super("segundoo hilo");
		System.out.println ("Segundoo hilo "+ this);
		start();
	}
	public void run() {
		try {
			for (int I=50; I>0;I--)
				System.out.println("segundoo hilo.." + I);
			Thread.sleep(500);
		}
		catch (InterruptedException e) {
			System.out.println("interr. segundoo hilo");
		}
		System.out.println("Fin del segundoo hilo");
	}
}
