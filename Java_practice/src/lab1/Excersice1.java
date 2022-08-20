package lab1;

import java.util.Scanner;

public class Excersice1 {
	public int cube(int n) {
		return n * n * n;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Excersice1 ob = new Excersice1();
		System.out.println(ob.cube(n));
	}
}
