package com.ravi;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class StringEncodeDecodeUnitTest {

private StringEncodeDecode converter;
	
	@Before
	public void setup() {
		converter = new StringEncodeDecode();
	}
	
	@Test
	public void testEncode() {
		String encodedString = converter.encode("innoWake rules", 9);
		assertEquals(encodedString,"rwwxFjtn adunb");
	}
	
	@Test
	public void testDecode() {
		String decodedString = converter.decode("rwwxFjtn adunb",9);
		System.out.println(decodedString);
		assertEquals(decodedString,"innoWake rules");
	}
	
}
