/**
 * 
 */
package Testing_Loggers;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertNull;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * @author SRIKAR
 *
 */
public class AssertClass {
	
	@Test
	public void testAssertionsmethod() {
		String s0 = new String("Virtusa");
		String s1 = new String("Virtusa");
		String s2 = null;
		String s3 = "Virtusa";
		String s4 = "Virtusa";
		int value1 = 5;
		int value2 = 7;
		String[] exceptArray= {"one","two","three"};
		String[] resultArray= {"one","two","three"};
		assertEquals(s0,s1);
		
		//check for true
		assertTrue(value1<value2);
		
		assertFalse(value1>value2);
		
		assertNotNull(s0);
		
		//check for null
		assertNull(s2);
		
	}

}
