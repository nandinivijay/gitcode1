package gitcode.gitcode;

import org.testng.Assert;
import org.testng.annotations.Test;

public class WordLength {



	int wordlength(String word)
	{
		return word.length();

	}	

	int sum_of_two_numbers( int number1, int number2)
	{
		return number1+number2;
	}
	
	@Test
	public void testCase1() {
		String input = "Hello";
		int output = wordlength(input);
		Assert.assertEquals(output, 5);	
		}
	@Test
	public void testCase2() {
		
		Assert.assertEquals(sum_of_two_numbers(1, 2),3);	
		}

	

}
