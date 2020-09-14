
public class Calc {

	public int add(int i, int k) {
		return i + k;
	}
	
	public boolean or(boolean a, boolean b) {
		return a || b;
	}
	
	public boolean isPalindrome(String str) {
		boolean isPal = true;
		for(int i = 0; i < str.length();i++) {
			if(str.charAt(i) != str.charAt(str.length()-i-1)) {
				isPal = false;
			}
		}
		return isPal;
	}
}
