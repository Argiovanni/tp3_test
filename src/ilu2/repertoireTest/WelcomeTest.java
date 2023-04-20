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
		assertEquals(Welcome.welcome("JERRY"),"HELLO, JERRY!");
	}
	
	@Test
	void testEx4() {
		assertEquals(Welcome.welcome("amy,bob"),"Hello, Amy, Bob");
	}
	
	@Test
	void testEx5() {
		assertEquals(Welcome.welcome("Amy,bob,jerry"),"Hello, Amy, Bob, Jerry");
	}
}
