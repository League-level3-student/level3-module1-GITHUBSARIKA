package _01_IntroToArrayLists;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;


//Copyright The League of Amazing Programmers, 2015

public class _06_IPodShuffle implements ActionListener{
	JFrame frame=new JFrame();
	JPanel panel=new JPanel();
	JButton button=new JButton();
	ArrayList<Song> songShuffle= new ArrayList<Song>();
	public _06_IPodShuffle() {
		// 1. Use the Song class the play the demo.mp3 file.
		frame.add(panel);
		panel.add(button);
		button.setText("click to hear the playlist");
		button.addActionListener(this);
		frame.pack();
		frame.setVisible(true);
		
		Song song1=new Song("barbie girl song.mp3");
		Song song2=new Song("Camila Cabello Havana (Lyrics).mp3");
		Song song3=new Song("Imagine Dragons Believer LYRICS.mp3");
		Song song4=new Song("Scars to your beautiful - Alessia Cara (Lyrics).mp3");
		songShuffle.add(song1);
		songShuffle.add(song2);
		songShuffle.add(song3);
		songShuffle.add(song4);
		
				
				
		/**
		 * 2. Congratulations on completing the sound check! * Now we want to make an
		 * iPod Shuffle that plays random music. * Create an ArrayList of Songs and a
		 * "Surprise Me!" button that will play a random song when it is clicked. * If
		 * you're really cool, you can stop all the songs, before playing a new one on
		 * subsequent button clicks.
		 */
		
	}
	
	public static void main(String[] args) {
		new _06_IPodShuffle();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton buttonPressed = (JButton) e.getSource();

		
		
		if(buttonPressed==button) {
			for (int i = 0; i < songShuffle.size(); i++) {
			Song ss=songShuffle.get(i);
			ss.stop();
		}

			
			Random random=new Random();
			Integer intt=random.nextInt(songShuffle.size());
			Song songrandom=songShuffle.get(intt);
			songrandom.play();
			
								
		}
		
		
}}