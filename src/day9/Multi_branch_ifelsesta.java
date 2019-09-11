package day9;

public class Multi_branch_ifelsesta {
	public static void main(String[] args) {
		//'if else'  is only for 2 statement, 'else if ' is for multiple statement. is it like that?
		
	
	
//	int grade = 85;
//	if(grade>=90) {
//		System.out.println("You have made A");
//		
//	}
//	else if(grade<90&&grade>=80);{
//	System.out.println("You made B");
//	
//
//	}
//	else if(grade<80&&grade>=70);{
//		System.out.println("You made C");
//		
		int hour =12;
		if(hour>=0 && hour<12) {
			System.out.println("Good Morning");
			
		}
		else if(hour >12&&hour <=15) {
			System.out.println("Good Afternoon");
			
			
		}
		else if (hour>15&& hour<=23) {
			System.out.println("Good Night");
			
		}
		else {
			System.out.println("NOON");
		}
		int num1=200, num2 =300, num3=550;
		if(num1>num2 && num1>num3) {
			System.out.println(num1+" is the bigger number ");
		}
		else if (num2>num1&& num2>num3) {
			System.out.println(num2+" is the bigger number ");
			
		}
		else if(num3>num2&&num3>num1) {
			System.out.println(num3+" is the bigger number ");
			
		}else if(num3==num2&&num3>num1) {
			System.out.println(num3+"and"+num2+"bigger number");
			
		}
		else if(num3==num1&&num3>num2) {
			System.out.println(num3+"and"+num1+"are the bigger");
		}
		
	
	}
}

