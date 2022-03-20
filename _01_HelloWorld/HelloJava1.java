package _01_HelloWorld;

//Archivo: HelloJava1.java

/**
 * 
 * @author Óscar
 * @version 1.00 02/04/2020 05:30
 * 
 * Mostrar por pantalla HelloJava
 *
 */

public class HelloJava1 extends javax.swing.JComponent {
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public static void main (String [] args) {
		javax.swing.JFrame f=new javax.swing.JFrame("HelloJava1");
		f.setSize(300, 300);
		f.getContentPane().add(new HelloJava1());
		f.setVisible(true);
		javax.swing.JOptionPane.showMessageDialog(null, "Hello, Java!!!");
	}
	
	public void paintComponent (java.awt.Graphics g) {
		g.drawString(("Hello, Java!" ), 125, 95);
		
		
	}

}
