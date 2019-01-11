package _04_HangMan;

import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class HangMan implements KeyListener {
	Stack<String> words = new Stack<String>();
	JFrame frame = new JFrame();
	JPanel panel = new JPanel();
	JLabel label = new JLabel();

	String wordTrack;
	String displayWord;
	int lives;

	public static void main(String[] args) {
		HangMan hangman = new HangMan();
	}

	public void createWordList() {
		String amountOfLetters = JOptionPane.showInputDialog("Please type in a number below.");
		int numwords = Integer.parseInt(amountOfLetters);
		for (int i = 0; i < numwords; i++) {
			String dictionary = Utilities.readRandomLineFromFile("dictionary.txt");
			if (!words.contains(dictionary)) {

				words.push(dictionary);
			}

		}
	}

	public void window() {
		frame.add(panel);
		panel.add(label);
		frame.pack();
		frame.setVisible(true);
		frame.addKeyListener(this);
	}

	public void showNewWord() {
		displayWord = "";
		wordTrack = words.pop();
		System.out.println(wordTrack);
		for (int i = 0; i < wordTrack.length(); i++) {
			displayWord += "_";

		}
		label.setText(displayWord);
		lives = 10;

	}

	public HangMan() {

		window();
		createWordList();
		showNewWord();

	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub

	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		char character = e.getKeyChar();
		boolean found = false;
		String hello = "";

		for (int i = 0; i < wordTrack.length(); i++) {
			if (character == wordTrack.charAt(i)) {
				hello += character;
				found = true;

			} else {
				hello += displayWord.charAt(i);

			}

		}
		if (found == false) {
			lives--;
		}

		displayWord = hello;
		label.setText(displayWord);
		lives();

	}

	void lives() {
		String reply = "";
		if (lives <= 0) {
			JOptionPane.showMessageDialog(null, "Haha!!! You lose!");
			String w = words.pop();
			wordTrack = w;
		} else {
			String x = words.pop();
			wordTrack = x;
		}
		if (words.isEmpty()) {
			reply = JOptionPane.showInputDialog("Would you like to play again?");

		}
		if (reply.equals("yes")) {
			lives = 10;
			createWordList();
			window();
			showNewWord();
		}

	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
