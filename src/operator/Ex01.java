package operator;

public class Ex01 {
public static void main(String[] args) {
	// + - * / %
	// 나누기 ; 정수 / 정수 => 몫만
	// %(mod) ; 나머지를 구하는 연산자 예)10%3 = 1 
	
	int num1 = 9, num2 = 2;
	System.out.println(num1/num2);
	System.out.println(num1/(float)num2);
	System.out.println(num1%num2);
	System.out.println("==============");
	
	/* 복합대입연산자
	 	num = 10;
	 	num = num+10; => num +=10;
	 	num = num/10; => num /=10;
	 	num = num%10; => num %=10;
	 */
	int su1,su2;
	su1 = su2 = 5;
	su1+=1; System.out.println(su1);
	su1-=1; System.out.println(su1);
	su1*=su2; System.out.println(su1);
	su1/=su2; System.out.println(su1);
	su1%=su2; System.out.println(su1);
	System.out.println("==============");
	
	
	/* 관계연산자 : T/F의 결과
	 >, <, >=, <=, == !=
	*/
	double do01 =1.1, do02 =1.2;
	System.out.println(do01>=do02);
	System.out.println(do01<=do02);
	System.out.println(do01==do02);
	System.out.println(do01!=do02);
	System.out.println("==============");
	
	
	/* 논리연산자 ; T/F의 결과
	 ||(or); 하나라도 참이면 true
	 &&(and); 모두 참이면 true
	 !(not)
	 */
	int number = 10;
	System.out.println(
			number>5 && number%2 == 0);
	System.out.println("==============");
	System.out.println(true||true);
	System.out.println(true||false);
	System.out.println(false||true);
	System.out.println(false||false);
	System.out.println("==============");
	System.out.println(true&&true);
	System.out.println(true&&false);
	System.out.println(false&&true);
	System.out.println(false&&false);
	System.out.println("==============");
	System.out.println("!true" + !true);
	System.out.println("!false" + !false);
	System.out.println("==============");
	
	
	/*증감 연산자 : 결과적으로 자기 자신을 1 증가 또는 1 감소
	++num
	num++
	num--
	--num
	*/
	
	int n;
	n=5;
	n++;
	System.out.println(n);
	
	n=5;
	++n;
	System.out.println(n);
	
	int a,b,c;
	c=10;
	a=++c;
	
	c=10;
	b=c++;
	
	System.out.println("a: " + a);
	System.out.println("b: " + b);
	System.out.println("c: " + c);
}
}
