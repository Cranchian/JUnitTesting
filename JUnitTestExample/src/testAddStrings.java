import static org.junit.Assert.*;

import org.junit.Test;

public class testAddStrings {

	@Test
	public void test() {
		JUnitTesting junit = new JUnitTesting();
		String result = junit.addStrings("good","bad");
		assertEquals("goodbad",result);
	}

}
