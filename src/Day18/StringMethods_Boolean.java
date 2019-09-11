package Day18;
import java.util.*;
public class StringMethods_Boolean {
public static void main(String[] args) {
	
	/*
	 isEmpty(): checks if the String is empty
	 returns boolean expressions
	 */
	
	String str = "Cybertek";
	boolean R1 =        str.isEmpty();
	      System.out.println(R1);
	      
	      if("".isEmpty()) {
	    	  
	      }
	      
	      String str2 = "";
	      if(str2.isEmpty()) {//! try with it
	    	  System.out.println("empty");
	      }else {
	    	  System.out.println("not empty");
	      }
	      
	      /*
	       equals(str):checks if the two String' face values are equal or not
	       !A1.equals
	       */
	      
	      String A1 = "Cybertek";//literal
	      String A2 = new String("Cybertek");//keywords
	      System.out.println(A1==A2); //false
	     
	      boolean R2 = A1.equals(A2);
	      
	      System.out.println(R2);
	      
	      System.out.println("java".equals("Java"));//false , case sesitivity
	      
	      /*
	       equalsIgnoreCase(str)
	       Case sensitivity does not matter 
	       */
	      String s1 ="JAVA";
	      String s2 = new String("java");
	      System.out.println(s1==s2);//false
	      System.out.println(s1.equals(s2));//false
	      System.out.println(s1.equalsIgnoreCase(s2));
	      
	      
	      /*
	       contains(str): cheks if the str is contained in the String or nat
	       then returns boolean expression
	       conatined ==>true !conatined==> false
	       
	       */
	      String name = "Muhtar";
	           boolean Result=    name.contains("Good guy");//false
	               System.out.println(Result);
	               String name2 = "Marufjon";
	               System.out.println(name2.contains("m"));//false
	               System.out.println(name2.contains("M"));//true
	               
	   /*
	    startsWith("str"):
	    checks if the String is started with the str or not,
	    than returns boolean expression
	    startedwith==>true      !startedwith==>false
	    	                
	   */
String Today = "Java";
boolean Result2= Today.startsWith("J");
System.out.println(Result2);

String names = "Cybertek School is a great place to learn java";
System.out.println(names.startsWith("Cybertek School"));//true


/*
 endsWith(str):
 checks if the String is ended with the given str or not
 then returns boolean expression
 endedwith==>true         !endedwith==>false
 
 
 */
String B1 ="Muhtar";
System.out.println(B1.endsWith("r"));

String deneme = "   Gelecegine mani olacak seylerden vazgec";
String yapma ="Deliiii";

int neler = 44;
String deneme1 = deneme.replace("Gelecegine", "Suanina");

System.out.println(deneme1);
System.out.println(deneme.substring(0, 26));
System.out.println(deneme.replace('G', 'D'));
System.out.println(deneme.trim());
System.out.println(deneme1.charAt(deneme1.length()-1));
System.out.println(B1+deneme1.concat("ulan ayiii").concat(yapma));
System.out.println(deneme.indexOf('G')+"HADI BAKIM");
char bu = 'G';
if(bu==deneme.charAt(3)) {
	System.out.println("that was good");
}else {
	System.out.println("try again");
}
Scanner scan=new Scanner(System.in);



}
}
