import java.util.ArrayList;
import java.util.Random;

public class Checkpoint {

	public static void main(String[] args) {
		class Cow {
			public void feed() {
			}
		}
		ArrayList<Cow> cows = new ArrayList<Cow>();
		Random random = new Random();
		int num = random.nextInt();

		for (int i = 0; i < num; i++) {
			Cow cow = new Cow();
			cows.add(cow);
			cow.feed();
		}

	}
}