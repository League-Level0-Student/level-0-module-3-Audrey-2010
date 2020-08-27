package _01_else_if._4_are_you_happy;

import javax.swing.JOptionPane;

public class OwnAdventure {
public static void main(String[] args) {
	



String areYouHappy=JOptionPane.showInputDialog(null,"Are you happy?");

if (areYouHappy.equals("Yes!")) {
	
JOptionPane.showMessageDialog(null,"Keep on doing whatever you're doing, then!");
}
else if (areYouHappy.equals("No...")) {

	String happyOrNot=JOptionPane.showInputDialog(null, "Would you like to be happy?");


	 if (happyOrNot.equals("yeah")) {
JOptionPane.showMessageDialog(null, "Change Something!");	
	
}

	 else if (happyOrNot.equals("no im fine")) {
	JOptionPane.showMessageDialog(null, "Keep on doing whatever you're doing, then...?");
}
}

}}
