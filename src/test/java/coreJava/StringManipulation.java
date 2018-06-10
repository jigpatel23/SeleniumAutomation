package coreJava;

public class StringManipulation {

	public static void main(String[] args) {

		String suffix = "String Manipulation in Java";
		String texts = "programming language";

		System.out.println(suffix.length());

		System.out.println(suffix.toUpperCase());

		System.out.println(suffix.replace("t", "s"));

		System.out.println("Char at 5th position is: " + suffix.charAt(5));

		System.out.println("index of first a " + suffix.indexOf("a"));

		int secondA = suffix.indexOf('a', suffix.indexOf("a") + 1);

		System.out.println("index of second a " + secondA);

		System.out.println("index of third a " + suffix.indexOf('a', secondA + 1));

		System.out.println("index of *in* is " + suffix.indexOf("in"));

		// can use following method for assertion, if text is not present it will return
		// -1
		System.out.println("index of word or letter NOT present in string is " + suffix.indexOf("not"));

		// comparison
		System.out.println("Equals method" + suffix.equals(texts));

		System.out.println("equalsIgnreCase method" + suffix.equalsIgnoreCase(texts));

		System.out.println(suffix.endsWith("in Java"));

		// subString
		System.out.println("extract subtring " + suffix.substring(6, 19));

		// trim
		String space = "   Selenium with java    ";
		System.out.println("trim space from before after:  " + space.trim());

		// split
		String words[] = space.split(" ");
		for (String word : words) {
			System.out.println(word);
		}

		// reverse a string
		String reverse = "please reverse this string";
		int length = reverse.length();
		System.out.println(length);// 26

		String reversed = "";
		for (int i = length - 1; i >= 0; i--) {
			reversed = reversed + reverse.charAt(i);
		}
		System.out.println("reversed string is: " + reversed);
	}

}
