package lab6;

import java.util.Scanner;

public class Excercise2 {
	public int count_char(String s,char c) {
		int count = 0;
		for(int i=0;i<s.length();i++) {
		if(s.charAt(i) == c) 
	 {
			count = count + 1;
		}}
		return count;

	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the string");
		String st=sc.nextLine();
		System.out.println("Enter the charachter");
		String sm=sc.next();
		char c=sm.charAt(0);
		
		
		Excercise2 ob=new Excercise2();
		System.out.println(ob.count_char(st, c));
	}
}
