import java.util.HashMap;

public class Checkpointthree {
	public static void main(String[] args) {
		HashMap<String, String> words = new HashMap<String, String>();

		words.put("hi", "ih");
		words.put("bye", "eyb");
		words.put("what", "tahw");
		words.put("hello", "olleh");
		words.put("taco", "ocat");
		String list = "";
		for (String i : words.keySet()) {
			System.out.println(i + " " + words.get(i));
			System.out.println();
		}
		for (String i : words.keySet()) {

		}

	}
}
