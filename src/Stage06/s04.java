package Stage06;

import java.util.*;

public class s04 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		boolean flage = true;

		int[] input = new int[8];
	
		for (int i = 0; i < input.length; i++) {
			input[i] = scanner.nextInt();
		}

		switch (input[0]) {
		case 1:
			for (int i = 0; i < 8; i++) {
				if (input[i]!=(i+1)) {
					flage = false;
				}
			}
			if (flage) {
				System.out.println("ascending");
			} else {
				System.out.println("mixed");
			}
			break;

		case 8:
			for (int i = 0; i < 8; i++) {
				if (input[i] != (8 - i)) {
					flage = false;
				}
			}
			if (flage) {
				System.out.println("descending");
			} else {
				System.out.println("mixed");
			}
			break;

		default:
			System.out.println("mixed");
			break;
		}

	}

}
