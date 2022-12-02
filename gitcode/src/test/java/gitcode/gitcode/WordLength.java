package gitcode.gitcode;

public class WordLength {
	public static void main(String args[])
	{
		WordLength obj = new WordLength();
		System.out.println("Wordlength" + obj.wordlength("Hello"));
		System.out.println("sum of the numbers" + obj.sum_of_two_numbers(1, 2));
	}
	int wordlength(String word)
	{
		return word.length();
	}
	int sum_of_two_numbers( int number1, int number2)
	{
		return number1+number2;
	}
}
