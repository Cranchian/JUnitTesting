import static org.junit.Assert.*;

import org.junit.Test;

public class testAddNumbers {

	@Test
	public void test() {
		JUnitTesting junit = new JUnitTesting();
		int result = junit.addNumbers(100,101);
		assertEquals(201,result);
		
		
	}

}
