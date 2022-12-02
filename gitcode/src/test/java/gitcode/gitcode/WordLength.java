package gitcode.gitcode;

public class WordLength {
	public static void main(String args[])
	{
		WordLength obj = new WordLength();
		System.out.println("Wordlength" + obj.wordlength("Hello"));
		
	}
	int wordlength(String word)
	{
		return word.length();
	}

}
