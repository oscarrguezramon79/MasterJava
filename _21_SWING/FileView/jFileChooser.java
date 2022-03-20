package _21_SWING.FileView;

import java.awt.AWTEvent;
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.event.ActionEvent;
import java.awt.event.WindowEvent;
import java.io.File;

import javax.swing.BorderFactory;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.filechooser.FileFilter;
import javax.swing.filechooser.FileView;

/*
 * El siguiente ejemplo abre un objeto JFileChooser cuando se pulsa sobre un boton, a
 * a su vez filtra los archivos que se desean ver y su vista e icono asociado
 */

@SuppressWarnings("serial")
public class jFileChooser extends JFrame {
	JPanel contentPane;
	BorderLayout borderLayout1 = new BorderLayout();
	JButton cmdArchivos = new JButton();
	JLabel jLabel1 = new JLabel();
	
	public jFileChooser() {
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	private void jbInit() throws Exception{
		contentPane =(JPanel) this.getContentPane();
		cmdArchivos.setText("Ver archivos");
		cmdArchivos.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (ActionEvent e) {
				cmdArchivos_actionPerformed (e);
			}
		});
		contentPane.setLayout(borderLayout1);
		this.setSize(new Dimension(400,300));;
		this.setTitle("Ejemplo de uso de JFileChooser");
		jLabel1.setBorder(BorderFactory.createLoweredBevelBorder());
		contentPane.add(cmdArchivos, BorderLayout.NORTH);
		contentPane.add(jLabel1, BorderLayout.SOUTH);
	}
	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID()== WindowEvent.WINDOW_CLOSING) {
			System.exit(0);
		}
	}
	
	void cmdArchivos_actionPerformed (ActionEvent e) {
		JFileChooser jFileChoose1 = new JFileChooser("c:/");
		jFileChoose1.setFileFilter(new EjemploFileFilter());
		jFileChoose1.setFileView(new vistaFichero());
		int returnVal = jFileChoose1.showDialog(this, "Aceptar");
		if (returnVal == JFileChooser.APPROVE_OPTION) {
			jLabel1.setText(jFileChoose1.getSelectedFile().getName());
		}else {
			jLabel1.setText("No selecciono...");
		}
	}
	
	//clase para personalizar el filtro
	class EjemploFileFilter extends FileFilter{
		public boolean accept (File fich) {
			String nomF = fich.getName();
			int i = nomF.lastIndexOf(".");
			String exten = nomF.substring(i+1).toLowerCase();
			if (fich.isDirectory()) return true;
			if (exten.equals("gif") || exten.equals("jpg"))
				return true;
			else
				return false;
		}
		public String getDescription() {return "Archivos jpg y gif";}
	}
	//Clase para variar la vista del archivo
	class vistaFichero extends FileView{
		ImageIcon gifIcon = new ImageIcon("gif.gif");
		ImageIcon jpgIcon = new ImageIcon("jpg.gif");
		private String dameExtension(String nombre) {
			int i = nombre.lastIndexOf(".");
			String exten = nombre.substring(i+1).toLowerCase();
			return exten;
		}
		public String getName(File fich) {return null;}
		public String getDescription(File fich) {return null;}
		public Boolean isTraversable (File fich) {return null;}
		public String getTypeDescription(File fich) {
			String tipo = null;
			String nomF = fich.getName();
			String exten = dameExtension(nomF);
			tipo = null;
			if (exten.equals("gif")) {tipo = "Grafico gif";}
			if (exten.equals("jpg")) {tipo = "Grafico jpg";}
			return tipo;
		}
		public Icon getIcon (File fich) {
			Icon icono = null;
			String nomF = fich.getName();
			String exten = dameExtension(nomF);
			if (exten.equals("gif")) {icono = gifIcon;}
			if (exten.equals("jpg")) {icono = jpgIcon;}
			return icono;
		}
		
	}
	
	
	public static void main (String [] args) {
		new jFileChooser().setVisible(true);
	}

}
