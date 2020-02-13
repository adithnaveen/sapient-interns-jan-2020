package com.company.bl.tests;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import com.company.bl.TestMe;

public class TestMeTest {

	@BeforeClass
	public static void setUpBeforeClass() {
		System.out.println("i'm first guy in your test case ");
	}
	
	@AfterClass
	public static void tearDownAfterClass() {
		System.out.println("i'm last guy in your test case ");
	}
	
	private TestMe t;

	// you can have N number of setup
	@Before
	public void setUp() {
		System.out.println("hi i'm in before ");
		t = new TestMe();
	}

	@After
	public void tearDown() {
		System.out.println("hi i'm from after ");
	}

	@Test
	public void test() {
		assertTrue("Checking if the method returns true", t.sayHi());
	}

	@Test(timeout = 1500)
	public void testSpeed() {
		String message = "Hi how are you doing";

		assertEquals("Checking two messaged for speed", "Message " + message, t.testTime(message));
	}

	@Test
	public void nameTest() {

		String name = "Kumar";
		assertEquals("Hi " + name, t.sayHi(name));
	}

	@Test(expected = RuntimeException.class)
	public void checkToThrowExceptionForGivenIntegerTest() {
		int val = 0;
		assertEquals(t.throwsSomeException(val), val);
	}

}



















