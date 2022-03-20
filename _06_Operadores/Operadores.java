package _06_Operadores;

public class Operadores {
	
	public static void main (String args[]) {
		int i = 0;
		int Y= 0;
		int y= 0;
		int x= 0;
		int denom= 0;
		int num= 0;
		
		
	i=i+1;         //equivale a i++;
	Y=Y*8;         //equivale a Y*=8;
	i=58; y=++i;   //es quivalente a i=i+1; y=i;
	i=58; y=i++;    //es equivalente a y=i;i=i+1;

	if (denom !=0 && num /denom>100) // asi enviaremos un error cuando denom =0
	x= denom ==0?0: num/denom; //Es otra forma de evitar el error

	String nombre ="nombre" + "apellido";
	nombre +="edad";  //concatenacion
 
		
	//condicion ? expresion1: expresion2;   operador ?
	x= denom == 0 ? 0 :num/denom;
	
	System.out.println(i);
	System.out.println(Y);
	System.out.println(y);
	System.out.println(x);
	System.out.println(denom);
	System.out.println(num);
	System.out.println(nombre);
	}
}