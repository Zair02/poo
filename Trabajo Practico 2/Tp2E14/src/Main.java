import javax.swing.*;

public class Main {

	public static void main(String[] args) {
		
		JFrame frame = new JFrame("Botones");
		JPanel panel = new JPanel();
		
		JButton boton1 = new JButton("Boton 1");
		boton1.addActionListener(e -> {
			JOptionPane.showMessageDialog(frame, "Presionaste el boton 1");
		
		});
		panel.add(boton1);
		
		JButton boton2 = new JButton("Boton 2");
		panel.add(boton2);
		boton2.addActionListener(e -> {
			JOptionPane.showMessageDialog(frame, "Repito. Presionaste el boton 2");
		});
		boton2.addActionListener(e -> {
			JOptionPane.showMessageDialog(frame, "Presionaste el boton 2");
		});
		
		frame.add(panel);
		frame.setSize(600, 200);
		frame.setVisible(true);

	}

}
