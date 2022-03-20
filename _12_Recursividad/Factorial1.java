package _12_Recursividad;

public class Factorial1 {

	int fact (int n){
		int resultado;
		if (n ==1) return 1;
		resultado =fact (n - 1)*n;
		return resultado;
	}

}
