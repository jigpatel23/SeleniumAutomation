package coreJava;

import java.util.HashMap;
import java.util.Map.Entry;

public class Hashmap {

	public static void main(String[] args) throws Exception {

		HashMap<String, String> hashmap = new HashMap<String, String>();
		hashmap.put("London", "UK");
		hashmap.put("Sydney", "AU");
		hashmap.put("NewYork", "US");
		hashmap.put("Reading", "UK");

		for (Entry<String, String> en : hashmap.entrySet()) {
			System.out.println(en.getKey() + "::" + en.getValue());
		}

		hashmap.remove("London");
		System.out.println(hashmap);

	}

}
