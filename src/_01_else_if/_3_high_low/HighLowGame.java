
package _01_else_if._3_high_low;

import java.util.Random;

import javax.swing.JOptionPane;

public class HighLowGame {

	public static void main(String[] args) {
		// 3. Change this line to give you a random number between 1 - 100. 
		int random = new Random().nextInt(101);
		
		// 2. Print out the random variable above
		int random1 = new Random().nextInt(101);
		// 11. Repeat steps 1 to 10 ten times
		
			// 1. Ask the user for a guess using a pop-up window, and save their response 
		String guess=JOptionPane.showInputDialog(null,"Guess!");
		// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int guessAsInt = Integer.parseInt(guess);
		// 5. if the guess is correct
		if(guessAsInt==(random))	{
		// 6. Win
		JOptionPane.showMessageDialog(null, "Win!");
		System.exit(0);
		}
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
		// 7. if the guess is high
		if (guessAsInt>(random)) {
			
		JOptionPane.showMessageDialog(null, "Um, too high...");	
			
		}
			// 8. Tell them it's too high
		// 9. if the guess is low
		if (guessAsInt<(random)) {
			
			JOptionPane.showMessageDialog(null,"Um, a little too low...");
		}
				// 10. Tell them it's too low
		String guess1=JOptionPane.showInputDialog(null,"Guess!");
		// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int guessIsInt = Integer.parseInt(guess1);
		// 5. if the guess is correct
		if(guessIsInt==(random))	{
		// 6. Win
		JOptionPane.showMessageDialog(null, "Win!");
		System.exit(0);
		}
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
		// 7. if the guess is high
		if (guessIsInt>(random)) {
			
		JOptionPane.showMessageDialog(null, "Um, too high...");	
			
		}
			// 8. Tell them it's too high
		// 9. if the guess is low
		if (guessIsInt<(random)) {
			
			JOptionPane.showMessageDialog(null,"Um, a little too low...");
		}
		String guess2=JOptionPane.showInputDialog(null,"Guess!");
		// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int guessAreInt = Integer.parseInt(guess2);
		// 5. if the guess is correct
		if(guessAreInt==(random))	{
		// 6. Win
		JOptionPane.showMessageDialog(null, "Win!");
		System.exit(0);
		}
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
		// 7. if the guess is high
		if (guessAreInt>(random)) {
			
		JOptionPane.showMessageDialog(null, "Um, too high...");	
			
		}
			// 8. Tell them it's too high
		// 9. if the guess is low
		if (guessAreInt<(random)) {
			
			JOptionPane.showMessageDialog(null,"Um, a little too low...");
		}
		String guess3=JOptionPane.showInputDialog(null,"Guess!");
		// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int guessAmInt = Integer.parseInt(guess3);
		// 5. if the guess is correct
		if(guessAmInt==(random))	{
		// 6. Win
		JOptionPane.showMessageDialog(null, "Win!");
		System.exit(0);
		}
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
		// 7. if the guess is high
		if (guessAmInt>(random)) {
			
		JOptionPane.showMessageDialog(null, "Um, too high...");	
			
		}
			// 8. Tell them it's too high
		// 9. if the guess is low
		if (guessAmInt<(random)) {
			
			JOptionPane.showMessageDialog(null,"Um, a little too low...");
		}
		String guess4=JOptionPane.showInputDialog(null,"Guess!");
		// 4. Convert the users’ answer to an int (Integer.parseInt(string))
		int guessAmbInt = Integer.parseInt(guess4);
		// 5. if the guess is correct
		if(guessAmbInt==(random))	{
		// 6. Win
		JOptionPane.showMessageDialog(null, "Win!");
		System.exit(0);
		}
			// 12. Use "System.exit(0);" to quit the game if the user guessed the right answer.
		// 7. if the guess is high
		if (guessAmbInt>(random)) {
			
		JOptionPane.showMessageDialog(null, "Um, too high...");	
			
		}
			// 8. Tell them it's too high
		// 9. if the guess is low
		if (guessAmbInt<(random)) {
			
			JOptionPane.showMessageDialog(null,"Um, a little too low...");
		}
		// 13.Tell them they lose
		JOptionPane.showMessageDialog(null, "You lose!");
		System.exit(0);
	}

}


