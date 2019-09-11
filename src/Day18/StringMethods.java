package Day18;

public class StringMethods {
public static void main(String[] args) {
	
	/*
	 indexOf(string): returns the index number of the first occured charr in  the given String
	 as an int value
	 */
	
	String A1 = "Batch 12 is a great batch";
int num = 	A1.indexOf("g");
System.out.println(num);
int num1 = A1.indexOf("at ");//or eat+1
System.out.println(num1);
	
String B1 = "today is tuesday, today we have class in the afternoon";
int num2  = B1.indexOf("te");
System.out.println(num2);

String Address = " 7925 Jones Branch Dr, Mclean, VA 22003";
int begin =Address.indexOf(", ")+1+1;
int end =Address.indexOf(", V");
String cityName  = Address.substring(begin, end);


System.out.println(cityName);

String email = "RandomEmails@gmail.com";
int begin1 =email.indexOf("@")+1;
int end1 = email.indexOf(".");
String emailType = email.substring(begin1, end1);
System.out.println(emailType);

String str = "ABCDABCD";
int n2=str.indexOf("B");
int n3 = str.lastIndexOf("B");
System.out.println(n2);
	System.out.println(n3);	 
	
	String myEmail="Myemail.school@gmail.com";
	int Begin = myEmail.indexOf("@")+1;
	int End  = myEmail.lastIndexOf(".");
	
	String EmailType =myEmail.substring(Begin, End);
	System.out.println(EmailType);
	 
	
	
	 
}
}
