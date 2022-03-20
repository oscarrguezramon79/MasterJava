package _01_HelloWorld;

public class CAplicacion extends javax.swing.JFrame{

/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
/** Crear un nuevo formulario de la clase CAplicacion */
	public CAplicacion() { //constructor
		setSize (300, 200);  // tamaño del formulario
		setTitle("Aplicacion"); // titulo del formulario
		initComponents();  // iniciar los controles o componentes
	}

	/** Este metodo es llamado desde el constructor CAplicacion*/
	private void initComponents() {
		
		jEtSaludo = new javax.swing.JLabel();
		jBtSaludo = new javax.swing.JButton();
		
		//getContentPane().setLayout(null);
		//getContentPane().setLayout(new java.awt.GridLayout(0,1));
		//getContentPane().setLayout(new java.awt.BorderLayout(1,1));
		//getContentPane().setLayout(new java.awt.GridLayout());
		//getContentPane().setLayout(new java.awt.GridBagLayout());
		//getContentPane().setLayout(new java.awt.CardLayout());
		//getContentPane().setLayout(new java.awt.FlowLayout());
		//getContentPane().setLayout(new javax.swing.BoxLayout(null);  //pdte de probar
				
		addWindowListener (new java.awt.event.WindowAdapter(){
			public void windowClosing(java.awt.event.WindowEvent evt) {
				exitForm(evt);
			}
		}
		);
		
		jEtSaludo.setText("etiqueta");
		jEtSaludo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
		jEtSaludo.setFont(new java.awt.Font("Dialog",1,18));
		getContentPane().add(jEtSaludo);
		jEtSaludo.setBounds(42, 36, 204, 30);
		
		jBtSaludo.setToolTipText("boton de pulsacion");
		jBtSaludo.setText("haga clic aqui");
		jBtSaludo.addActionListener(new java.awt.event.ActionListener() {
			public void actionPerformed (java.awt.event.ActionEvent evt) {
				jBtSaludoActionPerformed(evt);
			}
		});
		getContentPane().add(jBtSaludo);
		jBtSaludo.setBounds(42, 90, 204, 30);
	}
	/**Salir de la aplicacion */
	private void exitForm(java.awt.event.WindowEvent evt) {
		System.exit(0); // salir de la aplicacion
	}
	
	/**implementar el metodo de el boton*/
	private void jBtSaludoActionPerformed(java.awt.event.ActionEvent evt) {
		float rojo = (float)Math.random();
		float verde = (float)Math.random();
		float azul = (float)Math.random();
		jEtSaludo.setForeground(new java.awt.Color(rojo, verde, azul));
		jEtSaludo.setText("¡¡¡Hola mundo!!!");
	}
	
	/**
	 * @parametro args: argumentos pasados en la linea de ordenes*/
	public static void main(String args []) {
		new CAplicacion().setVisible(true);
	}
	
	// Declaracion de variables
	
	private javax.swing.JLabel jEtSaludo;
	private javax.swing.JButton jBtSaludo;

}
