package _15_Excepciones.ExcepcionThrow;

public class Clase1{
	static void metodo1() throws IllegalAccessException  {
		System.out.println("Dentro de metodo1");
		throw new IllegalAccessException ("error");
	}
	public static void main (String args[]) {
		try {
			metodo1();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			System.out.println("error: " + e);
			
		}
	}

}
