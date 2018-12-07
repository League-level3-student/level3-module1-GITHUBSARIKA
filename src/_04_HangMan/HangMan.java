package _04_HangMan;

import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan {
	Stack<String> words = new Stack<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	public static void main(String[] args) {
		HangMan hangman = new HangMan();
	}

	public HangMan() {
		String amountOfLetters = JOptionPane.showInputDialog("Please type in a number below.");
		int numwords = Integer.parseInt(amountOfLetters);
		for (int i = 0; i < numwords; i++) {
			String dictionary = Utilities.readRandomLineFromFile("dictionary.txt");
			if (!words.contains(dictionary)) {

				words.push(dictionary);
			}

		}
		frame.add(panel);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		String gameWord=words.pop();
		label.setText(gameWord);
		
		
	}
}
