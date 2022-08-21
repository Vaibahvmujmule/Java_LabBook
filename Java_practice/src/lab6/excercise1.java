package lab6;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class excercise1 {
	List getValues(HashMap<Integer, Integer> map) {
		List<Integer> store = new ArrayList<>();
		for (int n : map.values()) {
			store.add(n);
		}
		Collections.sort(store);
		return store;
	}

	public static void main(String[] args) {
		HashMap<Integer, Integer> map = new HashMap<>();
		Scanner sc = new Scanner(System.in);
		for (int i = 0; i < 5; i++) {
			int k = sc.nextInt();
			int v = sc.nextInt();
			map.put(k, v);
		}

		
		excercise1 e1 = new excercise1();
		System.out.println(e1.getValues(map));

	}

}
