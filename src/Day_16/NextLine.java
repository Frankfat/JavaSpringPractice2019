package Day_16;
import java.util.*;

public class NextLine {
public static void main(String[] args) {
	
	
	/*
	 write a program that accepts zip-code, city, state, phone number
	 and then displayed all those gathered information
	   Do not use next() method
	   
	 */
	
	Scanner input = new Scanner(System.in);
	System.out.println("Please enter your zip code");
	int zipcode =input.nextInt();
	
	System.out.println("Please enter your city name");
	String cityname = input.nextLine();
	
	System.out.println("Zip code is: "+zipcode);
	System.out.println("city name is: "+zipcode);
	
	System.out.println("Enter your phone number");
	int pn=input.nextInt();//try w string nextLine
	input.nextLine();
	System.out.println("Enter state name");
	String stateName=input.nextLine();
	
	
	
}
}
