package Day18;
import java.util.*;
public class Warmup {
public static void main(String[] args) {
	
	Scanner scan = new Scanner(System .in);
	System.out.println("Please enter first and last name");
	String first = scan.nextLine();
	String last = scan.nextLine();
	
	//System.out.print(first.charAt(0));
	//System.out.print(last.charAt(0));
	
//	String initals = first.substring(0,1)+last.substring(0,1);
//	System.out.println("Initial is: "+initals);
//	
//	String initals = first.substring(0,1).concat(".")+last.substring(0,1);
//	System.out.println("Initial is: "+initals);
	
	String initals = ""+first.charAt(0) + "."+last.charAt(0);
	initals = initals.toUpperCase();
	System.out.println("Initial  is: "+initals);
	
	String lastletter = ""+first.charAt(first.length()-1) 
	                    +"."+last.charAt(last.length()-1);
	System.out.println("Last letters are: "+lastletter);
	
	int FirstNameIndex = first.length()-1;
	int LastNameIndex = last.length()-1;
	
	String lastletter1 = ""+first.charAt(FirstNameIndex) 
    +"."+last.charAt(LastNameIndex);
System.out.println("Last letters are: "+lastletter);
	

}
}
