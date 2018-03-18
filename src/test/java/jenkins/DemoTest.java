package jenkins;

import static org.junit.Assert.*;

import org.junit.Test;

public class DemoTest {

	Demo helper = new Demo();
	
	@Test
	public void testTruncateAInFirst2Positions() {

		assertEquals("CD", helper.truncateAInFirst2Positions("AACD"));
	}

	@Test
	public void testTruncateAInFirst2Positions2() {

		assertEquals("CD", helper.truncateAInFirst2Positions("ACD"));
	}

}
