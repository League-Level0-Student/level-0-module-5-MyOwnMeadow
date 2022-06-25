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



	}
	static void a1() {
		for(int i = 0; i <= 100; i += 1) {
			System.out.println(i);
		}
	}
	static void a2() {
		for(int i = 100; i >= 0; i += 1) {
			System.out.println(i);
		}
	}
	static void a3() {
		for(int i = 0; i <= 100; i += 1) {
			if(i%2 == 0) {
				System.out.println(i);
			}
		}
	}
	static void a4() {
		for(int i = 0; i <= 100; i += 1) {
			if(i%2 == 1) {
				System.out.println(i);
			}
		}
	}
	static void a5() {
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
		for(int i = 0; i <= 777; i += 1) {
			if(i%7 == 0) {
				System.out.println(i);
			}
		}
	}static void a7() {
		String gramer = " I was just born.";
		int age = 15;
		int year = 2007;
		for(int i = 0; i <= age; i += 1) {
			System.out.println("In " + year+i + ", " + gramer);
			if(i == 0) {
				gramer = " I was 1 year old.";
			}
			else {
				gramer = " I was " + i+1 + " years old.";
			}
		}
	}
	static void b1() {
		String sequince = "000102101112202122";
		int Q = 0;
		for(int i = 0; i <= 9; i += 1) {
			for(int I = 0; I <= 2; I += 1) {
				System.out.print(sequince.charAt(Q) + "  ");
				Q += 1;
			}
			System.out.println("");
		}
	}static void b2() {
		int Q = 1;
		for(int i = 0; i < 3; i += 1) {
			for(int I = 0; I < 3; I += 1) {
				System.out.print(Q + " ");
				Q += 1;
			}
			System.out.println("");
		}
	}
}





