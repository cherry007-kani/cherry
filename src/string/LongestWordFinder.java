package string;

public class LongestWordFinder {

	public static void main(String[] args) {
		String sentence = "Hello this is charan";
		String[] words = sentence.split(" ");
		String longestWord = " ";
		
		for (String word : words) {
			if (word.length() > longestWord.length()) {
				longestWord = word;
			}
		}
		System.out.println("Longest word: " + longestWord);

	}

}
