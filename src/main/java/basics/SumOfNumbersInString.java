package basics;

public class SumOfNumbersInString {

	public static void main(String[] args) {
		String str = "trtu5jvd8dh7hgd2";
		int sum = 0;

		for (int i = 0; i < str.length(); i++) {
			char ch = str.charAt(i);

			if (Character.isDigit(ch))

				sum = sum + (ch - '0');
		}

		System.out.println(sum);
	}

}
