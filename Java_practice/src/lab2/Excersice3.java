package lab2;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

public class Excersice3 {

	static int reversDigits(int num) {
		int rev_num = 0;
		while (num > 0) {
			rev_num = rev_num * 10 + num % 10;
			num = num / 10;
		}
		return rev_num;
	}

	static int[] sortedarr(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			arr[i] = reversDigits(arr[i]);
		}
		return arr;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int[] arr = new int[5];
		for (int i = 0; i < arr.length; i++) {
			arr[i] = sc.nextInt();
		}
		int[] ar = sortedarr(arr);
		Arrays.sort(ar);
		System.out.println(Arrays.toString(ar));
	}
}
