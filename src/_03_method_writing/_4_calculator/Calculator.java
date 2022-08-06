package _03_method_writing._4_calculator;

import javax.swing.JOptionPane;

public class Calculator {

	//GOAL: MAKE A CALCULATOR
	public static void main(String[] args) {
		String input1 = JOptionPane.showInputDialog("ENTER A NUMBER.");
		String input2 = JOptionPane.showInputDialog("ENTER A NUMBER TO MODIFY THE FIRST.");
		int num1 = Integer.parseInt(input1);
		int num2 = Integer.parseInt(input2);
		int resolt = 0;
		
		int task = JOptionPane.showOptionDialog(null, "WHAT OPPERATION DO YOU WISH TO EXACUTE?", "CALCULATOR", 0,
				JOptionPane.INFORMATION_MESSAGE, null, new String[] { "DIVIDE (Retern my be rounded)", "MULTIPLY", "SUBTRACT", "ADD" }, null);

		// 3) Call the correct method depending on what option the user chooses
		if(task == 0) {
			resolt = divide(num1, num2);
		}
		else if(task == 1) {
			resolt = multiply(num1, num2);
		}
		else if(task == 2) {
			resolt = subtract(num1, num2);
		}
		else if(task == 3) {
			resolt = add(num1, num2);
		}
		JOptionPane.showMessageDialog(null, (responce(resolt)));
		// 4) Call the result() method and put the answer in a pop-up
	}
	static int divide(int int1, int int2) {
		int resolt = int1/int2;
		return resolt;
	}
	static int multiply(int int1, int int2) {
		int resolt = int1*int2;
		return resolt;
	}
	static int subtract(int int1, int int2) {
		int resolt = int1-int2;
		return resolt;
	}
	static int add(int int1, int int2) {
		int resolt = int1+int2;
		return resolt;
	}
	static String responce(int resolt) {
		String sResolt = ("THE ANSWER IS " + resolt + ".");
		return sResolt;
	}
	// 1) Make 4 static methods (add, subtract, multiply, divide)
	//		They should each take 2 numbers as parameters
	//		and return the answer.
	 
	
	// 2) Make a static method called " result" that takes a number
	//		as a parameter and returns the number in a string
	//		EX: "Your answer is " + number;

	
}
