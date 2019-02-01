package _06_Intro_To_Hash_Maps;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.HashMap;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

public class _02_LogSearch implements ActionListener {
  /* 
	 * Crate a HashMap of Integers for the keys and Strings for the values.
	  HashMap<Integer, String> studentRoster = new HashMap<Integer, String>();
	 * Create a GUI with three buttons. 
	 * Button 1: Add Entry
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				After an ID is entered, use another input dialog to ask the user to enter a name.
	 * 				Add this information as a new entry to your HashMap.
	 * 
	 * Button 2: Search by ID
	 * 				When this button is clicked, use an input dialog to ask the user to enter an ID number.
	 * 				If that ID exists, display that name to the user.
	 * 				Otherwise, tell the user that that entry does not exist.
	 * 
	 * Button 3: View List
	 * 				When this button is clicked, display the entire list in a message dialog in the following format:
	 * 				ID: 123  Name: Harry Howard
	 * 				ID: 245  Name: Polly Powers
	 * 				ID: 433  Name: Oliver Ortega
	 * 				etc...
	 * 
	 * When this is complete, add a fourth button to your window.
	 * Button 4: Remove Entry
	 * 				When this button is clicked, prompt the user to enter an ID using an input dialog.
	 * 				If this ID exists in the HashMap, remove it. Otherwise, notify the user that the ID
	 * 				is not in the list. 
	 *
	 * */
	 HashMap<Integer, String> peopleinfo = new HashMap<Integer, String>();
	 JFrame frame=new JFrame();
	 JPanel panel=new JPanel();
	 JButton buttonEntry=new JButton();
	 JButton buttonID=new JButton();
	 JButton buttonList=new JButton();
	 JButton buttonRemove=new JButton();
	 _02_LogSearch(){

		 frame.add(panel);
		 panel.add(buttonEntry);
		 panel.add(buttonID);
		 panel.add(buttonList);
		 panel.add(buttonRemove);
		 buttonEntry.setText("Add Entry");
		 buttonID.setText("Search by ID");
		 buttonList.setText("View List");
		 buttonRemove.setText("Remove entry");
		 buttonEntry.addActionListener(this);
		 buttonID.addActionListener(this);
		 buttonList.addActionListener(this);
		 buttonRemove.addActionListener(this);
		 frame.pack();
		 frame.setVisible(true);
	 }
	 public static void main(String[] args) {
		_02_LogSearch logsearch=new _02_LogSearch();
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if(buttonEntry==e.getSource()) {
			String num=JOptionPane.showInputDialog("Enter and ID number.");
			int idnum=Integer.parseInt(num);
			String name= JOptionPane.showInputDialog("Enter a name.");
			peopleinfo.put(idnum, name);
		}
		if(buttonID==e.getSource()) {
			String numm=JOptionPane.showInputDialog("Enter an ID number.");
			int id=Integer.parseInt(numm);
			for(Integer idd: peopleinfo.keySet()) {
				if(id==idd) {
					System.out.println(peopleinfo.get(idd));
				}
			}
		}
	}
	
}
