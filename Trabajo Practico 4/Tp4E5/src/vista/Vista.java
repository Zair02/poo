package vista;

import javax.swing.*;

public class Vista {
	
	private JFrame frame = new JFrame("Calculadora");
	private JPanel panel;
	
	private JComboBox<Character> cbOperaciones;
	private JTextField tfOperador1;
	private JTextField tfOperador2;
	
	private JButton btnCalcular;
	private JButton btnMostrar;
	private JButton btnBorrar;
	
	private JTextField tfResultado;
	
	public Vista() {
		frame.setSize(400, 200);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		panel = new JPanel();
		generarPanel();
		frame.getContentPane().add(panel);
	}

	private void generarPanel() {
		panel.setLayout(null);
		
		cbOperaciones = new JComboBox<Character>(new Character[] {'+', '-', '*', '/'});
		cbOperaciones.setBounds(170, 20, 40, 30);
		panel.add(cbOperaciones);
		
		tfOperador1 = new JTextField("0");
		tfOperador1.setBounds(20, 20, 140, 30);
		panel.add(tfOperador1);
		
		tfOperador2 = new JTextField("0");
		tfOperador2.setBounds(220, 20, 140, 30);
		panel.add(tfOperador2);
		
		btnMostrar = new JButton("Mostrar");
		btnMostrar.setBounds(20, 70, 80, 30);
		panel.add(btnMostrar);
		
		btnBorrar = new JButton("Borrar");
		btnBorrar.setBounds(110, 70, 80, 30);
		panel.add(btnBorrar);
		
		btnCalcular = new JButton("Calcular");
		btnCalcular.setBounds(200, 70, 160, 30);
		panel.add(btnCalcular);
		
		tfResultado = new JTextField("");
		tfResultado.setEditable(false);
		tfResultado.setHorizontalAlignment(JTextField.CENTER);
		tfResultado.setBounds(20, 120, 340, 30);
		panel.add(tfResultado);
	}

	public void mostrar() {
		frame.setVisible(true);
	}
	
	public void mostrarDivisionPorCero() {
		JOptionPane.showMessageDialog(frame, "Error. Division por 0", "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public void mostrarErrorInput() {
		JOptionPane.showMessageDialog(frame, "Error. Ingrese valores válidos", "Error", JOptionPane.ERROR_MESSAGE);
	}
	
	public JButton getBtnBorrar() {
		return btnBorrar;
	}
	
	public JButton getBtnCalcular() {
		return btnCalcular;
	}
	
	public JButton getBtnMostrar() {
		return btnMostrar;
	}
	
	public Character getInputOperacion() {
		return (Character) cbOperaciones.getSelectedItem();
	}
	
	public void setResultado(String resultado) {
		tfResultado.setText(resultado);
	}
	
	public void limpiarDisplay() {
		tfResultado.setText("");
	}

	public String getOperador1() {
		return tfOperador1.getText();
	}
	
	public String getOperador2() {
		return tfOperador2.getText();
	}
}
