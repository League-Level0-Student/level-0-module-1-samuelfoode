package _03_if_else._2_remarkable;
//    Copyright (c) The League of Amazing Programmers 2013-2019
//    Level 0

import javax.swing.JOptionPane;

public class Remarkable {
public static void main(String[] args) {

		// 1. Save something remarkable about each person in a variable.
		String[] names = {"nathaniel", "william", "michel_lin", "gavin", "Ethan"}; 
		String[] remarks = {"a chronic liar", "smart", "good good", "very bad","very good"};

		// 2. Ask the user to enter a name. Store their answer in a variable.
		String input = JOptionPane.showInputDialog("what is your name");
		// 3. In a pop-up, tell the user what is remarkable about that person. 
		for (int i=0;i<names.length; i++) {
			if (input.equalsIgnoreCase(names[i])) {
				JOptionPane.showMessageDialog(null,names[i]+" is "+remarks[i]);
				
				
			}
		}

	}
}

