package day5.conditionalstatements;

public class SampleSwitch {
	public static void main(String[] args) {
		String day = "Friday";
		switch (day) {
		case "Sunday":
			System.out.println("First day");
			break;
		case "Monday":
			System.out.println("Second day");
			break;
		case "Tuesday":
			System.out.println("Third day");
			break;
		case "Wednesday":
			System.out.println("Fourth day");
			break;

		case "Thursday":
			System.out.println("Fifth day");
			break;
		case "Friday":
			System.out.println("Sixth day");
		break;
			
		case "Saturday":
			System.out.println(" Seventh day");
			break;

		default:
			System.out.println("Not a valid input");
		}
	}

}
