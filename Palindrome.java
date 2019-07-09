package calismaSoru3;

public class Palindrome {

	//SORU 14(PALİNDROME)
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(double i=Math.pow(10, 6)-1;i>=Math.pow(10, 5);i--) {
				if(IsPalindrome((int)(i))==false) {
					continue;
				}
				if(FindMultiples((int)i,3)== true) {
					break;
				}
				
			}
		
	}//end of main function
	
	public static boolean IsPalindrome(int value) {
		String s = String.valueOf(value);
		for(int i=0;i<s.length();i++) {
			if(s.charAt(i)!=s.charAt(s.length()-i-1)) {
				return false;
			}
		}
		 return true;
	}
	public static boolean FindMultiples(int a, int b ) {
		double AltSinir = Math.pow(10, b-1);
		double UstSinir = Math.pow(10, b)-1;
		for(double i=UstSinir;i>=AltSinir;i--) {
			int c=a/(int)i;
			if(a%i==0 && c<=UstSinir && c>=AltSinir) {
				System.out.println(a+"="+i+"*"+c);
				return true;
			}
			
		}
		return false;
	
	}
	
	

}//end of class
