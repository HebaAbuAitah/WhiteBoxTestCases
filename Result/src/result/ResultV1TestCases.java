package result;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
class ResultV1TestCases {

	private ResultV1 ResultV1 ;
	@BeforeEach
	void setUp() throws Exception {
		this.ResultV1 = new ResultV1();
	}
	@Test
	void test1() {
		assertEquals("Positive Result", this.ResultV1.TestResult(5, 3, 2));
	}
	@Test
	void test2() {
		assertEquals("Negative Result", this.ResultV1.TestResult(-2, 3, 1));
	}
	@Test
	void test3() {
		assertEquals("Negative Result", this.ResultV1.TestResult(7, 1, 3));
	}
	@Test
	void test4() {
		assertEquals("Positive Result", this.ResultV1.TestResult(-2, 1, 3));
	}
	@Test
	void test5() {
		assertEquals("0", this.ResultV1.TestResult(0, 3, 2));
	}
	@Test
	void test6() {
		assertEquals("0", this.ResultV1.TestResult(5, 3, 3));
	}
	void test7() {
		assertEquals("0", this.ResultV1.TestResult(-5, 3, 3));
	}
	
}
