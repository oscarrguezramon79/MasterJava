package _15_Excepciones.ExcepcionThrow;

public class Lanzar {

		static void metodo1(){
			try {
				throw new NullPointerException ("Prueba");
			}
			catch (NullPointerException e) {
				System.out.println(e + " captura en metodo1");
				throw e;  // se vuelve a lanzar
			}
		}
		public static void main (String args[]) {
			try {
				metodo1();
			}
			catch (NullPointerException e) {
				System.out.println(e + " captura en main");
			} 
		}
}
