package lab2;
import java.util.*;
 class Excersice4 {
	public static int removeduplicates(int a[], int n) {
		if (n == 0 || n == 1) {
			return n;
		}

		int[] newarr = new int[n];
		int j = 0;

		for (int i = 0; i < n - 1; i++) {
			if (a[i] != a[i + 1]) {
				newarr[j++] = a[i];
			}
		}

		newarr[j++] = a[n - 1];

		for (int i = 0; i < j; i++) {
			a[i] = newarr[i];
		}

		return j;
	}

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int a[] = new int[n];
		for (int i = 0; i < n; i++) {
			a[i] = sc.nextInt();
		}

		n = removeduplicates(a, n);

		for (int i = 0; i < n; i++) {
			System.out.print(a[i] + " ");
		}

	}
}
