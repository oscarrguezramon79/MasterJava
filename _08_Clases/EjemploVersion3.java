package _08_Clases;

public class EjemploVersion3 {
	public static void main(String[] args) {
		
		EjemploVersion2_Pruebas obj = new EjemploVersion2_Pruebas();         //   otra forma para EjemploVersion2.java
		int e = obj.getEdad();
		System.out.print(e);
		int ed =new EjemploVersion2_Pruebas().getEdad();
		System.out.println(ed);
		
	}
}
