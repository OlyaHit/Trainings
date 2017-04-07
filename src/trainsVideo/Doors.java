package trainsVideo;

public class Doors {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int length = 101;
		boolean arr[] = new boolean[length]; // by default all doors are closed . Lets
										// assume

		// System.out.println(“0 is closed”);
		// System.out.println(“1 is open”);

		for (int i = 1; i < length; i++) {
			// System.out.println();

			for (int j = i; j < length; j = j + i) {
				// Lets revert the condition on each pass , if o(closed) then
				// 1(open) and vice versa
				if (arr[j] == false) {

					arr[j] = true; // door is open now
				} else if (arr[j] == true) {
					arr[j] = false; // Door is closed
				}
			}

		}

		System.out.println(" The below doors are open");
		for (int i = 1; i < length; i++) {
			if (arr[i] == true) {
				System.out.println(i);
			}
		}
	}

}
