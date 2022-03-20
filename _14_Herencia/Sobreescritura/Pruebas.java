package _14_Herencia.Sobreescritura;

public class Pruebas {

	public static void main (String [] arg) {
		B obj = new B (1,2,3);
		obj.imprime("Hola"); //llama al metodo de B
		obj.imprime(); // llama al metodo de B
		A obj1 =obj;
		obj1.imprime(); //llama al metodo de B
	}
}
