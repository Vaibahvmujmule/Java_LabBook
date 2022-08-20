package lab2;

import java.text.Collator;
import java.util.Arrays;

public class Excersice2 {
	public String[] sortString(String[] St) {
		Arrays.sort(St, Collator.getInstance());
		int len = St.length;
		if (len % 2 == 0) {
			for (int i = 0; i < len / 2; i++) {
				St[i] = St[i].toUpperCase();
			}
		} else {
			for (int i = 0; i < (len + 1) / 2; i++) {
				St[i] = St[i].toUpperCase();
			}
		}
		return St;
	}

	public static void main(String[] args) {
		Excersice2 ob = new Excersice2();
		String[] st = { "vaibhav", "sam", "mair", "tanvir", "ali", "rakhi", "treas" };
		String[] sorted = ob.sortString(st);
		for (int i = 0; i < sorted.length; i++) {
			System.out.println(sorted[i]);
		}
	}
}
