package _16_MultiHilo.Creacion;

public class Hilo2 implements Runnable {
	Thread t;
	Hilo2(){
		t=new Thread (this,"Segundo hilo");
		System.out.println("Segundo hilo"+ t);
		t.start();
		
	}
	public void run() {
		try {
			for (int I =50; I>0; I-- ) {
				System.out.println("segundo hilo.." + I);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("interr. segundo hilo");
		}
		System.out.println("Fin del segundo hilo");
	}
}
