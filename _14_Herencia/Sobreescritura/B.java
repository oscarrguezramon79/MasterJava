package _14_Herencia.Sobreescritura;

public class B extends A{
	int k;
	B (int a, int b, int c){
		super(a,b);
		k = c;
	}
	void imprime (String msg) {   //sobrecarga del metodo
		System.out.println(msg);
	}
	void imprime() {			//sobreescritura del metodo
		System.out.println("k=" + k);
	}
	

}
