package lab1;

import java.util.*;

public class Excersice3 {
	int fib(int n) {
		if (n <= 1) {
			return n;
		}

		return fib(n - 1) + fib(n - 2);
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Excersice3 ob = new Excersice3();
		int n = sc.nextInt();
		System.out.println(ob.fib(n));

	}
}
