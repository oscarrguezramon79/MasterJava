package _21_SWING.JButton;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;

import javax.swing.*;

public class Ejemplo extends JFrame implements ActionListener{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
		
	JPanel contentPane;
	BorderLayout borderLayout1 = new BorderLayout();
	JButton b1,b2,b3;
	
	/**Construct the frame*/
	public Ejemplo() {
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings({ "unused", "static-access" })
	private void jbInit() throws Exception{
		contentPane =(JPanel) this.getContentPane();
		contentPane.setLayout(borderLayout1);
		this.setSize(new Dimension(400,300));
		this.setTitle("Ejemplo sobre botones");
		
		ImageIcon leftButtonIcon = new ImageIcon("C:/desarrollo/Dai/Master/_Eclipse/Master/src/_21_Swing/JButton/_Izda.gif");
		ImageIcon middleButtonIcon = new ImageIcon("C:/desarrollo/Dai/Master/_Eclipse/Master/src/_21_Swing/JButton/Center.gif");
		ImageIcon LEFTButtonIcon = new ImageIcon("C:/desarrollo/Dai/Master/_Eclipse/Master/src/_21_Swing/JButton/Izqda.gif");
		
		b1= new JButton("Desactiva boton central", leftButtonIcon);
		b1.setVerticalTextPosition(AbstractButton.CENTER);
		b1.setHorizontalAlignment(AbstractButton.LEFT);
		b1.setMnemonic('d');
		b1.setActionCommand("desactiva");
		
		b2 = new JButton("Desactiva boton central", leftButtonIcon);
		b2.setVerticalTextPosition(AbstractButton.BOTTOM);
		b2.setHorizontalTextPosition(AbstractButton.CENTER);
		b2.setMnemonic('c');
		
		b3 = new JButton ("Activa boton central", LEFTButtonIcon);
		b3.setMnemonic('a');
		b3.setActionCommand("activa");
		b3.setEnabled(false);
		
		b1.addActionListener(this);
		b3.addActionListener(this);
		
		contentPane.add(b1, borderLayout1.NORTH);
		contentPane.add(b1, borderLayout1.CENTER);
		contentPane.add(b1, borderLayout1.SOUTH);
		
	}
	public void actionPerformed(java.awt.event.ActionEvent e) {
		if (e.getActionCommand().equals("desactiva")){
			b2.setEnabled(false);
			b1.setEnabled(false);
			b3.setEnabled(true);
		}
		else {
			b2.setEnabled(true);
			b1.setEnabled(true);
			b3.setEnabled(false);
		}
	}
	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID()== WindowEvent.WINDOW_CLOSING) {
			System.exit(0);
		}
	}
	public static void main(String args []) {
		new Ejemplo().setVisible(true);
	}
	
}
