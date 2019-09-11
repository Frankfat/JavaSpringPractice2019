package Dat_15;

public class StringClass {
	public static void main(String[] args) {
	/*	
		String is an object=there are 2 ways to create object from Strig class:
		                     1.String literals
		                     2.by using "new" keyword
		                     
		
		*/
		
		String str ="Cybertek";
		String A = "Cybertek";
		String B = "Cybertek";
		System.out.println(A==B);//both are in the String pool
		String str2 = new String("Cybertek");
		System.out.println(str==str2);//different memory locations
		//String methods:
		//charAt(indexnum):
		
	}

}
