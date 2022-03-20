package _14_Herencia.ClasesAbstractas;

public class Abstracta {
	public static void main (String arg []) {
		// Figura figura = new Figura (5,6); // <--error.No se puede crear la instancia
		Rectangulo rectangulo  = new Rectangulo (5,6);
		Triangulo triangulo = new Triangulo (5,6);
		Figura obj; // se puede realizar pues solo se crea una variable de referencia
		obj = rectangulo;
		obj.area();
		obj = triangulo;
		obj.area();
		rectangulo.area();
		triangulo.area();
	}
}
