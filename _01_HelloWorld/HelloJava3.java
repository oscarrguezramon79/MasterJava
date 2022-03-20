package _01_HelloWorld;
// Archivo: HelloJava3.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class HelloJava3 
	extends JComponent 
	implements MouseMotionListener, ActionListener{
	
	/**
	 *  @author admin
	 */
	private static final long serialVersionUID = -1321995605683651482L;
	//coordenadas para el mensage
	int messageX = 125, messageY = 95;
	String theMessage;
	JButton theButton;
	
	//indice dentro de someColors
	int colorIndex;
	static Color[] someColors = {Color.black, Color.red, Color.green, Color.blue, Color.magenta};
	
	public HelloJava3 (String message) {
		theMessage = message;
		theButton = new JButton("Change Color");
		setLayout (new FlowLayout ());
		add(theButton);
		theButton.addActionListener(this);
		addMouseMotionListener(this);
	}
	
	public void paintComponent (Graphics g) {
		g.drawString(theMessage, messageX, messageY);
	}
	
	public void mouseDragged (MouseEvent e) {
		//salva las coordenadas del raton y aparece el mensage
		messageX = e.getX();
		messageY = e.getY();
		repaint();
	}
	
	public void mouseMoved (MouseEvent e) {}
	
	public void actionPerformed (ActionEvent e) {
		// ¿Alguien apreto el boton?
		if (e.getSource() == theButton)
			changeColor();
	}
	synchronized private void changeColor() {
		//cambia el indice al siguiente color.
		if (++colorIndex == someColors.length)
			colorIndex = 0;
		setForeground (currentColor()); // usa el nuevo color
		repaint (); // pinta de nuevo, podemos ver el cambio
	}
	
	synchronized private Color currentColor() {
		return someColors[colorIndex];
	}
	
	public static void main (String [] args) {
		JFrame f = new JFrame("HelloJava3");
		// hace salir de la aplicacion cuando se cierra la ventana
		f.addWindowListener (new WindowAdapter() {
			public void windowClosing (WindowEvent we) { System.exit(0);}});
		f.setSize(300, 300);
		f.getContentPane().add(new HelloJava3("Hello, Java!"));
		f.setVisible(true);
		}
}
	

