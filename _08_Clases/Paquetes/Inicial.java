package _08_Clases.Paquetes;

public class Inicial {

	public static void main(String[] args) {
		
	Hola salOtra = new Hola(); 
	_08_Clases.Paquetes.Hola salOtra2 = new _08_Clases.Paquetes.Hola();  // -->otra forma 
	
	String s = salOtra.saluda();
	String s2 = salOtra2.saluda();
	
	System.out.print(s);
	System.out.println(s2);
	}
}
