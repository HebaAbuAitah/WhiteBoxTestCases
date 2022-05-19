package Replace;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;



class ReplaceSeqTestCases {

	private ReplacSeq ReplacSeq;
	@BeforeEach
	void setUp() throws Exception {
		this.ReplacSeq = new ReplacSeq();
	}

	@Test
	void test1() {
		assertEquals("My Name is Heba", this.ReplacSeq.collapseWhitespace("My Name is  Heba"));
	}
	@Test
	void test2() {
		assertEquals("My Name is Heba",this.ReplacSeq.collapseWhitespace("My  Name is    Heba"));
	}
	@Test
	void test3() {
		assertEquals("My Name is Heba",this.ReplacSeq.collapseWhitespace("My Name is  Heba"));
	}
	@Test
	void test4() {
		assertEquals("", this.ReplacSeq.collapseWhitespace(""));
	}
	@Test
	void test5() {
		assertEquals("My Name is Heba", this.ReplacSeq.collapseWhitespace("My Name is Heba"));
	}
	@Test
	void test6() {
		assertEquals(" Heba", this.ReplacSeq.collapseWhitespace("  Heba"));
	}
	@Test
	void test7() {
		assertEquals(" My Name is Heba ", this.ReplacSeq.collapseWhitespace("  My Name is  Heba   "));
	}
	@Test
	void test8() {
		assertEquals(" ", this.ReplacSeq.collapseWhitespace("  "));
	}
	
	

}
