package _03_method_writing._2_happy_pet;
import javax.swing.JOptionPane;

public class HappyPet {
	
	// 1. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	
	public static void main(String[] args) {
		int hap = 0;
		// 2. Ask the user what kind of pet they want to buy, and store their answer in a variable
		int pet = JOptionPane.showOptionDialog(null, "What pet do you want to buy?", "PET SHOP", 0, JOptionPane.INFORMATION_MESSAGE, null,
				new String[] { "DOG", "CAT", "BIRD", "MOUSE" }, null);
		String peter = JOptionPane.showInputDialog("What would you like to name your pet?");
		// 3. REPEAT steps 4 - 7 enough times to make your pet happy!
		while(hap < 10) {
			// 4. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What do you want to do?", "CARETAKING", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "WALK", "CLEAN", "PLAY" }, null);
			
			if(task == 0) {
				hap += walk(pet, peter);
			}
			else if(task == 1) {
				hap += clean(pet, peter);
			}
			else if(task == 2) {
				hap += play(pet, peter);
			}
		}
		JOptionPane.showMessageDialog(null, "YOU WIN THE GAME! HAVE A FUN TIME WITH " + peter + ".");
			// 6. Use user input to call the appropriate method created in step 5 below.

			// 7. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.

	}

	// 5. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	static int walk(int pet, String peter) {
		if(pet == 0) {	//Dog
			JOptionPane.showMessageDialog(null, "You take " + peter + " out for a hike. They wag their tail exidedly as they sprint back and forth on the dirt trail.");
			return 3;
		}
		else if(pet == 1) {	//Cat
			JOptionPane.showMessageDialog(null, "You let " + peter + " outside. They come back with a dead mouse as thanks.");
			return 2;
		}
		else if(pet == 2) {	//Bird
			JOptionPane.showMessageDialog(null, "You walk around your naighberhood with " + peter + " perched on your sholder. They seem to enjoy the sunlight a little.");
			return 1;
		}
		else if(pet == 3) {	//Mouse
			JOptionPane.showMessageDialog(null, "You let " + peter + " scurry around outside. While they like the sun, they don't seem to appreshiate the lack of hiding spots, and constintly look up at the sky axinsisly.");
			return -1;
		}
		else {
			return 0;
		}
	}
	
	static int clean(int pet, String peter) {
		if(pet == 0) {	//Dog
			JOptionPane.showMessageDialog(null, "You give " + peter + " a bath. They don't like it, but are glad that they are clean.");
			return 1;
		}
		else if(pet == 1) {	//Cat
			JOptionPane.showMessageDialog(null, "You take " + peter + " to the gromer. They don't particalraly enjoy the prosses, but they seem pleased with the resolt.");
			return 1;
		}
		else if(pet == 2) {	//Bird
			JOptionPane.showMessageDialog(null, "You fill a plate with water and let " + peter + " bathe themself as you replace the newspapers at the bottem of their cage.\n"
					+ peter + " preens themself and chirps happaliy when they see their now clean cage.");
			return 3;
		}
		else if(pet == 3) {	//Mouse
			JOptionPane.showMessageDialog(null, "You clean out the poop and replace some of the bedding in " + peter + "'s cage. They run around their clean cage, then snuggle into their nest, squeeking contently while they do.");
			return 2;
		}
		else {
			return 0;
		}
	}
	
	static int play(int pet, String peter) {
		if(pet == 0) {	//Dog
			JOptionPane.showMessageDialog(null, peter + " waggs their tail and chases after the ball you through.");
			return 2;
		}
		else if(pet == 1) {	//Cat
			JOptionPane.showMessageDialog(null, peter + " runs up a wall to get to the ''magical'' red dot that ''sunddenly'' appeared. They seem to enjoy chasing things.");
			return 1;
		}
		else if(pet == 2) {	//Bird
			JOptionPane.showMessageDialog(null, "You watch some TV with " + peter + " and stroke their head feathers. They seem content as they trill.");
			return 2;
		}
		else if(pet == 3) {	//Mouse
			JOptionPane.showMessageDialog(null, "You  set up a maze for " + peter + ". They seem to like the treat at the end.");
			return 1;
		}
		else {
			return 0;
		}
	}
}