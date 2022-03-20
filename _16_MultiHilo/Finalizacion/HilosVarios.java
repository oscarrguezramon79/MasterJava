package _16_MultiHilo.Finalizacion;

public class HilosVarios {
	public static void main (String args []) {
		HiloNuevo h1 = new HiloNuevo ("Primero");
		HiloNuevo h2 = new HiloNuevo ("Segundo");
		HiloNuevo h3 = new HiloNuevo ("Tercero");
		try {
			h1.t.join();
			h2.t.join();
			h3.t.join();
			System.out.println("Fin de los tres hilos");
		}catch (InterruptedException e) {
			System.out.println("interr. hilo principal");
		}catch (Exception e) {
			System.out.println("Error general ...");
		}
	}
	

}
