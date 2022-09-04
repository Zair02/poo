package vista;

import javax.swing.*;

public class Vista {
	
	private JFrame frame;
	private JPanel panel;
	
	private JTextField inputSMS;
	private JTextField inputGB;
	private JTextField inputMinLlamada;
	private JComboBox<String> inputProveedor;
	
	private JButton botonCalcular;
	private JTextField valorTarifa;
	
	public Vista() {
		this.frame = new JFrame("Calcular Tarifa");
		this.frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.frame.setSize(600, 200);
		
		this.generarPanel();
		this.frame.getContentPane().add(panel);
	}
	
	private void generarPanel() {
		this.panel = new JPanel();
		panel.setLayout(null);
		
		this.inputSMS = new JTextField();
		this.inputSMS.setBounds(55, 35, 95, 20);
		this.inputSMS.setColumns(10);
		this.panel.add(this.inputSMS);
		
		this.inputGB = new JTextField();
		this.inputGB.setColumns(10);
		this.inputGB.setBounds(180, 35, 95, 20);
		this.panel.add(this.inputGB);
		
		this.inputMinLlamada = new JTextField();
		this.inputMinLlamada.setColumns(10);
		this.inputMinLlamada.setBounds(305, 35, 95, 20);
		this.panel.add(this.inputMinLlamada);
		
		String[] items = {"Claro", "Movistar", "Personal"};
		this.inputProveedor = new JComboBox<String>(items);
		this.inputProveedor.setBounds(430, 35, 95, 20);
		this.panel.add(inputProveedor);
		
		JLabel lblTotalSMS = new JLabel("Total de SMS");
		lblTotalSMS.setHorizontalAlignment(SwingConstants.CENTER);
		lblTotalSMS.setBounds(55, 11, 95, 20);
		panel.add(lblTotalSMS);
		
		JLabel lblConsumoGB = new JLabel("GB Consumidos");
		lblConsumoGB.setHorizontalAlignment(SwingConstants.CENTER);
		lblConsumoGB.setBounds(180, 11, 95, 20);
		panel.add(lblConsumoGB);
		
		JLabel lblMinutosLlamada = new JLabel("Minutos en Llamada");
		lblMinutosLlamada.setHorizontalAlignment(SwingConstants.CENTER);
		lblMinutosLlamada.setBounds(288, 11, 125, 20);
		panel.add(lblMinutosLlamada);
		
		JLabel lblProveedor = new JLabel("Proveedor");
		lblProveedor.setHorizontalAlignment(SwingConstants.CENTER);
		lblProveedor.setBounds(430, 11, 95, 20);
		panel.add(lblProveedor);
		
		this.botonCalcular = new JButton("Calcular");
		this.botonCalcular.setBounds(180, 66, 95, 20);
		panel.add(this.botonCalcular);
		
		valorTarifa = new JTextField();
		valorTarifa.setHorizontalAlignment(SwingConstants.CENTER);
		valorTarifa.setEditable(false);
		valorTarifa.setColumns(10);
		valorTarifa.setBounds(305, 66, 95, 20);
		panel.add(valorTarifa);
		
	}

	public void mostrar() {
		this.frame.setVisible(true);
	}
	
	public JButton getBotonCalcular() {
		return this.botonCalcular;
	}
	
	public JTextField getValorTarifa() {
		return this.valorTarifa;
	}

	public JTextField getInputSMS() {
		return inputSMS;
	}

	public JTextField getInputGB() {
		return inputGB;
	}

	public JTextField getInputMinLlamada() {
		return inputMinLlamada;
	}

	public JComboBox<String> getInputProveedor() {
		return inputProveedor;
	}
}
