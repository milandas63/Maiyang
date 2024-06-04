package home.work;

public class Converte {

	public static void main(String[] args) {
		int[] numbers = { 12345, 3786, 72913 };

		String[] words = { "zero", "One", "Two", "Three", "Four", "Five", "Six", "Seven", "Eight", "Nine" };

		for (int number : numbers) {
			if (number == 0) {
				System.out.println(number + " = Zero");
				continue;
			}

			StringBuilder word = new StringBuilder();
			while (number > 0) {
				int digit = number % 10;
				word.insert(0, words[digit] + " ");
				number /= 10;
			}

			System.out.println(number + " = " + word.toString().trim());
		}
	}
}