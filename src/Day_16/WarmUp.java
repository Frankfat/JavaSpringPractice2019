package Day_16;
import java.util.*;//imports one class
//import java.util.*;//imports all classes from java.util
public class WarmUp {
	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("Enter you firsr name and last name");
		String firstname = scan.nextLine(),//.toUpperCase();
		       lastname = scan.nextLine();//.toUpperaCase();
		       
		String fullname = firstname+" "+lastname;
		fullname=fullname.toUpperCase();
		System.out.println("your full name is: "+fullname);
		//String fullname = fullname.concat(" "+lastname).toUpperCase();
		       
	//NEXT LINE
		System.out.println("Enter your phone number");//911
		int pn =scan.nextInt();
		System.out.println(pn);
		
		//scan.nextLinw(); ==>this will take out the Enter
		System.out.println("Enter your name");
		String name = scan.nextLine();
		/*
		 nextLine() method willt take everything in scanner' memory up-to the newlinw
		 */
	}

}
