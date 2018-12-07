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
	}
	
	public void showNewWord() {
		wordTrack=words.pop();
		for (int i = 0; i < ; i++) {
			
		}
	}

	public HangMan() {
		
		
		
		
		
		
		
		
		
	}

	@Override
	public void keyTyped(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyPressed(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void keyReleased(KeyEvent e) {
		// TODO Auto-generated method stub
		
	}
}
