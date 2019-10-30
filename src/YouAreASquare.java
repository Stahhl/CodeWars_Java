import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class YouAreASquare {
	public static boolean isSquare(int n) {

		double sqr = Math.sqrt(n);

		return ((sqr - Math.floor(sqr)) == 0);
	}

	@Test
	public void shouldWorkForSomeExamples() throws Exception {
		assertEquals("negative numbers aren't square numbers", false, isSquare(-1));
		assertEquals("0 is a square number (0 * 0)", true, isSquare(0));
		assertEquals("3 isn't a square number", false, isSquare(3));
		assertEquals("4 is a square number (2 * 2)", true, isSquare(4));
		assertEquals("25 is a square number (5 * 5)", true, isSquare(25));
		assertEquals("26 isn't a square number", false, isSquare(26));
	}
}