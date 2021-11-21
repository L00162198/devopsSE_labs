package labcode;

import static org.junit.Assert.*;

import org.junit.Test;

public class codde_test {

	@Test
	public void test() {

		{
			code code = new code ();
			
			String result = code.concatenate("one","two");
			
			assertEquals("onetwo", result);
			
		}
	}

}
