package homeWork3;

public class Season {
    public void checkSeason(MONTH month) {
        switch (month) {
            case MAY:
            case APRIL:
            case MARCH:
                System.out.println("это весна");
                break;
            case DECEMBER:
            case JANUARY:
            case FEBRUARY:
                System.out.println("это зима");
                break;
            case SEPTEMBER:
            case OCTOBER:
            case NOVEMBER:
                System.out.println("это осень");
                break;
            case JUNE:
            case JULY:
            case AUGUST:
                System.out.println("это лето");
                break;

        }
    }
}
