package traingle;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import static traingle.TriangleType.EQUILATERAL;
import static traingle.TriangleType.NotTriangle;
import static traingle.TriangleType.ISOSCELES;
import static traingle.TriangleType.SCALENE;

class TriangleTestCasesV3 {

	@Test
	  public void test1() {
	    final TriangleType type = TraingleClassV3.classify(5, 3, 4);
	    assertEquals(SCALENE, type);
	  }

	  @Test
	  public void test2() {
	    final TriangleType type = TraingleClassV3.classify(1, 3, 5);
	    assertEquals(NotTriangle, type);
	  }

	  @Test
	  public void test3() {
	    final TriangleType type = TraingleClassV3.classify(1, 4, 2);
	    assertEquals(NotTriangle, type);
	  }

	  @Test
	  public void test4() {
	    final TriangleType type = TraingleClassV3.classify(4, 1, 2);
	    assertEquals(NotTriangle, type);

	  }

	  @Test
	  public void test5() {
	    final TriangleType type = TraingleClassV3.classify(-2, 2, 2);
	    assertEquals(NotTriangle, type);
	  }

	  @Test
	  public void test6() {
	    final TriangleType type = TraingleClassV3.classify(2, -2, 2);
	    assertEquals(NotTriangle, type);
	  }

	  @Test
	  public void test7() {
	    final TriangleType type = TraingleClassV3.classify(2, 2, -2);
	    assertEquals(NotTriangle, type);
	  }

	  @Test
	  public void test8() {
	    final TriangleType type = TraingleClassV3.classify(1, 1, 1);
	    assertEquals(EQUILATERAL, type);
	  }

	  @Test
	  public void test9() {
	    final TriangleType type = TraingleClassV3.classify(3, 3, 4);
	    assertEquals(ISOSCELES, type);
	  }

	  @Test
	  public void test10() {
	    final TriangleType type = TraingleClassV3.classify(3, 4, 3);
	    assertEquals(ISOSCELES, type);
	  }

	  @Test
	  public void test11() {
	    final TriangleType type = TraingleClassV3.classify(4, 3, 3);
	    assertEquals(ISOSCELES, type);
	  }
	  @Test
	  public void test12() {
	    final TriangleType type = TraingleClassV3.classify(5, 2,2);
	    assertEquals(NotTriangle, type);
	  }
	  @Test
	  public void test13() {
	    final TriangleType type = TraingleClassV3.classify(5, 2,0);
	    assertEquals(NotTriangle, type);
	  }



}
