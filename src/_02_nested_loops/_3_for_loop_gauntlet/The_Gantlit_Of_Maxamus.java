package _02_nested_loops._3_for_loop_gauntlet;

import javax.swing.JOptionPane;

public class The_Gantlit_Of_Maxamus {
	public static void main(String[]args) {
		String run = JOptionPane.showInputDialog("What part of the Gantlit do you want to run?");
		if(run.equalsIgnoreCase("a1")) {
			a1();
		}
		else if(run.equalsIgnoreCase("a2")) {
			a2();
		}
		else if(run.equalsIgnoreCase("a3")) {
			a3();
		}
		else if(run.equalsIgnoreCase("a4")) {
			a4();
		}
		else if(run.equalsIgnoreCase("a5")) {
			a5();
		}
		else if(run.equalsIgnoreCase("a6")) {
			a6();
		}
		else if(run.equalsIgnoreCase("a7")) {
			a7();
		}
		else if(run.equalsIgnoreCase("b1")) {
			b1();
		}
		else if(run.equalsIgnoreCase("b2")) {
			b2();
		}
		else if(run.equalsIgnoreCase("b3")) {
			b3();
		}
		else if(run.equalsIgnoreCase("b4")) {
			b4();
		}
		else if(run.equalsIgnoreCase("bonus") || run.equalsIgnoreCase("bounes")) {
			bonus();
		}



	}
	static void a1() {
		//Display all numbers from 0 to 100 [DONE]
		for(int i = 0; i <= 100; i += 1) {
			System.out.println(i);
		}
	}
	static void a2() {
		//Display all numbers from 100 to 0 [DONE]
		for(int i = 100; i >= 0; i -= 1) {
			System.out.println(i);
		}
	}
	static void a3() {
		//Display all even numbers from 2 to 100 [DONE]
		for(int i = 0; i <= 100; i += 1) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	static void a4() {
		//Display all odd numbers from 1 to 99 [DONE]
		for(int i = 0; i <= 100; i += 1) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
	}
	static void a5() {
		//Display all numbers from 1 to 500
		//If the number is odd, print “odd” next to the number
		//If the number is even, print “even” next to the number [DONE]
		for(int i = 0; i <= 500; i += 1) {
			if(i%2 == 0) {
				System.out.println(i + " is even.");
			}
			if(i%2 == 1) {
				System.out.println(i + " is odd.");
			}
		}
	}
	static void a6() {
		//Display all multiples of 7 from 0 to 777 [DONE]
		for(int i = 0; i <= 777; i += 1) {
			if(i%7 == 0) {
				System.out.println(i);
			}
		}
	}static void a7() {
		//Print all the years you were alive and how old you were in each
		for(int i = 0; i <= 15; i += 1) {
			if(i == 0) {
				System.out.println("In " + (2007+i) + ", " + " I was just born.");
			}
			else {
			System.out.println("In " + (2007+i) + ", " + " I was " + (i) + " years old.");
			}
		}
	}
	static void b1() {
		//Display "sequince" in two coloms, separated by two spaces
		String sequince = "000102101112202122";
		int Q = 0;
		for(int i = 0; i <= 8; i += 1) {
			for(int I = 0; I <= 1; I += 1) {
				System.out.print(sequince.charAt(Q) + "  ");
				Q += 1;
			}
			System.out.println("");
		}
	}
	static void b2() {
		//Display the numbers 1 through 9 in a 3x3 square grid [DONE]
		int Q = 1;
		for(int i = 0; i < 3; i += 1) {
			for(int I = 0; I < 3; I += 1) {
				System.out.print(Q + " ");
				Q += 1;
			}
			System.out.println("");
		}
	}
	static void b3() {
		//Display the numbers 1 through 100 in a 10x10 square grid [DONE]
		int Q = 1;
		for(int i = 0; i < 10; i += 1) {
			for(int I = 0; I < 10; I += 1) {
				System.out.print(Q + " ");
				if(Q < 10) {
					System.out.print(" ");
				}
				Q += 1;
			}
			System.out.println("");
		}
	}
	static void b4() {
		//Display a right triangle (6x6/2) that is make with *s [DONE]
		for(int i = 1; i < 7; i += 1) {
			for(int I = 0; I < i; I += 1) {
				System.out.print("* ");
			}
			System.out.println("");
		}
	}
	static void bonus() {
		//Display all numbers from 100 to 0, but start with "for(int i = 0..." [DONE]
		for(int i = 0; i <= 100; i += 1) {
			System.out.println(100 - i);
		}
	}
}


