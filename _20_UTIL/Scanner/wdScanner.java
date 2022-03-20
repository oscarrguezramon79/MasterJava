package _20_UTIL.Scanner;

import java.util.Scanner;

public class wdScanner {

	public static void main (String[] args) {
		Scanner escaneo = new Scanner(System.in);
		
		System.out.println("¿Como te llamas?");
		String nombre = escaneo.nextLine();
		System.out.println("Hola "+ nombre +" ¿que tal?");
		escaneo.close();		
	}
}
