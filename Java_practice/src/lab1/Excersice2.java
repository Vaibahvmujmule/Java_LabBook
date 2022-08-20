package lab1;

import java.util.Scanner;

public class Excersice2 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the traffic color");
		String st = sc.nextLine();
		switch (st) {
		case "red":
			System.out.println("stop");
			break;
		case "yellow":
			System.out.println("Ready");
			break;
		case "green":
			System.out.println("Go");
			break;
		default:
			System.out.println("Enter correct color");
		}
	}

}
