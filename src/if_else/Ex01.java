package if_else;

import java.util.Scanner;

public class Ex01 {

	public static void main(String[] args) {
	 Scanner input = new Scanner(System.in);
	 int num;
	 System.out.println("1. easy");
	 System.out.println("2. hard");
	 System.out.print(">>> : ");
	 num = input.nextInt();
	 if (num == 1) {
		 System.out.println("easy mood");
	 } else {
		 System.out.println("hard mood");
	 }
	 System.out.println("다음 문장 실행");
	}

}


