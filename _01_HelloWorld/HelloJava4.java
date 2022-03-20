package _01_HelloWorld;
//Archivo: HelloJava4.java
import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

//pdte mostrar color

public class HelloJava4
	extends JComponent
	implements MouseMotionListener, ActionListener, Runnable{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	//coordenadas para el mensaje
	int messageX = 125, messageY =95;
	String theMessage;
	
	JButton theButton;

	int colorIndex; //Current index into someColors
	static Color [] someColors = {Color.black, Color.red, Color.green, Color.blue, Color.magenta};
	
	boolean blinkState;
	
	public HelloJava4(String message) {
		theMessage = message;
		theButton = new JButton("Change color");
		setLayout (new FlowLayout());
		add(theButton);
		theButton.addActionListener(this);
		addMouseMotionListener(this);
		Thread t = new Thread(this);
		t.start();
	}
	public void paintComponent(Graphics g) {
		g.setColor(blinkState ? getBackground() : currentColor( ));
		g.drawString (theMessage, messageX, messageY);
	}
	
	public void mouseDragged(MouseEvent e) {
		messageX = e.getX();
		messageY = e.getY();
		repaint ();
	}
	
	public void mouseMoved(MouseEvent e) {}
	
	public void actionPerformed(ActionEvent e) {
		// ¿alguien apreto el boton?
		if (e.getSource() == theButton)
			changeColor();
	}
	
	synchronized private void changeColor() {
		// cambia el indice por el siguiente color
		if (++colorIndex == someColors.length);
			colorIndex = 0;
		setForeground (currentColor ()); //usa el nuevo color
		repaint();//pinta de nuevo para que veamos el cambio
	}
	synchronized private Color currentColor() {
		return someColors[colorIndex];
	}
	
	public void run() {
		try {
			while(true) {
				blinkState = !blinkState; //parpadeo
				repaint (); //muestra el cambio
				Thread.sleep(500);
			
			}
		}
		catch (InterruptedException ie) {}
	}
	
	public static void main(String [] args) {
		JFrame f = new JFrame ("HelloJava4");
		// hace salir a la aplicacion cuando la ventana se cierra
		f.addWindowListener(new WindowAdapter() { 
			public void windowClosing (WindowEvent we){System.exit(0);}});
		f.setSize (300, 300);
		f.getContentPane().add(new HelloJava4("Hello, Java!"));
		f.setVisible(true);
		
	}
}
