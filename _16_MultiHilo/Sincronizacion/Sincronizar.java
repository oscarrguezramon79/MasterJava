package _16_MultiHilo.Sincronizacion;

public class Sincronizar {
	public static void main (String args[]) {
		Mensaje objMsg = new Mensaje();
		Llamada h1 = new Llamada(objMsg, "Hola");
		Llamada h2 = new Llamada(objMsg, "Mundo");
		Llamada h3 = new Llamada(objMsg, "Java");
		try {
			h1.t.join();
			h2.t.join();
			h3.t.join();
		}catch (InterruptedException e) {
			System.out.println("Detenido .. ");
		}catch (Exception e) {
			System.out.println("Error general..");
		}
		
	}

}
