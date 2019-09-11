package Day_8;

public class Logical_Operators {
public static void main(String[] args) {
	
	//&&: AND logic      true && true ==> true  if both conditions are true 
	
	//||: OR  logic
	//                  true || false ==>  true
	//                   true || true ==> true 
	//                   false || false ==> false
	
	boolean resultA = 9 ==0 && "Muhtar"=="good";
	//                 false    false   ==>false
	System.out.println(resultA);
	
	boolean resultB = 8>5 && 7==(8-2+1);
	System.out.println(resultB);
	
	
	boolean A = "Monday" == "Fun-day"  || 6==6;
	//                 false || true ==> true
	System.out.println(A);
	
	boolean B = true || false ; //++>true
	System.out.println(B);
	
	boolean C = !(8>5) || !("Today" != "Friday");
	//      (not)!true  ||  !true 
	//       false      ||  false 
	System.out.println(C);
	
	
	// || && :
	boolean D = true && true || false ;
	 //             true     || false 
	System.out.println(D);
	
			
	
	boolean resultC = !false !=true && ! false ==!(!true);
	//                true   ! true  &&   true == !false  
	//                      false    &&    true ==> false
	System.out.println(resultC);
	
	 boolean E = !(7 > 5 && 6 !=5) && (9>5 || 10>4);
	 //          ! (true && true   && (true||true)   
	 //              !true        && true 
	 //               false    && true 
	 System.out.println(E);
}
}
