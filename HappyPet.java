package charAt_scanners_optionDialogs;
import javax.swing.JOptionPane;

public class HappyPet {
	static String pet;
	// 2. Add the following variable to the next line: static int happinessLevel = 0;
	// this will be used to store the happiness of your pet
	static int happinessLevel= 0;
	public static void main(String[] args) {
	
		// 1. Ask the user what kind of pet they want to buy, and store their answer in a variable
pet = JOptionPane.showInputDialog("What kind of pet would you like to buy?");
for (int i = 0; i < 3; i++) {
		// 7. REPEAT steps 3 - 6 enough times to make your pet happy!
		
			// 3. Use showOptionDialog to ask the user what they want to do to make their pet happy
			//    (eg: cuddle, food, water, take a walk, groom, clean up poop).
			//    Make sure to customize the title and question too.
			int task = JOptionPane.showOptionDialog(null, "What would you like to do to make your " + pet + " happy?", "Happy", 0, JOptionPane.INFORMATION_MESSAGE, null,
					new String[] { "food", "water", "groom" }, null);
if(task==0) {
	foodGiven();
}
if(task==1) {
	waterGiven();
}
if(task==2) {
	groom();
}
			// 5. Use user input to call the appropriate method created in step 4.

			// 6. If you determine the happiness level is large enough, tell the
			//    user that he loves his pet and use break; to exit for loop.
if(happinessLevel>5) {
	JOptionPane.showMessageDialog(null, "You love your " + pet);
	break;
}
		}

	}

	// 4. Create methods to handle each of your user selections.
	//    Each method should create a pop-up with the pet's response (eg. cat might purr when pet), 
	//    and INCREMENT the pet's happiness Level.
	public static void foodGiven(){
		JOptionPane.showMessageDialog(null, "Your " + pet + " will be full and happy!");
		happinessLevel=+3;
	}
	public static void waterGiven() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " will be happy once he/she has quenched his/her thirst!");
		happinessLevel=+3;
	}
	public static void groom() {
		JOptionPane.showMessageDialog(null, "Your " + pet + " might make noise when being groomed");
		happinessLevel=+2;
	}

}