package if_else;

import java.util.Scanner;

public class practice {
public static void main(String[] args) {
	
	// 2의 배수이고 5의 배수인 수인지 판별
	Scanner scan = new Scanner(System.in);
	
	int num;
	String result=null;
	
	System.out.print("숫자를 입력하세요 : ");
	num = scan.nextInt();
	
	if (num%2==0 && num%5==0){
	result = "2의 배수이고 5의 배수입니다.";
	} if (num%2!=0 || num%5!=0) {
		result = "2의 배수 또는 5의 배수가 아닙니다.";
	}
	
	System.out.println(num + " : " + result);	
	
	
	// 석주, 두 수를 입력 받아 두 수의 크기 비교하기
	System.out.println("숫자를 2번 입력하세요");
	System.out.print("첫 번째 숫자 : ");
	int su1 = scan.nextInt();
	System.out.print("두 번째 숫자 : ");
	int su2 = scan.nextInt();
	
	if (su1>su2) {
		result = su1 + "이 " + su2+ "보다 큽니다."; 
	}if (su1<su2) {
		result = su2 + "이 " + su1+ "보다 큽니다.";
	}
	System.out.println(result);
	
	
	/* 선우, 입력받은 수가 3또는 5의 배수인지 판별하고, 15의 배수라면 15의 배수라고 출력, 
	45의 배수라면 다시 3또는 5의 배수라고 출력*/
	System.out.print("숫자를 입력하세요 : ");
	num = scan.nextInt();
	result=null;
	
	if (num%45==0 || ((num%3==0 || num%5==0) && num % 15 != 0)) {
		result = num+ "은 3 또는 5의 배수입니다";
	} if (num%45!=0) {
		if (num%15==0) {
			result = num+ "은 15의 배수입니다";
		} if (num%3!=0 && num%5==0) {
			result = num+ "은 3 또는 5의 배수가 아닙니다";
		}
	}
	System.out.println(result);
	
}
}

