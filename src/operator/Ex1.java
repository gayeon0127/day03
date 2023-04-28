package operator;

import java.util.Scanner;

public class Ex1 {
	public static void main(String[] args) {
	 System.out.print("수 입력 :");
	 Scanner scan = new Scanner(System.in);
	 int su = scan.nextInt();
	 String s =(su%2==0)? "짝수":"홀수"; 
	 System.out.println(su + " = " + s);
	 s = (su%3==0)?"3의 배수":"3의 배수가 아니다";
	 System.out.println(su + " = " + s);
	 
	 System.out.print("두 수 입력 : ");
	 su = scan.nextInt(); 
	 int su2 = scan.nextInt();
	 System.out.println("num1 : " + su + ", num2 : " + su2);
	 s = (su>su2)?"num1이 num2보다 크다":"num2가 num1보다 크다";
	 System.out.println(s);
	}
}

