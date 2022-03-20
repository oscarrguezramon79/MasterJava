	/** Este ejemplo crea un JComboBox y lo hace editable o no en funcion del estado activado
	 * o no del JtoggleButton. Si el combo es editable se añade a la lista
	 * el texto introducido
	 */

package _21_SWING.JComboBox;


import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import javax.swing.border.*;

@SuppressWarnings("serial")
public class ComboBox extends JFrame{
	
	JPanel contentPane;
	BorderLayout borderLayout1 = new BorderLayout();
	JPanel jPanel1 = new JPanel();
	JComboBox<Object> cbx = new JComboBox<Object>();
	TitledBorder titledBorder1;
	JToggleButton cmdCambiar = new JToggleButton();
	/**Construct the frame*/
	public ComboBox() {
		enableEvents(AWTEvent.WINDOW_EVENT_MASK);
		try {
			jbInit();
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	@SuppressWarnings("deprecation")
	private void jbInit() throws Exception{
		contentPane = (JPanel) this.getContentPane();
		titledBorder1 = new TitledBorder("");
		contentPane.setLayout (borderLayout1);
		this.setSize(new Dimension(400,300));
		this.setTitle("Ejemplo de uso de ComboBox");
		jPanel1.setLayout(null);
		cbx.setBorder(BorderFactory.createRaisedBevelBorder());
		cbx.setNextFocusableComponent(cmdCambiar);
		cbx.setEditable(true);
		cbx.setBounds(new Rectangle(57,46,125,21));
		cbx.addItem("Hola");
		cbx.addItem("Adios");
		cbx.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cbx_actionPerformed(e);
			}
		});
		cmdCambiar.setToolTipText("Texto");
		cmdCambiar.setMnemonic('T');
		cmdCambiar.setSelected(true);
		cmdCambiar.setText("Editable");
		cmdCambiar.setBounds(new Rectangle(190,47,95,21));
		cmdCambiar.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed(ActionEvent e) {
				cmdCambiar_actionPerformed(e);
			}
		});
		// Establecer valores iniciales del boton:
		cmdCambiar.setText("Editable");
		cmdCambiar.setSelected(true);
		cbx.setEditable(false);
		contentPane.add(jPanel1, BorderLayout.CENTER);
		jPanel1.add(cbx,null);
		jPanel1.add(cmdCambiar, null);
	}
	protected void processWindowEvent(WindowEvent e) {
		super.processWindowEvent(e);
		if (e.getID() == WindowEvent.WINDOW_CLOSING){
			System.exit(0);
		}
	}
	void cbx_actionPerformed (ActionEvent e) {
		String texto;
		// si no hay ningun elemento seleccionado, es que se ha utilizado la caja de texto
		// se añade a la lista el texto que se ha escrito en la caja de texto combo
		if (cbx.getSelectedIndex() == -1) {
			texto = (String) cbx.getSelectedItem();
			texto.trim();
			if (! texto.equals("")) {
				cbx.addItem(cbx.getSelectedItem());
			}
		}
	}
	void cmdCambiar_actionPerformed(ActionEvent e) {
		//Intercambio la etiqueta del boton y la edicion del JCombBox
		if (cmdCambiar.isSelected()) {
			cmdCambiar.setText("Editable");
			cbx.setEditable(false);
		}
		else {
			cmdCambiar.setText("No editable");
			cbx.setEditable(true);
		}
	}
	public static void main(String args[]) {
		new ComboBox().setVisible(true);
	}
}

