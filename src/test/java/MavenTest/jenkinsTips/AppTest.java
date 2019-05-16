package MavenTest.jenkinsTips;

import org.junit.Test;
import static org.junit.Assert.*;

public class AppTest {
	
	@Test
	public void equalsTest1() {
		int a = 1;
		int b = 1;
		
		assertEquals(a,b);
	}
	
	@Test
	public void equalsTest2() {
		String a = "dog";
		String b = "dog";
		
		assertEquals(a,b);
	}
}
