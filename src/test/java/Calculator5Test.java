/* 
 * JUnit5 test class
 */

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;

public class Calculator5Test {
	static Calculator calculator;
	
	@BeforeEach
	void init() {
		calculator = new Calculator();
    }
	
    @Test
    public void testEvaluate() {
		int sum = calculator.evaluate("1+2+3");
		assertEquals(6, sum);
    }
	@Test
	public void testEvaluate1() {
		int sum = calculator.evaluate("3+4+5");
		assertEquals(12, sum);
    }
}
