package _03_method_writing._1_obedient_robot;

import javax.swing.JOptionPane;
import java.awt.Color;
import org.jointheleague.graphical.robot.Robot;

public class Robot_BOBERT {
	public static void main(String[] args) {
		Robot bobert = new Robot();
		bobert.penDown();
		bobert.setSpeed(5);
		
		String shapeRequest = JOptionPane.showInputDialog("What shape do you want Bobert to draw?\n"
				+ "\n"
				+ "[TRIENGLE]\n"
				+ "\n"
				+ "CIRCLE\n"
				+ "\n"
				+ "SQUARE]");
		String colorRequest = JOptionPane.showInputDialog("What color do you want your shape to be?\n"
				+ "\n"
				+ "[RED\n"
				+ "\n"
				+ "BLUE\n"
				+ "\n"
				+ "GREEN\n"
				+ "\n"
				+ "MAGENTA]");
		if(colorRequest.equalsIgnoreCase("red")) {
			bobert.setPenColor(Color.RED);
		}
		else if(colorRequest.equalsIgnoreCase("blue")) {
			bobert.setPenColor(Color.BLUE);
		}
		else if(colorRequest.equalsIgnoreCase("green")) {
			bobert.setPenColor(Color.GREEN);
		}
		else if(colorRequest.equalsIgnoreCase("magenta")) {
			bobert.setPenColor(Color.MAGENTA);
		}
		else {
			JOptionPane.showMessageDialog(null, "That is not an option.");
		}
		
		if(shapeRequest.equalsIgnoreCase("square")) {
			square(bobert);
		}
		else if(shapeRequest.equalsIgnoreCase("circle")) {
			circle(bobert);
		}
		else if(shapeRequest.equalsIgnoreCase("triengle")) {
			triengle(bobert);
		}
	}
	static void square(Robot bobert) {
		for(int i = 0; i < 4; i += 1) {
			bobert.move(50);
			bobert.turn(90);
		}
	}
	static void circle(Robot bobert) {
		for(int i = 0; i < 360; i += 1) {
			bobert.move(1);
			bobert.turn(1);
		}
	}
	static void triengle(Robot bobert) {
		for(int i = 0; i < 3; i += 1) {
			bobert.move(50);
			bobert.turn(120);
		}
	}
}
