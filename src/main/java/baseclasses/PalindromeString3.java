package baseclasses;

public class PalindromeString3 {

	public static void main(String[] args) {
		
		String S = "Selenium";
		
		String rev  = "";
		
		for(int i=S.length()-1;i>=0;i--) {
			
			rev = rev+S.charAt(i);
		}
		
		if(S.equals(rev)) {
			
			System.out.println("palindrome");
		}
		
		else {
			
			System.out.println("not palindrome");
		}
	}
}
