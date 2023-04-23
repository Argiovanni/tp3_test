package ilu2.repertoireTest;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import ilu2.Welcome;

class WelcomeTest {
	@Test
	void testEx1() {
		assertEquals(Welcome.welcome("bob"),"Hello, Bob");
	}
	@Test
	void testEx2() {
		assertEquals(Welcome.welcome("    "),"Hello, my friend");
		assertEquals(Welcome.welcome(null),"Hello, my friend");
	}
	@Test
	void testEx3() {
		assertEquals(Welcome.welcome("JERRY"),"HELLO, JERRY !");
	}
	@Test
	void testEx4() {
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy and Bob");
	}
	@Test
	void testEx5() {
		assertEquals(Welcome.welcome("Amy,bob,jerry"),"Hello, Amy, Bob and Jerry");
	}
	@Test
	void testEx6() {
		assertEquals(Welcome.welcome("Amy,BOB,Jerry"),"Hello, Amy and Jerry. AND HELLO, BOB !");
	}
	@Test
	void testEx7() {
		assertEquals(Welcome.welcome("bob,AMY,jerry,JACK"),"Hello, Bob and Jerry. AND HELLO, AMY AND JACK !");
	}
	@Test
	void testEx8() {
		assertEquals(Welcome.welcome("bob    ,amy  "),"Hello, Bob and Amy");
	}
	@Test
	void testEx9() {
		assertEquals(Welcome.welcome("bob,JERRY,amy,bob,JERRY,bob"),"Hello, Bob (*3) and Amy. AND HELLO, JERRY (*2) !");
	}
	@Test
	void testEx10() {
		assertEquals(Welcome.welcome("bob,yoda,amy,JERRY"),"Bob, Yoda and Amy, Hello. AND HELLO, JERRY !");
		assertEquals(Welcome.welcome("bob,YODA,amy,JERRY,YODA"),"Hello, Bob and Amy. AND YODA (*2) AND JERRY, HELLO !");
	}
}
