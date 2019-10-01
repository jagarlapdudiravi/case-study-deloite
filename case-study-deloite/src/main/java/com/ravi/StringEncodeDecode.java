package com.ravi;

public class StringEncodeDecode {

	public String encode(String input, int rotations) {
		StringBuilder sb = new StringBuilder();
		for (Character c : input.toCharArray()) {
			char ch = rotateRight(c, rotations);
			sb = sb.append(ch);

		}
		return sb.toString();

	}
	
	public String decode(String input, int rotations) {
		StringBuilder sb = new StringBuilder();
		for (Character c : input.toCharArray()) {
			char ch = rotateLeft(c, rotations);
			sb = sb.append(ch);

		}
		return sb.toString();

	}

	public char rotateRight(char c, int rotations) {
		if ((c >= 'A') && (c <= 'Z')) {
			c += rotations;
			if (c > 'Z')
				c -= 26;
		}
		if ((c >= 'a') && (c <= 'z')) {
			c += rotations;
			if (c > 'z')
				c -= 26;
		}
		return c;
	}
	
	public char rotateLeft(char c, int rotations) {
		if ((c >= 'A') && (c <= 'Z')) {
			c -= rotations;
			if (c < 'A')
				c += 26;
		}
		if ((c >= 'a') && (c <= 'z')) {
			c -= rotations;
			if (c < 'a')
				c += 26;
		}
		return c;
	}
}
