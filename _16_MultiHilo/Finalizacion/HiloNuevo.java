package _16_MultiHilo.Finalizacion;

public class HiloNuevo implements Runnable {
	String nombre;
	Thread t;
	HiloNuevo (String nombre){
		this.nombre = nombre;
		t = new Thread (this, nombre);
			System.out.println("nuevo hilo" + t);
			t.start ();
	}
	public void run() {
		try {
			for (int i = 5; i >0; i++) {
				System.out.println("nombre.." + i);
				Thread.sleep(1000);
			}
		}catch (InterruptedException e) {
			System.out.println("interr.hilo" + nombre);
		}
		System.out.println("Fin del hilo" + nombre);
	}
}
