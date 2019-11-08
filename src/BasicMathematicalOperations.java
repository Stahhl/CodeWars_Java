import org.junit.Test;

import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.is;
import static org.hamcrest.MatcherAssert.assertThat;

import org.junit.runners.JUnit4;

public class BasicMathematicalOperations {
    public static Integer basicMath(String op, int v1, int v2) {
        return
                op == "+" ? v1 + v2 :
                        op == "-" ? v1 - v2 :
                                op == "*" ? v1 * v2 :
                                        op == "/" ? v1 / v2 :
                                                0;
    }

    @Test
    public void testBasics() {
        System.out.println("Basic Tests");
        assertThat(basicMath("+", 4, 7), is(11));
        assertThat(basicMath("-", 15, 18), is(-3));
        assertThat(basicMath("*", 5, 5), is(25));
        assertThat(basicMath("/", 49, 7), is(7));
    }
}
