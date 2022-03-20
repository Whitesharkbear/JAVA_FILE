package ch4;

public class Break {

	public static void main(String[] args) {
		int i = 1;
		for (;;) {
			System.out.print((i++)+"\t");
			if (i == 11) {
				break;
			}
		}

	}

}
