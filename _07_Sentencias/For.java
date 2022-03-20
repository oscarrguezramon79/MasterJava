package _07_Sentencias;

public class For {

public static void main(String[] args) {
	
		
		short i=0;
		for(;;){
			if (i>4)break;
			System.out.println("hola mundo");
			i++;
		}
		
	//otra forma del for
		for(int j=0, k=5; j<5 && k>0;j++,k--){
			System.out.println("hola mundo");
			
		}
	}
}
