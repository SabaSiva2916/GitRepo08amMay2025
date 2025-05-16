package org.logout;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;

public class InvalidAgeException {

	public static void main(String[] args) {

		ArrayList list = new ArrayList<>();
		list.add("Alice");
		list.add(Boolean.TRUE);
		list.add("Bob");
		System.out.println(list);
	}
}