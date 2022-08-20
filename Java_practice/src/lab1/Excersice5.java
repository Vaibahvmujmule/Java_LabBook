package lab1;

import java.util.Scanner;

public class Excersice5 {
	public int calculateSum(int n) {
		int s1 = 0;
		int s2 = 0;
		int s3 = 0;
		for (int i = 1; i <= n; i++) {
			if (i % 3 == 0) {
				s1 = s1 + i;
			}
		}
		for (int i = 1; i <= n; i++) {
			if (i % 5 == 0) {
				s2 = s2 + i;
			}
		}
		for (int i = 1; i <= n; i++) {
			if (i % 15 == 0) {
				s3 = s3 + i;
			}
		}
		int sum = s1 + s2 - s3;
		return sum;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Excersice5 ob = new Excersice5();
		int sum = ob.calculateSum(n);
		System.out.println(sum);
	}
}
