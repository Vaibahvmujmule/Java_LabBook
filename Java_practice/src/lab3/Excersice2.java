package lab3;

import java.util.Scanner;

public class Excersice2 {
	public void mirrorString(String st) {
		String rev = "";
		char ch;
		for (int i = 0; i < st.length(); i++) {
			ch = st.charAt(i);
			rev = ch + rev;
		}
		System.out.println(st + "|" + rev);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		String st = sc.nextLine();
		Excersice2 ob = new Excersice2();
		ob.mirrorString(st);
	}
}
