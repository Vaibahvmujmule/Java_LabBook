package lab1;

import java.util.*;

public class Excersice4 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		boolean flag;
		for (int i = 2; i < n; i++) {
			flag = false;
			for (int j = 2; j < i; j++) {
				if (i % j == 0) {
					flag = true;
				}

			}
			if (flag == false) {
				System.out.print(i + " ");
			}
		}
	}
}
