package traingle;

public class TraingleClassV3 {
	public static TriangleType classify(final int a, final int b, final int c) {
	    int trian;
	    if ((a <= 0) || (b <= 0) || (c <= 0)) {
	      return TriangleType.NotTriangle;
	    }
	    trian = 0;
	    if (a == b) {
	      trian = trian + 1;
	    }
	    if (a == c) {
	      trian = trian + 2;
	    }
	    if (b == c) {
	      trian = trian + 3;
	    }
	    if (trian == 0) {
	      if (((a + b) < c) || ((a + c) < b) || ((b + c) < a)) {
	        return TriangleType.NotTriangle;
	      } else {
	        return TriangleType.SCALENE;
	      }
	    }
	    if (trian > 3) {
	      return TriangleType.EQUILATERAL;
	    }
	    if ((trian == 1) && ((a + b) > c)) {
	      return TriangleType.ISOSCELES;
	    } else if ((trian == 2) && ((a + c) < b)) {//Modified
	      return TriangleType.ISOSCELES;
	    } else if ((trian == 3) && ((b + c) > a)) {
	      return TriangleType.ISOSCELES;
	    }
	    return TriangleType.NotTriangle;
	  }



}
