package Day12;

public class SwitchStatement {
	public static void main(String[] args) {
/*
 Switch statements does the similar things like multi-brach 
 
         switch(Expression){
         case CaseValue:
                  statement1
                  statement2
                  break;
 */
	int score = 3;
	
	if(score==1) {
	System.out.println("1");
	
}else if(score==2) {
	System.out.println("2");
}
else {
	System.out.println("Invalid");
}
switch(score) {//Must give an  Expression:data
case 1:
	System.out.println("1");
	break;
	 
case 2:
	System.out.println("2");
	break;
	
	default:
		System.out.println("Invalid");
		break;
		
}
char grade = 'A';
switch(grade) {
default:
	System.out.println("Failed");
	
case 'B':
	System.out.println("Passed with B");
case 'C':
	System.out.println("Passed with A");
	
}




}
}