package lab2;

import java.util.Scanner;

public class Excersice1 {
	int getSecondSmallest(int[] a) {
		int newint;
		for (int i = 0; i < a.length; i++) {
			for (int j = i + 1; j < a.length; j++) {
				if (a[i] > a[j]) {
					newint = a[i];
					a[i] = a[j];
					a[j] = newint;
				}
			}
		}
		return a[1];
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] a = new int[10];
		for (int i = 0; i < a.length; i++) {
			a[i] = sc.nextInt();
		}
		Excersice1 ob = new Excersice1();
		int secod = ob.getSecondSmallest(a);
		System.out.println(secod);

	}

}