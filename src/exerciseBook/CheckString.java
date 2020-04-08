package exerciseBook;

public class CheckString {
	
	public boolean strMatch(String a) {
		
		boolean check;
		String str1 = "football";
		
		if (a == str1) {
			check = true;
			System.out.println("Strings match");
		}else {
			check = false;
			System.out.println("Strings do not match");
		}
		
		return check;
		
	}
	
	public boolean checkStr(String str1, String str2) {
		
		boolean check;
		if (str1 == str2) {
			check = true;
			System.out.println("Strings match");			
		}else {
			check = false;
			System.out.println("Strings don't match");

		}
		return check;
	}

}
