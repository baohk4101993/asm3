package main.junit;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import main.java.DecodeWay;

class DecodeWayTest {

	private DecodeWay mockDecodeWay; 

	@BeforeEach
	void setUp() throws Exception {
		mockDecodeWay = new DecodeWay();
	}

	@AfterEach
	void tearDown() throws Exception {
		mockDecodeWay = null;
	}

	/* Input: mockDecodeWay = new DecodeWay()
	 * 		  s = "123"
	 * Expected: actual equals 3
	 * */
	@Test
	void test_numDecodings_normal_case() {
		try {
			// Input
			int actual = mockDecodeWay.numDecodings("123");
			// Expected
			assertEquals(3, actual);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			fail();
		}
	}
	
	/* Input: mockDecodeWay = new DecodeWay()
	 * 		  s = "123"
	 * Expected: actual equals 0
	 * */
	@Test
	void test_numDecodings_s_empty() {
		try {
			// Input
			int actual = mockDecodeWay.numDecodings("");
			// Expected
			assertEquals(0, actual);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			fail();
		}
	}
	
	/* Input: mockDecodeWay = new DecodeWay()
	 * 		  s = "12002"
	 * Expected: actual equals 0
	 * */
	@Test
	void test_numDecodings_s_12002() {
		try {
			// Input
			int actual = mockDecodeWay.numDecodings("12002");
			// Expected
			assertEquals(0, actual);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			fail();
		}
	}
	
	/* Input: mockDecodeWay = new DecodeWay()
	 * 		  s = "120200"
	 * Expected: actual equals 0
	 * */
	@Test
	void test_numDecodings_s_120200() {
		try {
			// Input
			int actual = mockDecodeWay.numDecodings("120200");
			// Expected
			assertEquals(0, actual);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			fail();
		}
	}
	
	/* Input: mockDecodeWay = new DecodeWay()
	 * 		  s = "264597"
	 * Expected: actual equals 3
	 * */
	@Test
	void test_numDecodings_s_264597() {
		try {
			// Input
			int actual = mockDecodeWay.numDecodings("264597");
			// Expected
			assertEquals(2, actual);
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
			fail();
		}
	}


}
