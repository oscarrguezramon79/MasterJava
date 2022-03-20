package _09_Objetos;

public class Resultado {
	public static void main (String [] arg) {
		//Ejemplo objEjemplo = new Ejemplo();		// constructor de la clase		
		Ejemplo  objEjemplo;						//			=
		objEjemplo = new Ejemplo();					//			=
		objEjemplo.largo = 15.25;
		objEjemplo.ancho =14.69;
		System.out.println (objEjemplo.area());
		Ejemplo objEjemplo2 = objEjemplo;
		System.out.println(objEjemplo2.area());
	}
}