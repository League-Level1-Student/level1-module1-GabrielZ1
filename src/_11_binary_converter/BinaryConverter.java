package _11_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener{

	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JTextField answer = new JTextField(20);
	JButton button = new JButton();

	
	public static void main(String[] args) {
		
		BinaryConverter bc = new BinaryConverter();
		bc.run();
		
	}


	
	public void run() {

		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		frame.setVisible(true);

		frame.setTitle("Convert 8 bits of binary to ASCII");

		button.setText("convert");
		button.addActionListener(this);

		frame.add(panel);

		panel.add(answer);
		panel.add(button);

		frame.pack();


	}


	public void actionPerformed(ActionEvent arg0) {
	JOptionPane.showMessageDialog(null, convert(answer.getText()));

	
	}


	//given method

	String convert(String input) {
		if(input.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
		}
		String binary = "[0-1]+";//must contain numbers in the given range
		if (!input.matches(binary)) {
			JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
			return "-";   
		}
		try {
			int asciiValue = Integer.parseInt(input, 2);
			char theLetter =  (char) asciiValue;
 			return "" + theLetter;
		} catch (Exception e) {
			JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
			return "-";
		}
	}




}


