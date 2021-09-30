
//import scanner!!
import java.util.Scanner;

public class DoubleLetters {
	public static void main(String[] args) {
		// Create a Scanner object
		Scanner scanText = new Scanner(System.in);

		System.out.println("Enter a text");
		// save the initial text
		String initialText = scanText.nextLine();
		String finalText = "";

		// for every thing inside the initial text it will double
		for (int i = 0; i < initialText.length(); i++) {
			// creating a simple data thing that will add
			char c = initialText.charAt(i);
			if (Character.isLetter(c)) {
				finalText = finalText + initialText.substring(i, i + 1) + initialText.substring(i, i + 1);
			}

			else if (!Character.isLetter(c)) {
				finalText = finalText + initialText.substring(i, i + 1);
			}

			// if the initial text is the final "term" (in terms of
			// number of terms) and it equals ! then...
			if (initialText.substring(i, i + 1).equals("!")) {
				finalText = finalText + "!!";

			}
		}

		System.out.println(finalText);

	}

}
