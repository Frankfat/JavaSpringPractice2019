package Day_9;

public class If_Statement {
/*
 * if statements:
 *  
 *     single if statement:
 *       
 *          if(boolean expression ){
 *          some codes to run
 *          }
 *          if block only gets executed if the condition is true
 *          
 */
	
	public static void main(String[] args) {
		if(true) {	//try with ! give some variable
		System.out.println("Hello");	
		System.out.println("Happy Friday");
		
		
		}
		
		int a = 100;
		
		if (a++==1001) { //try with true 
			a=2000;
			System.out.println("a is increased");
		}
		System.out.println();
		
		int X = 987654320;
		if (X%2 == 0) {
			System.out.println(X);
			System.out.println("it's an even number");
		}
		
		
		}
}
