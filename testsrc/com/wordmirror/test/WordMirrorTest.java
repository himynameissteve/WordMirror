package com.wordmirror.test;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import com.wordmirror.main.Main;

public class WordMirrorTest {

	Main program;

	@Before
	public void setUp() throws Exception {
		program = new Main();
	}

	@After
	public void tearDown() throws Exception {
		program = null;
	}

	@Test
	public void testMirrorInput() {
		String testInput = "President of America";
		String expectedResult = "PresiserP of AmeremA";

		Assert.assertEquals(expectedResult, program.mirrorInput(testInput));
	}

}
