package Date2209practice;

public class Palindromenumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				       
		     int n=121;
		        int original = n;
		        int reverse = 0;

		        for (; n > 0; n = n / 10) {
		            int digit = n % 10;
		            reverse = reverse * 10 + digit;
		        }

		        if (reverse == original)
		            System.out.println(original + " is a Palindrome Number");
		        else
		            System.out.println(original + " is not a Palindrome Number");
		    }
		}



