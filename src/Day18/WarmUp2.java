package Day18;
import java.util.*;
public class WarmUp2 {
public static void main(String[] args) {
	/*
	 fATiH
	 uRuC
	 output:Fatih Uruc
	 
	 */
	Scanner scan = new Scanner(System.in);
	
	System.out.println("Enter your first name");
	String firstname = scan.nextLine();
	firstname = firstname.substring(0, 1).toUpperCase()
			    + firstname.substring(1).toLowerCase();
	System.out.println(firstname);
	
	
}
}
