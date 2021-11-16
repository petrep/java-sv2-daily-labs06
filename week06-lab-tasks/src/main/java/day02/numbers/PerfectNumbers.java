package day02.numbers;

public class PerfectNumbers {
	public boolean isPerfectNumber(int i) {
		int sum = 0;
		for (int j = 1; j < i; j++) {
			if (i % j == 0) sum += j;
		}

		return i == sum;
	}
}
