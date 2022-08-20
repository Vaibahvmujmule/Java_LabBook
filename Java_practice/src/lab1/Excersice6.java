package lab1;

import java.util.Scanner;

public class Excersice6 {
	public int calculateDiff(int n) {
		int s1 = 0;
		int s2 = 0;
		for (int i = 1; i <= n; i++) {
			s1 = s1 + (i * i);
			s2 = s2 + i;
		}
		int sum = s1 - (s2 * s2);
		return sum;

	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Excersice6 ob = new Excersice6();
		int sum = ob.calculateDiff(n);
		System.out.println(sum);
	}
}
