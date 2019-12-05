package _07_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the score
int score = 0;
		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
String answer= "STOP IMAGINING!!";

String quesser= JOptionPane.showInputDialog(null,"Imagine you are in a dark room. How do you get out?" );
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
if(quesser.equals(answer)) {
	JOptionPane.showMessageDialog(null, "DID U CHEAT!??!!?");
	score++;
}
else {
	JOptionPane.showMessageDialog(null, "WRONG!!! THE ANSWER'S STOP IMAGINING!!");
	
}

		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles
String answer2= "NOTHING!!!";
String quesser2= JOptionPane.showInputDialog(null, "What is greater than God,more evil than the devil,the poor have it,the rich need it,and if you eat it, you'll die?");
if(quesser2.equals(answer2)) {
	JOptionPane.showMessageDialog(null, "DID U CHEAT!??!!?");
	score++;
}
else {
	JOptionPane.showMessageDialog(null, "WRONG!!! NOTHING!!!");
	
}
		// 2. Make a pop up to show the score.
		JOptionPane.showMessageDialog(null, score);
	}
}

