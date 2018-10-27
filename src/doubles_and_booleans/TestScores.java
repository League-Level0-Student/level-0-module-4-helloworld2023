package doubles_and_booleans;

import javax.swing.JOptionPane;

public class TestScores {

	public static void main(String[] args) {
		
		String test = JOptionPane.showInputDialog("What is your test score?");
		int score = (int) Double.parseDouble(test);
		if (score<=60) {
			JOptionPane.showMessageDialog(null, "You should have studied more.");
		}
		if (score<=70) {
			JOptionPane.showMessageDialog(null, "Your score is passing, but you "
					+ "should consider studying more.");
		}
		if (score<=80) {
			JOptionPane.showMessageDialog(null, "Good job, but there's always "
					+ "room for improvement.");
		}
		if (score>=90) {
		JOptionPane.showMessageDialog(null, "Great job! I can tell you studied hard!");
		}
		
	}
}


