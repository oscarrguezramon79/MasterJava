package _16_MultiHilo.Comunicacion;

public class Pruebas {
	public static void main (String []  args ) {
		Cola q = new Cola();
		new Producir (q);
		new Consumir(q);
	}
}
