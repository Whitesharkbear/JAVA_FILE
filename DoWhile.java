package ch4;

import java.util.Scanner;

public class DoWhile {

	public static void main(String[] args) {
		int i, menu, sum = 0;
		Scanner sc = new Scanner(System.in);

		System.out.println("조건이 항상 false인 do_while");
		do {
			System.out.println("처음은 무조건 실행");
		} while (false);

		System.out.println("더하기 do_while");
		do {
			System.out.println("더할 숫자를 입력하라");
			i = sc.nextInt();
			sum += i;
			System.out.println("더하기를 계속하겠는가? 멈추려면 0을 입력");
			menu = sc.nextInt();
		} while (menu != 0);
		System.out.println("sum = " + sum);
	}
}
