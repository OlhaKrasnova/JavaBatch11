package com.syntax.class06;

public class SwitchDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int day=5;
		if(day==1) {
			System.out.println("Monday");
		}else if (day==2) {
			System.out.println("Tuesday");
		}else if (day==3) {
			System.out.println("Wednesday");
			
			
		} else if(day==4) {
			System.out.println("thursday");
			
		}else if (day==5) {
			System.out.println("Friday");
		}else if (day==6) {
			System.out.println("Saturday");
			
		}else if (day==7) {
			System.out.println("Sunday");
			
		}else {
			System.out.println("wrong day");
			
	}
		
		switch (day) {
		
		case 1:
			System.out.println("Monday");
			break;
				case 2:
			System.out.println("Tuesday");
			break;
		case 3:
			System.out.println("Wednesday");
			break;
		case 4:
			System.out.println("Thursday");
			break;
		case 5:
			System.out.println("Friday");
			break;
		case 6:
			System.out.println("Saturday");
			break;
		case 7:
			System.out.println("Sunday");
			break;
				default:
					System.out.println("Wrong day");
					break;
					
		}

}
}
