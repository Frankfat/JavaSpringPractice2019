package Day3_Variables;

import java.util.Scanner;

public class EscapeSequences {
	/*
	 \\:print back slash
	 \': prints single quote
	 \n starts from a new line
	 
      */
	public static void main(String[] args) {
		/*
int a =30;
int b = (byte)a;
System.out.println(b);
*/
		/*
		System.out.println("5+2="+(3+4));
System.out.println("; 5 + 2="+(3+4));
 */
		/*
		float a = 100.9876543f;
		short b = (byte)a;
		System.out.println(b);
		*/
	/*	
	int a =9 , b = 0, c=a/b;
	System.out.println(c*b);
	Throws Error Message
	
	*/
 
		
		/*
		long a = 3_000L;
		double b = (float)a;
		int c =(short)b;
		System.out.println(c %1000);
		*/
//		int b =5;
//		int c = 15;
//		c = c++ + c++ + c++ + c++;
//		//  15 +   16 + 17 + 18;
//		System.out.println(c);
//		int g = 4;
//		
//				g = ++g + g++;
//				
//				System.out.println(g);
		
//				int a = 10;
//		a= -a-- + ++a + --a;
//		//  -10 + 10  + 9; 
//		System.out.println(a);
//		
		
	Scanner scanner = new Scanner(System.in);
	System.out.print("What is the number?:");
			int Number =scanner.nextInt();
			System.out.println("The number is: "  +Number);

			
			
 
		
		
		
	}
}
