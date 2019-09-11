package Dat_15;

public class StringMethods {
public static void main(String[] args) {
	
	String str = "Cybertek";
	// index num: 01234567
	//charAt(index):
	System.out.println(str.charAt(0));
	char ch  = str.charAt(0);
	System.out.println(ch);
	String str2 ="Mu htar";
	System.out.println(str2.charAt(2));
	//length():
	String name = "Aslan Fatih";
	int n =name.length();
	
	//concat():
	String s1 = "Cybertek";
	s1.concat("School");//attempt to modifiy String s1
	System.out.println(s1);//String is immutable, Cybertek
	s1 = s1.concat("School");
	System.out.println(s1);
	//toUpperCase():converts to upper case
	String N = "cybertek";
	N.toUpperCase();
	System.out.println(N);//String is immutable
	N=N.toUpperCase();
	System.out.println(N);
	//toLowerCase():
	String M = "DELIYUREK";
	M.toLowerCase();
	M=M.toLowerCase();
	System.out.println(M);
	//charAt(), length(), concate(Str), toUpperCase
	String a ="Batch 12 Javengers";
	System.out.println(a.charAt(0));
	
	char ch1 = a.charAt(0);
	System.out.println(ch1);
	
	int Length = a.length();
	System.out.println(Length);
	
	int HighestInexNum = a.length()-5;
	System.out.println(HighestInexNum);
	
	
	String b = "Cybertek";
	b.concat("Batch12 Javengers");
	System.out.println(b);
	String c=b.concat("Batch12 Javengers");
	System.out.println(c);
	b = b.concat("Batch12 Javengers");
	System.out.println(b);
	
	String d = "book";
	System.out.println(d.toUpperCase());
	System.out.println(d);
	
	d=d.toUpperCase();
	System.out.println(d);
	
	
	
}
}
