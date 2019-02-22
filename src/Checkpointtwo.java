import java.util.Random;
import java.util.Stack;

import javax.swing.JOptionPane;

public class Checkpointtwo {
public static void main(String[] args) {
	Stack<Integer> integers=new Stack<Integer>();
	Random random = new Random();
	
	for (int i = 0; i < 10; i++) {
		int num = random.nextInt();
		integers.push(num);
		
	}
	int x=integers.size();
	int total=0;
	for (int i = 0; i < x; i++) {
		 total+=integers.pop();
		
		
		
	}
	JOptionPane.showMessageDialog(null, total);
		
}
}
