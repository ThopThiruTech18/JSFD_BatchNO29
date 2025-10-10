package in.versionit.string2;

public class Example7 {

	public static void main(String[] args) {

		String str = "hello how are you";
		String[] words = str.split(" ");

		String tatalSum = "";

		for (String word : words) {

			String sum = "";
			for (int i = word.length() - 1; i >= 0; i--) {

				sum = sum + word.charAt(i);

			}

			tatalSum = tatalSum + sum + " ";

		}

		System.out.println(tatalSum);

	}

}
