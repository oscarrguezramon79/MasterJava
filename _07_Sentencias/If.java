package _07_Sentencias;

public class If {

	public static void main(String[] args) {
		String msg; //  variables de instancia
		String t="A";
		if (t.equals("A"))
			msg="Alumno";
		else if (t.equals("P"))
			msg="Profesor";
		else if (t.equals("T"))
			msg="Tutor";
		else
			msg="otros";
		
		System.out.println(msg);
			
	}

}
