import java.util.Scanner;
/**
 * Class for testing PalindromeChecker class and its method
 * @author Fanni Kertesz
 * @version 9/21/23
 */
public class Application
{
	public static void main(String[] args)
	{
		PalindromeChecker pm = new PalindromeChecker();//new PalindromeChecker object
		Scanner scan = new Scanner(System.in);//new Scanner object
		boolean go = true;//boolean for the while loop
		
		while(go)
		{
			//intakes potential palindrome from user
			System.out.println("Enter a potential palindrome: ");
			String str = scan.nextLine();
			//returns if palindrome accordingly
			if(pm.checkString(str))
			{
				System.out.println(str + " is a palindrome!");
			}
			else
			{
				System.out.println(str + " is not a palindrome.");
			}
			//asks user if they want to test another string
			System.out.println("Would you like to test another string?(y/n)");
			String answer = scan.next();
			answer = answer.toLowerCase();
			//ends loop if answer is "n"
			if(answer.equals("n"))
				go = false;
			scan.nextLine();//finishes line so the first nextLine works properly
		}//end while
	}//end main
}//end class
