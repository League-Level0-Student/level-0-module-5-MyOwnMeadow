package _01_algorithms._1_prime_or_not;

import javax.swing.JOptionPane;

public class PrimeOrNot {
	public static void main(String[] args) {
		String numS = JOptionPane.showInputDialog("Chose a whole number.");
		
		int num = Integer.parseInt(numS);
		float nom = num;
		
		boolean prime = true;
		int facter = 0;
		
		if(num == 1) {
			JOptionPane.showMessageDialog(null, "Your number is neither prime nor composite, as it only has 1 facter: 1.\n" + "1 is the only number that is neither composite nor prime.");
		}
		else {
			for(int i = 2; i < nom/2; i += 1) {
				if(i != num && num%i == 0) {
					prime = false;
					facter = i;
				}
			}
			if(prime == false) {
				JOptionPane.showMessageDialog(null, "Your number is not prime. It is composite, as it is divisable by\n" + facter + " on top of being divisable by 1 and itself.");
			}
			else {
				JOptionPane.showMessageDialog(null, "Your number is Prime! It has only 2 facters, 1 and itself.");
			}
		}
	}
}
