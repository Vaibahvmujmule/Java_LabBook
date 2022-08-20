package lab1;

import java.util.Scanner;

public class Excersice7 {
	public boolean checkNum(int n) {
		boolean flag = false;
		int x = n % 10;
		n = n / 10;
		while (n > 1) {
			if (x > (n % 10)) {
				flag = true;
				break;

			}
			x = n % 10;
			n = n / 10;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Excersice7 ob = new Excersice7();
		boolean re = ob.checkNum(n);
		System.out.print(re);
	}
}
