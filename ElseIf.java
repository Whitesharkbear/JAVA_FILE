package ch4;

import java.util.Scanner;

public class ElseIf {

	public static void main(String[] args) {
		int jumsu;
		Scanner sc=new Scanner(System.in);
		System.out.println("점수를 입력하라");
		jumsu=sc.nextInt();
		if(jumsu>=90){						//90이상
			System.out.println("A");
		}else if(jumsu>=80){				//80이상 90미만
			System.out.println("B");
		}else if(jumsu>=70){				//70이상 80미만
			System.out.println("C");
		}else if(jumsu>=60){				//60이상 70미만
			System.out.println("D");
		}else{								//60미만
			System.out.println("F");
		}

	}

}
