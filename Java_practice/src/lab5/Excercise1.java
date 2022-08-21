package lab5;

import java.util.Scanner;
//created exception class
class myexception extends Exception {
	public myexception(String msg) {
		super(msg);
	}
}

public class Excercise1 {
	int age;

	Excercise1(int age) {
		this.age = age;
	}

	public static void main(String[] args) throws myexception {
		try {
			Scanner sc = new Scanner(System.in);
			int age = sc.nextInt();
			sc.close();
			if (age < 15) {
				throw new myexception("You age is below 15 years ");
			}
			Excercise1 e1 = new Excercise1(age);
		} catch (myexception e) {
			System.out.println(e);

		}
		System.out.println("End of code");

	}

}
