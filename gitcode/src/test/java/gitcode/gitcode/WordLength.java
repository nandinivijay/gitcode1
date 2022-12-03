package gitcode.gitcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordLength {
	
	int wordlength(String word)
	{
		return word.length();
	}	
	
	@Test
	public void testCase1() {
		String input = "Hello";
		int output = wordlength(input);
		Assert.assertEquals(output, 5);	
		}

	
}
