/**
 * 
 */
package coreJava;

/**
 * @author Jignesh
 *
 */
public class Loops {

	public static void main(String[] args) {

		// For loop
		for (int i = 0; i <= 10; i++) {
			System.out.println(i);
		}

		System.out.println("------------------");

		// nested
		for (int a = 0; a < 5; a++) {
			for (int b = a + 1; b < 5; b++) {
				System.out.println("Value of a is: " + a);
				System.out.println("Value of b is: " + b);
			}
		}
		System.out.println("------------------");

		// foreach
		String cities[] = { "London", "Paris", "NewYork", "Mumbai" };
		for (String city : cities) {
			System.out.println(city);
		}
		System.out.println("------------------");

		// While
		int c = 1;
		while (c <= 10) {
			System.out.println(c);
			c++;
		}
		System.out.println("------------------");

		// do while
		int d = 0;
		do {
			System.out.println(d);
			d++;
		} while (d <= 5);
		System.out.println("------------------");

		// break, continue
		String languages[] = { "Java", "C#", "Ruby", "Python" };
		for (String language : languages) {
			if (language.equalsIgnoreCase("c#")) {
				System.out.println("continue");
				continue;
			}
			if (language.equalsIgnoreCase("ruby")) {
				System.out.println("break");
				break;
			}
			System.out.println(language);
		}
	}
}
