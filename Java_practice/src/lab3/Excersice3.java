package lab3;
//approach: need to create two methods
//1.to check if char is vowel or consonant
//2.to replace string consonant with next one

public class Excersice3 {
	boolean checkvowel(char c) {
		{
		    if (c != 'a' && c != 'e' && c != 'i' && c != 'o'
		        && c != 'u')
		        return false;
		 
		    return true;
		}
	}
	public String nextconsonant(char[] s) {
		  for (int i = 0; i < s.length; i++) {
	            if (!checkvowel(s[i])) {
	 
	               //checked if letter is z or not
	                if (s[i] == 'z') {
	                    s[i] = 'b';
	                }
	 
	            
	                else {
	 
	                   
	                    s[i] = (char)(s[i] + 1);
	 
	                   //we check next consonant is vowel or not if that happen we will take next consonant
	                    if (checkvowel(s[i])) {
	                        s[i] = (char)(s[i] + 1);
	                    }
	                }
	            }
	        }
	        return String.valueOf(s);
	}
            public static void main(String[] args) {
				Excersice3 ob=new Excersice3();
				String s = "geeksforgeeks";
		        System.out.println(
		           ob.nextconsonant(s.toCharArray()));
            	
            	
			}
}
