package homeWork3;

public class CreateMethodDeprecated {
@Deprecated
    public void findOutTheYearOfAdmissionToSchool(int dateOfBirth) {

        int year;
        year = dateOfBirth + 6;
        System.out.println("Если дата рождения: " + dateOfBirth + " то в школу пойдет в - " + year);

    }


}
