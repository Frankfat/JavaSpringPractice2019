package Day_8;

public class ShortHand {
	
public static void main(String[] args) {
//	+= : addition assignment
//	-= : subtraction assignment
	boolean resultB = 10>9;
	System.out.println(resultB);
	boolean resultC = 10<=9;
	System.out.println(resultC);
	boolean resultD = 100 > 900;
	System.out.println(resultD);
	boolean resultE = 100 <= 100; //less than or equal 
	System.out.println(resultE);
	//==
	boolean resultF = 19 ==19;
	System.out.println(resultF);
	boolean resultH = 20!= 20;
	System.out.println("H"+resultH);
	boolean A = !false;//true
	System.out.println(A);
	boolean B = !true; //false
	
//	in java
//	true ==true, false == false
//	!false equal to true, !true equal to false
//	so therefore :
//		!false does not equal !true 
//		and 
//		true equal !false
	// practice !(not):
	
	
	boolean C = !false != !true;
			System.out.println(C);
	boolean g = true;
	System.out.println(!g);
	
	System.out.println(!true == false);
	// false == false ==>true
	boolean h ="Batch12" == "Batch13"; //false
	System.out.println(h);
	
	System.out.println("bacth12" == "Batch12"); // java is case sensi
	
	System.out.println("cybertek" != "club"); //true
	
	System.out.println("Kuzzat" == "bad guy"); //false
	System.out.println("FATIH"!= "FATIH"); //FALSE
	
		
			
	byte ByteNum = 30;
	//int Inum = Inum+= ByteNum;// we must give value to local veriables
	
	        boolean m = !(4>5)|| !(5>4);
	        	        //  true || false 
	                     //       true
	        
	        
	        
	        
	
	
}
}
