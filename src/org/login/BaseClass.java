package org.login;

import java.util.LinkedHashMap;
import java.util.Map;

public class BaseClass {

	void employeeId() {
		System.out.println("employee id is 1234");
	}

	void employeeName() {
		System.out.println("employee name is Vignesh");

	}

	void employeeNumber() {
		System.out.println("employe Number is 9876543201");

	}

	public String reverseOFString(String input) {
		String output = "";

		for (int i = input.length() - 1; i >= 0; i--) {
			char c = input.charAt(i);
			output = output + c;
		}

		return output;
	}

	public Map<Character, Integer> occuranceCount(String input) {
		Map<Character, Integer> map = new LinkedHashMap<Character, Integer>();
		for (int i = 0; i < input.length(); i++) {
			char c = input.charAt(i);
			if (map.containsKey(c)) {
				map.put(c, map.get(c) + 1);
			} else {
				map.put(c, 1);
			}

		}
		return map;
	}

	public static void main(String[] args) {
		BaseClass a = new BaseClass();
		a.employeeId();

	}

}
