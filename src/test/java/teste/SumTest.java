package teste;

import application.Sum;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SumTest {
	
	@Test
	public void sumTest() {
		Sum account = new Sum();
		double result = account.sum(10.0, 5.0);
		assertEquals(15.0, result, 0.1);
	}
}
