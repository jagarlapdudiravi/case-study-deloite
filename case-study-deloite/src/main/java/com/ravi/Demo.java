package com.ravi;

public class Demo {

	public static void main(String[] args) {
		//StringEncodeDecode test = new StringEncodeDecode();
		StringEncodeDecode test = new StringEncodeDecode();
		String encodedString = test.encode("innoWake rules", 9);
		String decodedString = test.decode("BTWQI", 5);
		System.out.println("Encoded String is : " + encodedString);
		System.out.println("Decoded String is : " + decodedString);
	}

}
