package _08_Clases.Argumentos;

public class Argumentos {
	public static void main(String[] args){
		Parametros  obj = new Parametros();
		String[] m ={"Hola","pepe"};
		obj.saluda(m);
		System.out.println(m[0]);
		System.out.println(m[1]);
	}
}
