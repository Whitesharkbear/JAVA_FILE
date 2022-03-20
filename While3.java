package ch4;

import java.util.Scanner;

public class While3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int i = 1, a;
		System.out.println("약수를 구할 숫자를 입력하라");
		a = sc.nextInt();
		while (i <= a) {
			if (a % i == 0) {
				System.out.print(i + "\t");
			}
			i++;
		}

	}

}
