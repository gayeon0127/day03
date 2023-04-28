package if_else;

import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		int num;
		System.out.println("수 입력 : ");
		num = input.nextInt();
		if (num>10)
			System.out.println("종속문장 실행");
			System.out.println("종속문장 실행2");
			System.out.println("종속문장 실행3");
		System.out.println("다음 문장 실행 ...");
		System.out.println();
		
		System.out.println("수 입력 : ");
		num = input.nextInt();
		String msg = null;
		if (num%2==0) {
			//System.out.println("입력 값은 짝수 입니다. : " + num);
			msg = "입력 값은 짝수 입니다.";
		}if (num%2!=0) {
			//System.out.println("입력 값은 홀수 입니다. : " + num);
			msg = "입력 값은 홀수 입니다.";
		}
		System.out.println(msg+num);
		System.out.println("다음 문장 실행 ...");
		
		// 예2
		System.out.print("수를 입력하세요 : ");
		int num1 = input.nextInt();
		int result = 0;
		if(num<0) {
			result = -num1;
		} if(num>0) {
			result = num1;
		}
		

	}

}
