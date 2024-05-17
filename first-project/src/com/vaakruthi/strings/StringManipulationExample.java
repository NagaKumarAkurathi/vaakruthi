package com.vaakruthi.strings;

public class StringManipulationExample {

	public static void main(String[] args) {

// Define a sample string

		String str = "Hello, World";

// int length()

		int length = str.length();

		System.out.println("Length of the string: " + length);

// char charAt(int i)

		char charAtIndex = str.charAt(7);

		System.out.println("Character at index 7: " + charAtIndex);

// int compareTo(String s)

		int compareToResult = str.compareTo("Hello");

		System.out.println("Compare to 'Hello': " + compareToResult);

// int compareToIgnoreCase(String s)

		int compareToIgnoreCaseResult = str.compareToIgnoreCase("HELLO, WORLD");

		System.out.println("Compare to ignore case 'HELLO, WORLD': " + compareToIgnoreCaseResult);

// boolean equals(String s)

		boolean equalsResult = str.equals("Hello, World");

		System.out.println("Equals to 'Hello, World': " + equalsResult);

// boolean equalsIgnoreCase(String s)

		boolean equalsIgnoreCaseResult = str.equalsIgnoreCase("HELLO, WORLD");

		System.out.println("Equals ignore case to 'HELLO, WORLD': " + equalsIgnoreCaseResult);

// boolean startsWith(String s)

		boolean startsWithResult = str.startsWith("Hello");

		System.out.println("Starts with 'Hello': " + startsWithResult);

// boolean endsWith(String s)

		boolean endsWithResult = str.endsWith("World");

		System.out.println("Ends with 'World': " + endsWithResult);

// int indexOf(String s)

		int indexOfResult = str.indexOf("World");

		System.out.println("Index of 'World': " + indexOfResult);

// int lastIndexOf(String s)

		int lastIndexOfResult = str.lastIndexOf("o");

		System.out.println("Last index of 'o': " + lastIndexOfResult);

// String replace(char c1, char c2)

		String replacedString = str.replace('o', 'x');

		System.out.println("Replace 'o' with 'x': " + replacedString);

// String substring(int i)

		String substring1 = str.substring(7);

		System.out.println("Substring from index 7: " + substring1);

// String substring(int i1, int i2)

		String substring2 = str.substring(7, 12);

		System.out.println("Substring from index 7 to 12: " + substring2);

// String toLowerCase()

		String lowerCaseString = str.toLowerCase();

		System.out.println("Lowercase string: " + lowerCaseString);

// String toUpperCase()

		String upperCaseString = str.toUpperCase();

		System.out.println("Uppercase string: " + upperCaseString);

// String trim()

		String trimmedString = " Hello, World ".trim();

		System.out.println("Trimmed string: '" + trimmedString + "'");

// void getChars(int i1, int i2, char arr[], int i3)

		char[] charArray = new char[5];

		str.getChars(7, 12, charArray, 0);

		System.out.print("Characters extracted from index 7 to 12: ");

		for (char c : charArray) {

			System.out.print(c);

		}

		System.out.println();

// String[] split(String delimiter)

		String[] splitStrings = str.split(",");

		System.out.println("Split strings:");

		for (String s : splitStrings) {

			System.out.println(s.trim());

		}

	}

}
