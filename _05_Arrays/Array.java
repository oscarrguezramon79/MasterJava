package _05_Arrays;

public class Array {
	public static void main(String[] args) {
		
		String name ="maria";
		char c[][]= new char[3][];
		c[0] = new char[7];
		c[1] = new char[4];
		c[2] = new char[3];
		                
		
		c[0][0]='a';
		c[0][1]='b';
		c[1][0]='c';
		c[1][1]='d';
		c[1][2]='e';
		System.out.println(name.length());//tamaño del array
		System.out.println(c[0].length);//devolver c[0] = 7
	}
}
