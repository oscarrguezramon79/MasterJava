package _10_Metodos;

public class Resultado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Metodos objEjemplo;
		objEjemplo = new Metodos();
		objEjemplo.valores(15f, 23f);
		objEjemplo.valores(15, 23);
		objEjemplo.valores(15);
		
		
		System.out.println(objEjemplo.area());
	}

}
