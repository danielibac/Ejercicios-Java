package lab02;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

public class Ventana {

	public static void main(String[] args) {

		JFrame frame = new JFrame();
		JLabel label = new JLabel();
		JButton button = new JButton();
		button.setText("Presioname");
		label.setText("Hola mundo!!!");
		button.addActionListener(new ActionListener(){
			@Override
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "SOY UN MENSAJE :)");

			}});
		frame.add(label);
		frame.add(button);
		frame.setTitle("Mi primera ventana");
		frame.setSize(800, 600);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);



	}

}