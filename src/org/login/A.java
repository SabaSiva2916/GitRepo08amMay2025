package org.login;

import java.util.Enumeration;
import java.util.Iterator;
import java.util.ListIterator;
import java.util.Vector;

public class A {

	public static void main(String[] args) {
		Vector<Integer> v = new Vector<>();
		v.add(10);
		v.add(20);
		v.add(40);
		v.add(50);
		v.add(60);

		ListIterator<Integer> listIterator = v.listIterator();
		while (listIterator.hasNext()) {
			Integer integer = listIterator.next();
			if (integer == 20) {
				listIterator.add(1000);

			} else if (integer == 60) {
				listIterator.set(6);
			} else if (integer == 40) {
				listIterator.remove();
			}
		}
		System.out.println(v);
	}
}
