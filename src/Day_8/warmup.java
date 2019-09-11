package Day_8;
import java.util.*;

public class warmup {
	public static void main(String[] args) {
		/*
		 * write a java program that converts gallons ti liters 
		 * 1 gallon = 3.785 liters
		 * 
		 */
		
		int gallon = 100;
		double liters = gallon * 3.785; // converts gallon to liters
		System.out.println(gallon +" gallons equal to " +liters+" litters");
		
		double L = 1;
		double G = L / 3.785;
		System.out.println(L +" Litters equal to "+G); //if you say G 
		
		int x = 2;
		int y = x++; //y = 2; x=3
		System.out.println(y+" "+x);
		
		int x2 = 2;
		System.out.println(x2++);//2
		System.out.println(x2); //3
		
		int x3 =2;
		System.out.println( --x3);//2-1=1
		// pre: decreases the value by 1 immedietly
		
		
		int x4 = 8;
		int y4 = x4--; //8
		System.out.println(y4);//8
		System.out.println(x4);//7
		
		
		
		
		
	long p = 30L;
	long o = (short)p;
	System.out.println(o);
	double j,l,u = 10.5;
	System.out.println();
	
	Scanner scan = new Scanner(System.in);
	
	
	  System.out.println("Please enter num1");
	    int num1= scan.nextInt();
	    
	    System.out.println("Please enter num2");
	    int num2 =scan.nextInt();
	        System.out.println("Please enter num3");

	    int num3=scan.nextInt();
	int sum = num1+num2+num3;
	System.out.println(sum);

	}

}
