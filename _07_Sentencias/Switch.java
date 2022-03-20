package _07_Sentencias;

public class Switch {
	public static void main(String[] args) {
		String msg="NO TA SOLO HAY MESES";
		short mes = 2;
		
		
		switch(mes){
		case 1:
		case 3:
		case 5:
		case 7:
		case 8:	
		case 10:
		case 12:
			msg="Meses de 31 días";
			System.out.println(msg);
			break;
		case 2:
			msg="Mes menos de 28 o 29 días";
			System.out.println(msg);
			break;
		case 4:
		case 6:
		case 9:
		case 11:
			msg="Meses de 30 días";
			System.out.println(msg);
			break;
		default:
			System.out.println(msg);
			break;
		}
	}
}