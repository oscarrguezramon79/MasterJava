package _15_Excepciones.Finally;

public class Pruebas {
	static void metodo1() {
		try {
			System.out.println("Esta en metodo 1");
			throw new RuntimeException ("Pruebas");
		}finally {
			System.out.println ("Finally en el metodo 1");
		}
	}
	static void metodo2() {
		try {
			System.out.println("Esta en el metodo2");
			return;
		} finally {
			System.out.println ("Finally en el metodo2");
		}
	}
	static void metodo3() {
		try {
			System.out.println("Esta en el metodo3");
		} finally {
			System.out.println("Finally en el metodo 3");
		}
	}
	public static void main (String arg[]) {
		try {
			metodo1();
		} catch (Exception e) {
			System.out.println("Exception capturada");
		}
		metodo2();
		metodo3();
	}
}
