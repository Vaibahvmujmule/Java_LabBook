package lab3;
//need to create 3 methods
//1.To count no of characters
//2.To count no of words 
//3.To count no of lines 
public class Excersice5 {
	//to count letters
	public int count_char(String s) {
		String t=s.replaceAll("\\s", "");
		return t.length();
	}
	//to count words
	public int count_word(String s) {
		int count=1;
		for(int i=0;i<s.length()-1;i++) {
			if(s.charAt(i) == ' ' && s.charAt(i+1)!=' ') {
				count =count+1;
			}
		}
		return count;
	}
	//to count number of lines
	
	
 public static void main(String[] args) {
	String s ="Hi My name is Vaibhav";
	Excersice5 ob =new Excersice5();
	System.out.println(ob.count_char(s));
	System.out.println(ob.count_word(s));
}
}
