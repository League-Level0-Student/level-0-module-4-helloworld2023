package charAt_scanners_optionDialogs;
	import javax.swing.JOptionPane;
	public class OwnAdventure {
	 public static void main(String[] args) {
	  
	  JOptionPane.showMessageDialog(null, "You're in a hurry on your way to work, since you'll get "
	    + "fired if you're late again. \n It's 10:10, and you're supposed to arrive no later than"
	    + " 10:15! \n The lights at the intersection keep skipping you, so you feel the need to risk"
	    + " one thing or the other: ");
	 
	  int option = JOptionPane.showOptionDialog(null, "Which decision will you make? Will you...", "Own "
	    + "Adventure", 0, JOptionPane.INFORMATION_MESSAGE,
	    null, new String[] {"Run the red light and risk injuring others/ yourself, or","Wait for "
	      + "the light to change to green, but risk losing your job"}, null);
	  if (option==0) {
	   runThelight();
	  }
	  else {
	   stayAndwait();
	  }
	 }
	 static void runThelight () {
	  JOptionPane.showMessageDialog(null, "No one got hurt, but a camera caught you running the red light, \n "
	    + "so you'll have to end up paying a fee.");
	 }
	 static void stayAndwait () {
	  JOptionPane.showMessageDialog(null, "You ended up arriving late to your job, so you unfortunately got fired.");
	 }
	 
	}


