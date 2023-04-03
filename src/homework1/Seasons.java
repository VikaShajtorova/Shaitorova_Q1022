package homework1;

import java.util.Locale;
import java.util.Scanner;

public class Seasons {
    public void displayTheSeason() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the name of the month: ");
        String monthName = scanner.nextLine().toLowerCase();
        String season = "";
        switch (monthName) {
            case "december":
            case "january":
            case "february":
                season = "winter";
                break;
            case "march":
            case "april":
            case "may":
                season = "spring";
                break;
            case "june":
            case "july":
            case "august":
                season = "summer";
                break;
            case "september":
            case "october":
            case "november":
                season = "autumn";
                break;
            default:
                System.out.println("error: incorrect month name");


        }
        System.out.println("Season: "+ season);

    }
}
