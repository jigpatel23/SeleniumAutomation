package coreJava;

import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListConcept {

	String city;
	String country;
	int id;

	ArrayListConcept(String city, String country, int id) {
		this.city = city;
		this.country = country;
		this.id = id;

	}

	public static void main(String[] args) {

		ArrayList<String> places = new ArrayList<String>();
		places.add("Mumbai, India");
		places.add("London, England");
		places.add("Sydney, Australia");
		places.add("NewYork, US");

		for (String place : places) {
			System.out.println(place);
		}

		System.out.println("*****************************");

		ArrayListConcept arc1 = new ArrayListConcept("London", "UK", 1);
		ArrayListConcept arc2 = new ArrayListConcept("Mumbai", "India", 2);
		ArrayListConcept arc3 = new ArrayListConcept("Sydney", "Australia", 3);

		ArrayList<ArrayListConcept> generics = new ArrayList<ArrayListConcept>();
		generics.add(arc1);
		generics.add(arc2);
		generics.add(arc3);

		Iterator<ArrayListConcept> itr = generics.iterator();
		while (itr.hasNext()) {
			ArrayListConcept place = itr.next();
			System.out.println(place.id + " : " + place.city + " : " + place.country);
		}

	}

}
