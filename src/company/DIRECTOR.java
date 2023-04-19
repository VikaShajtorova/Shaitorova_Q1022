package company;

public class DIRECTOR extends Employee {
    int worker;
    int newRatio =3;


    public DIRECTOR(int yearEmployment, int currentYear) {
        super(yearEmployment, currentYear);
    }

    public PROFESSION getPROFESSION() {
        return PROFESSION.DIRECTOR;
    }
    public double printSalary(){
        return base_rate * getExperience() * newRatio;
    }


}
