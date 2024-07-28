package main.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class FirstUniqueCharacterInAStringTest {

	private FirstUniqueCharacterInAString mockFirstUniqueCharacterInAString;
	
	@BeforeEach
	void setUp() throws Exception {
		mockFirstUniqueCharacterInAString = new FirstUniqueCharacterInAString();
	}

	@AfterEach
	void tearDown() throws Exception {
		mockFirstUniqueCharacterInAString = null;
	}

	@Test
	void test_firstUniqChar() {
		try {
			int actual = mockFirstUniqueCharacterInAString.firstUniqChar("ABCCBA");
			assertEquals(-1, actual);
		} catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}

	@Test
	void test_firstUniqChar_1() {
		try {
			int actual = mockFirstUniqueCharacterInAString.firstUniqChar("so");
			assertEquals(-1, actual);
		} catch(Exception e) {
			e.printStackTrace();
			fail();
		}
	}
}
