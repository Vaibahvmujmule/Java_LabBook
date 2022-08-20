package lab3;
//need to create 3 methods
//1.To count no of characters
//2.To count no of words 
//3.To count no of lines 
public class Excersice5 {
	public int count_char(String s) {
		String t=s.replaceAll("\\s", "");
		return t.length();
	}
	
	
 public static void main(String[] args) {
	String s ="Hi My name is Vaibhav";
	Excersice5 ob =new Excersice5();
	System.out.println(ob.count_char(s));
}
}
