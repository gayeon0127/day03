package operator;

public class Ex02 {
public static void main(String[] args) {
	int su;
	su=8;
	String s =(su%2==0)? "짝수":"홀수";
	System.out.println(su+" : "+s);
	
	s = (su%3==0)?"3의배수":"3의배수아님";
	System.out.println(s);
}
}
