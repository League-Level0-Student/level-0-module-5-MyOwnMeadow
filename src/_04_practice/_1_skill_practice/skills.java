package _04_practice._1_skill_practice;

import java.util.Random;

import javax.swing.JOptionPane;

public class skills {
	public static void main(String[]args) {
		String run = JOptionPane.showInputDialog("What skill do you want to test out?");
		if(run.equalsIgnoreCase("1")) {
			skill1();
		}
		else if(run.equalsIgnoreCase("2")) {
			skill2();
		}
		else if(run.equalsIgnoreCase("3")) {
			skill3();
		}
		else if(run.equalsIgnoreCase("4")) {
			skill4();
		}
		else if(run.equalsIgnoreCase("5")) {
			skill5();
		}
		else {
			
		}
	}
	static void skill1() {
		String dimeCntS = JOptionPane.showInputDialog("How meny dimes do you have?\n"
				+ "[PLEASE ONLY ANCER IN NUMBERS]");
		int dimeCnt = Integer.parseInt(dimeCntS);
		JOptionPane.showMessageDialog(null, "Cool! That meens you have " + (dimeCnt*10) + " cents in dimes.");
		
		String incheS = JOptionPane.showInputDialog("How tall are you? (in inches)\n"
				+ "[PLEASE ONLY ANCER IN NUMBERS]");
		int inches = Integer.parseInt(incheS);
		if(inches < 36) {
			JOptionPane.showMessageDialog(null, "I'm suposed to say ''Eat your wheaties,'' but I'll say otherwise. Eat your salmon and drink your milk.");
		}
		else {
			JOptionPane.showMessageDialog(null, "Cool.");
		}
	}
	static void skill2() {
		for(int i = 0; i <= 30; i += 1) {
			if(i%3 == 0) {
				System.out.println(i);
			}
		}
	}
	static void skill3() {	//Add random
		Random ran = new Random();
		int num1 = ran.nextInt(20);
		System.out.println(num1);
		
		int num2 = ran.nextInt(10);
		System.out.println(num2);
		
		int theNum = num1 - num2;
		JOptionPane.showMessageDialog(null, theNum + ".");
	}
	static void skill4() {
		String city = JOptionPane.showInputDialog("What city do you live in?");
		
		if(city.equalsIgnoreCase("san diego")) {
			JOptionPane.showMessageDialog(null, "Me too!");
		}
		else {
			JOptionPane.showMessageDialog(null, "You should move to San Diego, where the weather is pretty much perfict 24/7 (ignoring the piping hot sand and frezzing cold Pasific Ocean).");
		}
		
		String carS = JOptionPane.showInputDialog("How meny cars does your family have?\n"	//I'm just asking the amount insted of using my own because the instructions were a little unclear, and because this way is more intresting
				+ "[PLEASE ANCER IN NUMBERS]");	
		int carNum = Integer.parseInt(carS);
		
		if(carNum <= 0) {
			JOptionPane.showMessageDialog(null, "I bet you guys use public transportation.");
		}
		else if(carNum == 1) {
			JOptionPane.showMessageDialog(null, "What modol?\n"
					+ "   ...\n"
					+ "  Cool!");
		}
		else {
			int wheelNum = carNum * 4;
			JOptionPane.showMessageDialog(null, "That's... " + wheelNum + " wheels between them!");
		}
	}
	static void skill5() {
		String school = JOptionPane.showInputDialog("What school do you go to?");
		JOptionPane.showMessageDialog(null, "I've heard that " + school + " is a prety good school.");
	}
}
