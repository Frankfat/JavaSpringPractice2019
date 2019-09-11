package Day_7;

public class UnaryOperators {
	public static void main(String[] args) {
		
		
	
/*
 * ++ : increment
 * --:decrement
+ - ===>-
- - ===> +
- + ====> -


 
	
	int a = 10;
	int b = -10;
 System.out.println(b); // -10
 
 int c =+ b; // + (10) --> -10
 System.out.println(c);
 int d  = -c;  // - (-10) ===> 10
 System.out.println(d);
 
 int f = - (10);
 System.out.println(f); // -10
 
 //increment: 
 //pre increment: operator is placed before the variable 
 int num1 = 100;
 System.out.println(++num1);
 //post increment: operator is placed after the variable 
 
   int IntNum = 100;
   System.out.println(+IntNum++); 
   System.out.println(IntNum);
   System.out.println(++IntNum);
   int IntNum2 = IntNum ++ ; // IntNum2=101
   //  IntNum2 = 101
   System.out.println(IntNum2);
   System.out.println(IntNum);
   
   int x = 100;
   int y = x++ -1;
   // y = 100 -1 = 99
   System.out.println(y);
   
   //decrement:decreses the value by 1 
   // pre-decrement:operator is placed before the variable
   //                   decreases the value by 1 immid;
   
   int Z = 100;
   
   System.out.println(--Z); //99
   //post decrement: operator is placed after the variable
   
   //it will pass the current value, and then decre
   
   int Y = 95;
   System.out.println(Y--);//95 
   System.out.println(Y);//94
   
   int T = 25;
   System.out.println(++T); //26
   System.out.println(--T);//25
   
   int P = 50;
   P = --P + P++ + P-- + P ++;
   System.out.println(P);
   // PRE   POST   POST  POST 
  //   49 +  49  + 50  +  49
   // 98 + 50 + 49
   //148 + 49 
   // 197
   
   short Snum = 4;
   int R = Snum * 4 - Snum--;
   //        16    -     4    = 12
   
   System.out.println(R);//12 
   System.out.println(Snum);//3
   
   int W = 1;
   W = - W-- + W++ / -W-- * --W;
   //    POST  POST  POST   PRE\
   
   int U = -10;
   int G = 10;
    
   System.out.println(--U);
System.out.println(--G);
System.out.println(-+G);

*/






int Q = 6;
int V = -4;
System.out.println(Q++);
System.out.println(Q);
System.out.println(Q);
System.out.println(--Q);
System.out.println(++Q);
System.out.println(+-Q);
System.out.println(Q++);
System.out.println(Q);

   
   int A = 10;
   System.out.println(++A);
   System.out.println(++A);
   System.out.println(A++);
   System.out.println(A++);
   
   
   
   System.out.println(A);
   
 
	}
}

