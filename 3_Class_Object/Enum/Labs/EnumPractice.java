package cg.javaflp.practice;

public class EnumPractice {

	public static void main(String[] args) {
		
		/* FOR FIRST ASSIGNMENT */
		for (EnumDay d : EnumDay.values() ){
			System.out.println(d);
		}
		
		/* FOR SECOND ASSIGNMENT */
 		EnumPractice practice = new EnumPractice(); 
		// calling tellAboutDay method and passing EnumDay object to it
		practice.tellAboutDay(EnumDay.WEDNESDAY);
		
		/* FOR THIRD ASSIGNMENT */
		EnumDay obj = EnumDay.MONDAY;
		obj.display();
		
		/* FOR FOURTH ASSIGNMENT */
		InnerEnum.Direction direction = InnerEnum.Direction.EAST;
	}

	private void tellAboutDay(EnumDay day) {
		switch (day) {
		case MONDAY:
			System.out.println("Monday is bad day");
			break;
		case TUESDAY:
			System.out.println("Tuesday is waste day");
			break;	
		case WEDNESDAY:
			System.out.println("Wednesday is work day");
			break;
		case THURSDAY:
			System.out.println("Monday is thrust day");
			break;
		case FRIDAY:
			System.out.println("Friday is fun day");
			break;
		case SATURDAY:
			System.out.println("Saturday night full tight");
			break;
		case SUNDAY:
			System.out.println("Sunday is sleep day");
			break;
		default:
			System.out.println("Not a day");
			break;
		}	
	}

}
