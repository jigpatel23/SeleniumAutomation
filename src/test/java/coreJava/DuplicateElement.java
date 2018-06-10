package coreJava;

import java.util.HashSet;
import java.util.Set;

public class DuplicateElement {

	public static void main(String[] args) {
		String names[] = { "c#", "Java", "Python", "Javascript", "node.js", "python", "Python" };

		// using HashSet java.util, it only add Unique value
		Set<String> list = new HashSet<String>();
		for (String name : names) {
			if (list.add(name) == false) {
				System.out.println("Duplicate name is: " + name);
			}
		}

		System.out.println("*************************************");
		
		// using loop
		for (int i = 0; i < names.length; i++) {
			for (int j = i + 1; j < names.length; j++) {

				if (names[i].equals(names[j])) {
					System.out.println("Duplicate name is: " + names[i]);
				} else if (names[i].equalsIgnoreCase(names[j])) {
					System.out.println("Duplicate name by ignoring case is: " + names[i]);
				}
			}

		}
	}

}
