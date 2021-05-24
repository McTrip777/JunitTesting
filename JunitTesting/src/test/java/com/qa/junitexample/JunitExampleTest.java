package com.qa.junitexample;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.*;

public class JunitExampleTest {
	
	private static MathMethod math;
	private static Blackjack bj;
	
	@BeforeAll
	public static void start() {
		System.out.println("Start");
		math = new MathMethod();
		bj = new Blackjack();
	}
	
	@Test
	public void addTest() {
		assertEquals(10, math.add(5, 5));
	}
	
	@Test
	public void subTest() {
		assertEquals(-5, math.sub(5, 10));
		assertEquals(5, math.sub(10, 5));
	}
	
	@Test
	public void multTest() {
		assertEquals(25, math.mult(5, 5));
		assertEquals(-20, math.mult(5, -4));
	}
	
	@Test
	public void divTest() {
		assertEquals(5f, math.div(5, 1));
		assertEquals(2f, math.div(10, 5));
		assertEquals(2.5f, math.div(10, 4));
	}
	
	@Test
	public void modTest() {
		assertEquals(2, math.mod(10, 4));
	}
	
	@Test
	public void blackJackTest() {
		assertEquals(20, bj.play(20, 20));
		assertEquals(0, bj.play(23, 22));
		assertEquals(21, bj.play(15, 21));
	}
	
	@AfterAll
	public static void end() {
		System.out.println("End");
	}
}
