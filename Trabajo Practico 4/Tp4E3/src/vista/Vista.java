package vista;

import javax.swing.*;

public class Vista {
	
	private JFrame frame = new JFrame("Formatos");
	private JPanel panel;
	
	private ButtonGroup elegirFormato;
	private JButton btnFormatear;
	
	private JComboBox<String> cbxDia;
	private JComboBox<String> cbxMes;
	private JTextField fldAño;
	private JLabel lblMsjFecha;
	private JLabel lblFormatoFecha;
	
	private JTextField fldMoneda;
	private JLabel lblMsjMoneda;
	private JLabel lblFormatoMoneda;
	
	public Vista() {
		frame.setSize(500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		generarPanel();
		frame.getContentPane().add(panel);
	}

	private void generarPanel() {
		panel.setLayout(null);
		
		lblMsjFecha = new JLabel("Ingrese una fecha:");
		lblMsjFecha.setHorizontalAlignment(JLabel.LEFT);
		lblMsjFecha.setBounds(50, 30, 150, 30);
		panel.add(lblMsjFecha);
		
		String[] dias = new String[31];
		String[] meses = new String[12];
		for(int i = 0; i < 31; i++) {
			if (i < 12) {
				meses[i] = String.valueOf(i + 1);
			}
			dias[i] = String.valueOf(i + 1);
		}
		cbxDia = new JComboBox<String>(dias);
		cbxDia.setBounds(180, 30, 50, 30);
		frame.add(cbxDia);
		cbxMes = new JComboBox<String>(meses);
		cbxMes.setBounds(240, 30, 50, 30);
		frame.add(cbxMes);
		
		fldAño = new JTextField(4);
		fldAño.setBounds(300, 30, 50, 30);
		fldAño.setText("0000");
		panel.add(fldAño);
		
		lblMsjMoneda = new JLabel("Ingrese una cantidad de dinero:");
		lblMsjMoneda.setHorizontalAlignment(JLabel.LEFT);
		lblMsjMoneda.setBounds(50, 80, 190, 30);
		panel.add(lblMsjMoneda);
		
		fldMoneda = new JTextField(10);
		fldMoneda.setBounds(270, 80, 100, 30);
		fldMoneda.setText("0.0");
		panel.add(fldMoneda);
		
		JLabel lblFormato = new JLabel("Formato:");
		lblFormato.setHorizontalAlignment(JLabel.LEFT);
		lblFormato.setBounds(50, 130, 80, 30);
		panel.add(lblFormato);
		
		elegirFormato = new ButtonGroup();
		
		JRadioButton rbtnArg = new JRadioButton("Argentina");
		rbtnArg.setBounds(120, 135, 100, 23);
		rbtnArg.setActionCommand("ARG");
		rbtnArg.setSelected(true);
		panel.add(rbtnArg);
		elegirFormato.add(rbtnArg);
		
		JRadioButton rbtnUS = new JRadioButton("EEUU");
		rbtnUS.setBounds(220, 135, 100, 23);
		rbtnUS.setActionCommand("US");
		panel.add(rbtnUS);
		elegirFormato.add(rbtnUS);
		
		btnFormatear = new JButton("Formatear");
		btnFormatear.setBounds(50, 200, 100, 30);
		panel.add(btnFormatear);
		
		lblFormatoFecha = new JLabel("");
		lblFormatoFecha.setHorizontalAlignment(JLabel.LEFT);
		lblFormatoFecha.setBounds(200, 200, 100, 30);
		panel.add(lblFormatoFecha);
		
		lblFormatoMoneda = new JLabel("");
		lblFormatoMoneda.setHorizontalAlignment(JLabel.LEFT);
		lblFormatoMoneda.setBounds(300, 200, 100, 30);
		panel.add(lblFormatoMoneda);
	}

	public void mostrar() {
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
	}
	
	public void cuadroExcepcion() {
		JOptionPane.showMessageDialog(frame, "Ingresar una fecha valida", "Error" , JOptionPane.ERROR_MESSAGE);
	}
	
	public Double getInputMoneda() {
		return Double.valueOf(fldMoneda.getText()); 
	}
	
	public void setLblFormatoFecha(String formato) {
		lblFormatoFecha.setText(formato);
	}
	
	public void setLblFormatoMoneda(String formato) {
		lblFormatoMoneda.setText(formato);
	}
	
	public JButton getBtnFormatear() {
		return btnFormatear;
	}
	
	public String getInputDia(){
		return (String) cbxDia.getSelectedItem();
	}
	
	public String getInputMes(){
		return (String) cbxMes.getSelectedItem();
	}
	
	public String getInputAño() {
		return fldAño.getText();
	}
	
	public String getInputFormato() {
		return elegirFormato.getSelection().getActionCommand();
	}

}
