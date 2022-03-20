package _10_Metodos;

public class EjemploStatic {
	static int numero = 5;
	int num = 7 ;
	static boolean isPar() {
		return (numero % 2 == 0 ) ? true : false;
	}
	static void incremento() {
		//num++; //esto dara error
	}
	public static void main (String[] args) {
		System.out.println(isPar());
	}
}
