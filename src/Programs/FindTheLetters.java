package Programs;

public class FindTheLetters {
	
	

	public static void main(String[] args) {
		String s="ACSDGneeLu18@gmail.com";
		
		int capital=0;
		int small=0;
		int num=0;
		int special=0;
		
		
		for(int i=0;i<s.length();i++) {
			char c=s.charAt(i);
			if(Character.isUpperCase(c)) {
				capital++;
			}
			else if(Character.isLowerCase(c)) {
				small++;
				
			}else if(Character.isDigit(c)) {
				num++;
				
			}else {
				special++;
			}
		}
		System.out.println("capitaLetters:"+capital);
		System.out.println("SmallLettesr:"+small);
		System.out.println("Numbers:"+num);
		System.out.println("SpecialCharacter:"+special);
		
		
		String d="AdHchkUe243)(6";
		
		StringBuilder lett=new StringBuilder();
		for(int i=0;i<d.length();i++) {
			char c=d.charAt(i);
			if(Character.isUpperCase(c)) {
				lett.append(c);
				
			}
			
			
		}
		System.out.println(lett);
		
		
	}


	}


