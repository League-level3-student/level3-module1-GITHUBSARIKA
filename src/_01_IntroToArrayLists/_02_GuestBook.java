package _01_IntroToArrayLists;

import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class _02_GuestBook {
	// Create a GUI with two buttons. One button reads "Add Name" and the other button reads "View Names". 
	// When the add name button is clicked, display an input dialog that asks the user to enter a name. Add
	// that name to an ArrayList. When the "View Names" button is clicked, display a message dialog that displays
	// all the names added to the list. Format the list as follows:
	// Guest #1: Bob Banders
	// Guest #2: Sandy Summers
	// Guest #3: Greg Ganders
	// Guest #4: Donny Doners
	JFrame frame=new JFrame();
		JPanel panel=new JPanel();
		JButton button1=new JButton();
		JButton button2=new JButton();
	public _02_GuestBook() {
		frame.add(panel);
		panel.add(button1);
		panel.add(button2);
		button1.setText("Add name");
		button2.setText("view names");
		frame.pack();
		frame.setVisible(true);
		ArrayList<String> names= new ArrayList<String>();
	}
	public static void main(String[] args) {
		_02_GuestBook guestbook=new _02_GuestBook();
		
		
	}
	
	
	
}
