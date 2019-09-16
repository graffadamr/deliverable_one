package deliverable_1;

import java.util.Scanner;

public class deliverable_1 {

	public static void main(String[] args) {
		String eventType;
		int partySize;
		String mealSuggestion = "a";
		String preparationSuggestion = "b";

		System.out.println("Please type whether your party is casual, semi-formal or formal here:");
		Scanner scnr = new Scanner(System.in);
		eventType = scnr.next();

		if (eventType.contentEquals("casual")) {
			mealSuggestion = "sandwiches";
		} else if (eventType.contentEquals("semi-formal")) {
			mealSuggestion = "fried chicken";
		} else if (eventType.contentEquals("formal")) {
			mealSuggestion = "chicken parmesan";
		}
		System.out.println("Now please input your party size:");
		partySize = scnr.nextInt();

		if (partySize == 1) {
			preparationSuggestion = "in the microwave";
		} else if ((partySize >= 2) && (partySize <= 12)) {
			preparationSuggestion = "in the kitchen";
		} else if (partySize >= 13) {
			preparationSuggestion = "by a caterer";
		}
		String result = "Since you're hosting a " + eventType + " event for " + partySize
				+ " participants, you should serve " + mealSuggestion + " prepared " + preparationSuggestion + ".";
		System.out.print(result);

	}
}

// TODO Auto-generated method stub
