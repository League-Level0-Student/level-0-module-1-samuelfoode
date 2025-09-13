package _04_int._1_riddler;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class TheRiddler {

	public static void main(String[] args) {

		// 1. Make a variable to hold the scor
		int score = 0;

		// 3. Ask the user a riddle. Here are some ideas: bit.ly/some-riddles
		String riddle[]= {"what is my birthday", "what is my dog", "do i have a dog", "is 7x7 49"};
		String answer[]= {"november 4th", "my dog", "no", "yes"};
		// 4. If they got the answer right, pop up "correct!" and increase the score by one
		boolean bol =  true;
		for(int i=0;i<=riddle.length; i++) {
			String input = JOptionPane.showInputDialog(riddle[i]);
			if(input.equalsIgnoreCase(answer[i])){
				score++;
				JOptionPane.showMessageDialog(null,"you got a point");
			} else {
				JOptionPane.showMessageDialog(null,"you didnt a point");
			}
			JOptionPane.showMessageDialog(null,score);
		}
			
		// 5. Otherwise, say "wrong" and tell them the answer

		// 6. Add some more riddles

		// 2. Make a pop up to show the score.
		
	}
}

