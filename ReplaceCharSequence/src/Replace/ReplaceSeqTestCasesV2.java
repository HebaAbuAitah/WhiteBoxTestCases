package Replace;
import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ReplaceSeqTestCasesV2 {

	private ReplacSeq2 ReplacSeq2;
	@BeforeEach
	void setUp() throws Exception {
		this.ReplacSeq2 = new ReplacSeq2();
	}

	@Test
	void test1() {
		assertEquals("My Name is Heba", this.ReplacSeq2.collapseWhitespace("My Name is  Heba"));
	}
	@Test
	void test2() {
		assertEquals("My Name is Heba",this.ReplacSeq2.collapseWhitespace("My  Name is    Heba"));
	}
	@Test
	void test3() {
		assertEquals("My Name is Heba",this.ReplacSeq2.collapseWhitespace("My Name is  Heba"));
	}
	@Test
	void test4() {
		assertEquals("", this.ReplacSeq2.collapseWhitespace(""));
	}
	@Test
	void test5() {
		assertEquals("My Name is Heba", this.ReplacSeq2.collapseWhitespace("My Name is Heba"));
	}
	@Test
	void test6() {
		assertEquals(" Heba", this.ReplacSeq2.collapseWhitespace("  Heba"));
	}
	@Test
	void test7() {
		assertEquals(" My Name is Heba ", this.ReplacSeq2.collapseWhitespace("  My Name is  Heba   "));
	}
	@Test
	void test8() {
		assertEquals(" ", this.ReplacSeq2.collapseWhitespace("  "));
	}
	
	
}
