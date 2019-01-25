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
		String rounds = JOptionPane.showInputDialog("Please type in a number below.");
		int numwords = Integer.parseInt(rounds);
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
		for (int i = 0; i < wordTrack.length(); i++) {
			displayWord += "_";

		}
		label.setText(displayWord);
		lives = 10;
		frame.setSize(0,  0);
		frame.pack();

	}

	public HangMan() {

		window();
		createWordList();
		showNewWord();
		lives();

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
		if (displayWord.equals(wordTrack)) {
			
			if(words.isEmpty()) {
				JOptionPane.showMessageDialog(null, "Wou win!!:)");
				
				String reply = JOptionPane.showInputDialog("Would you like to play again?");
				// do code to restart if they say yes
				if (reply.equals("yes")) {
					
					lives = 10;
					displayWord="_";
					createWordList();
					showNewWord();
					
				}else {
					System.exit(0);
				}
			}else {
			showNewWord();
			}

		}
		
		

	}

	void lives() {
		String reply = "";
		if (lives <= 0) {
			JOptionPane.showMessageDialog(null, "Haha!!! You lose!");
			reply= JOptionPane.showInputDialog("Would you like to play again??");
			if (words.isEmpty()) {
				
				reply = JOptionPane.showInputDialog("Would you like to play again?");
				// do code to restart if they say yes
				if (reply.equals("yes")) {
					System.out.println("hio");
					lives = 10;
					displayWord="_";
					createWordList();
					showNewWord();
					
				}else {
					System.exit(0);
				}
			} else {

				String w = words.pop();
				wordTrack = w;
			}
			
			
			
		}

	}
	
	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub

	}
}
