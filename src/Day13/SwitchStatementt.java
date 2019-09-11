package Day13;

public class SwitchStatementt {


public static void main(String[] args) {
	
	String chat = "LASTT";
	switch(chat){
	case "PRINT":
		System.out.println("Correct");
		break;
	case "DON'T":
		System.out.println("False");
		break;
	case "NOPE":
		System.out.println("Still False");
		
	case "LASTT":
		default:
			System.out.println("THAT WAS LAST");
		
	}
	
		char grade = 'A';
		if(grade=='A'||grade=='B') {
			System.out.println("Passed the exam");
		}else {
			System.out.println("Failed");
			
		}
		switch(grade) {
		case'A':
			break;
		case 'B':
			System.out.println("Passed the exam");
			break;
			
			default:
				System.out.println("Failed the exam");
		}
//		
		String US ="CAN";
//		if(US=="USA"||US=="America"||US=="US") {
//			System.out.println("American");
//		}else {
//			System.out.println("Not American");
//		}
		switch(US) {
		case "US":
		case "USA":
		case "American":
			System.out.println("You are american");
			break;
			default:
				System.out.println("Not American");

		}
		int sigara = 2;
		switch(sigara){
		case 1:
			System.out.println("Bad for your health");
			break;
		case 2:
			System.out.println("You spent all your money for that");
		case 3:
			System.out.println("Smells so bad");
		case 4:
			System.out.println("People don't like you");
			break;
		case 5:
			System.out.println("I can give 100 more if you want");
			default:
			System.out.println("QUIT THAT SHIT");
		}
		if(true&&false) {
			System.out.println("ver");
		}
		
		int gate = 22;//default: can be just one time never forget
		switch(gate) {
		case 23:
			System.out.println("Los Angeles");
			break;

	 	case 22:
	 		
	 		default:
	 			System.out.println("No where");
        case 24:
        	
			System.out.println("Arizona");
		case 25:
			System.out.println("Salt Lake City");
		}
		
}
}
