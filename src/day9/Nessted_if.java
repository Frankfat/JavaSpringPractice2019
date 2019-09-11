package day9;

public class Nessted_if {
public static void main(String[] args) {
	/*
	 Nested if;
	        if(condition){
	    some code to run
	 }
	 
	 */
	if(false) {
		System.out.println("HelloCybertek");
		if(false) {
			System.out.println("HelloWorld");
			 
				
			}else {
				System.out.println("HelloSDET");
		}
	}
	int grade =70;
	
	if(grade >=60) {
		System.out.println("passed");
		if(grade>=90&&grade<=100) {
			System.out.println("\twith grade of A");
	}
		else if(grade>=80&&grade<90) {
			System.out.println("\twith a grade of B");
		}
		else if(grade>=70&&grade<80) {
			System.out.println("\twith a grade of C");
			
		}else if (grade>=60&&grade<70) {
			System.out.println("\t with a grade of D");
			
		}
	}
	else {
		System.out.println("failed");
		
			
		}
}
}


