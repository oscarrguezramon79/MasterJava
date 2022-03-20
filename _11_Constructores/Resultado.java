package _11_Constructores;
public class Resultado {

	public static void main(String [] args) {
		Punto objPunto1 = new Punto();
		Punto objPunto2 = new Punto(25,96);
		System.out.println(objPunto2.x);
		System.out.println(objPunto1.y);
	}
}
