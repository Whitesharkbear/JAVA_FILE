package ch4;

public class For7 {

	public static void main(String[] args) {
		int i, j;
		for(i=0;i<4;i++){ //삼가형의 세로4줄.
			for(j=1;j<=i+1;j++){ //별의 개수를 행마다 늘려 출력.
				System.out.print("*");
			}
			System.out.println();
		}
		
	}

}
