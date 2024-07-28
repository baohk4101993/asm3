package main.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class EditDistanceTest {

	private EditDistance mockEditDistance;
	
	@BeforeEach
	void setUp() throws Exception {
		mockEditDistance = new EditDistance();
	}

	@AfterEach
	void tearDown() throws Exception {
		mockEditDistance = null;
	}

	/* Input: mockEditDistance = new EditDistance()
	 * 		  word1 = "a"
	 * 		  word2 = "ab"
	 * Expected: actual equals 1
	 * */
	@Test
	void test_minDistance() {
		try {
			int actual = mockEditDistance.minDistance("a", "ab");
			assertEquals(1, actual);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			fail();
		}
		
	}
}
