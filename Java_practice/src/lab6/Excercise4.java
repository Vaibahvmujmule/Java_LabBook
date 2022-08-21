package lab6;

import java.security.KeyStore.Entry;
import java.util.*;

public class Excercise4 {
	public Map getStudents(Map stds) {
		Map<Integer, String> winstds = new HashMap();

		Set<Entry> entries = stds.entrySet();

		String[] medal = { "Gold", "Silver", "Bronze" };

		for (Entry entry : entries) {
			Integer regno = entry.getKey();
			Integer marks = entry.getValue();

			// marks condition
			if (marks >= 90) {
				winstds.put(regno, medal[0]);
			} else if (marks < 90 && marks >= 80) {
				winstds.put(regno, medal[1]);
			} else if (marks < 80 && marks >= 70) {
				winstds.put(regno, medal[2]);
			}
		}
		return winstds;
	}

	public static void main(String[] args) {
		Map<Integer, Integer> stds = new HashMap();

		stds.put(1, 38);
		stds.put(2, 90);
		stds.put(3, 98);
		stds.put(4, 78);
		stds.put(5, 88);
		stds.put(6, 68);

		Excercise4 e4 = new Excercise4();
		System.out.println(e4.getStudents(stds));
	}
}