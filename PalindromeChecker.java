import java.util.Stack;
/**
 * PalindromeChecker class for checking if a string is a palindrome
 * @author Fanni Kertesz
 * @version 9/21/23
 */
public class PalindromeChecker
{
	//empty argument constructor
	public PalindromeChecker()
	{
	}//end constructor
	
	/**
	 * method checks if a string is a palindrome
	 * @param str string to check
	 * @return true if palindrome, false if not
	 */
	public boolean checkString(String str)
	{
		//turn string lowercase and put in a char array
		str = str.toLowerCase();
		char[] chars = str.toCharArray();
		char[] letters = new char[chars.length];
		boolean p = false;//for return value
		int n=0;//for counting number of letters
		Stack stack = new Stack();//stack used for checking palindrome
		
		//get only the letters in an array
		for(int i = 0; i < chars.length; i++)
		{
			if(!(checkSymbol((Character)chars[i])))
			{
				letters[n] = chars[i];
				n++;//counts number of letters
			}
		}
		
		//iterate through letters
		for(int i = 0; i<n; i++)
		{
			//push the letters on the stack
			stack.push(letters[i]);
			
		}//end for	
		
		//checks if the next letter in the array equals the top letter of the stack
		for(int i = 0; i<n; i++)
		{
				if(((Character) letters[i]).equals((Character) stack.peek()))
				{
					stack.pop();
					if(i==n-1)
					{
						//sets p true if up to the last letter the letters are equal
						p = true;
					}
				}
				else
				{
					i = n;//to end the for loop
					p = false;
				}
		}//end for
			
		return p;
		
	}//end checkString
	
	/**
	 * private method for checking if a character is a symbol
	 * @param c character to check
	 * @return true if character is symbol, false if not
	 */
	private boolean checkSymbol(Character c)
	{
		boolean b = false;
		Character[] array = {' ', ',', '.', ':', ';', '\'', '"', '-'};
		//iterates through array to check each one
		for(int j = 0; j<8; j++)
		{
			b = c.equals(array[j]);
			//if character is a symbol, it ends the loop
			if(b)
			{
				j = 8;
			}
			
		}
		return b;
	}
}
