package _08_Clases;

public class EjemploVersion2 {
	public static void main(String[] args) {
		
		EjemploVersion2_Pruebas obj;                //   necesito una variable objeto --> clase a la q nos referimos
		obj = new EjemploVersion2_Pruebas();         //   instanciar una clase
		int e = obj.getEdad();
		System.out.print(e);
		
	}
}
