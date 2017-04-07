package trainsVideo;

public class CountWords {

	public static int countWordsUsingSplit(String input) {
		if (input == null || input.isEmpty()) {
			return 0;
		}
		String[] words = input.split("\\s+");
		return words.length;
	}
	public static void main(String[] args) {
		String ourStr = "my f   gh";
		System.out.println(countWordsUsingSplit(ourStr));

	}

}
