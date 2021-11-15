package day01;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		PositiveNumberContainer positiveNumberContainer = new PositiveNumberContainer();

		Scanner scanner = new Scanner(System.in);
		System.out.println("Kérlek adj meg egy számot:");
		double number = scanner.nextDouble();

		while (number > 0) {
			positiveNumberContainer.addNumberToList(number);
			number = scanner.nextDouble();
		}
		System.out.println(Arrays.asList(positiveNumberContainer.getMyList()));
	}
}
