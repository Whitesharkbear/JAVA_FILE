package ch4;

import java.util.Scanner;

public class SwitchTest2 {

	public static void main(String[] args) {
		String grade="";
		Scanner sc=new Scanner(System.in);
		System.out.println("학년을 입력하라");
		grade=sc.next();
		switch(grade){
		case "1학년":
			System.out.println("1학년 입니다");
			break;
		case "2학년":
			System.out.println("2학년 입니다");
			break;
		case "3학년":
			System.out.println("3학년 입니다");
			break;
		case "4학년":
			System.out.println("4학년 입니다");
			break;
		default:
			System.out.println("학년을 잘못입력하셨습니다");
			break;
		}


	}

}
