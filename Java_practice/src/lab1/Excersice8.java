package lab1;

import java.util.*;

public class Excersice8 {
	public boolean checkpow(int n) {
		boolean flag = true;
		while (n > 1) {
			if (n % 2 != 0) {
				flag = false;
				break;
			}
			n = n / 2;
		}
		return flag;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		Excersice8 ob = new Excersice8();
		boolean re = ob.checkpow(n);
		System.out.println(re);
	}
}
