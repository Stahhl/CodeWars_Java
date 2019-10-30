
//https://www.codewars.com/kata/beginner-series-number-3-sum-of-numbers/train/java
import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class SumOfNumbers {
	public int GetSum(int a, int b) {
		int min = Math.min(a, b);
		int max = Math.max(a, b);
		int result = 0;

		for (int i = min; i < max + 1; i++) {
			result += i;
		}
		return result;
	}

	@Test
	public void Test1() {
		assertEquals(-1, GetSum(0, -1));
		assertEquals(1, GetSum(0, 1));
	}
}
