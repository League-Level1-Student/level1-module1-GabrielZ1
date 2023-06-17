package _05_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main (String[] args) {
		Microwave micro = new Microwave();
		
		
		String flavor = JOptionPane.showInputDialog("What flavor of popcorn do you want?");
		String cookTimeString = JOptionPane.showInputDialog("How long should we put the popcorn in the microwave? (minutes)");		
		
		int cookTimeInt = Integer.parseInt(cookTimeString);
		
		
		
		Popcorn pop = new Popcorn(flavor);

		micro.putInMicrowave(pop);
		micro.setTime(cookTimeInt);

		micro.startMicrowave();



	}
}
