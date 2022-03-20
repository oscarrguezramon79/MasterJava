package _07_Sentencias;

public class ForVersion2 {
	public static void main(String[] args) {
	
		int i=5;
		do{
			System.out.println("i-->"+i);
			primera: for(byte j=0;j<10;j++){
				System.out.println("j-->"+j);
				while (true){
					if (j>3) break primera;
					else break;
				}
				System.out.println("sale de bucle");
			}
			
			
		}while(i>0);
	}
}
