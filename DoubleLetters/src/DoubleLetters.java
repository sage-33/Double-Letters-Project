import java.util.Scanner; //import scanner!!

public class DoubleLetters {
	public static void main(String[] args) {
		Scanner scanText = new Scanner(System.in); // Create a Scanner object

		System.out.println("Enter a text");
		String initialText = scanText.nextLine(); // save the initial text
		String finalText = "";

		for (int i = 0; i < initialText.length(); i++) { // for every thing inside the initial text it will double
			char c = initialText.charAt(i); // creating a simple data thing that will add
			if (Character.isLetter(c)) {
				finalText = finalText + initialText.substring(i, i + 1) + initialText.substring(i, i + 1);
			}

			else if (!Character.isLetter(c)) {
				finalText = finalText + initialText.substring(i, i + 1);
			}

			if (initialText.substring(i, i + 1).equals("!")) { // if the initial text is the final "term" (in terms of
																// number of terms) and it equals ! then...
				finalText = finalText + "!!";

			}
		}

		System.out.println(finalText);

	}

}
