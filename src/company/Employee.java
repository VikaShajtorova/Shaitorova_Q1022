package company;

public abstract class Employee {
    int yearEmployment;
    int currentYear;
    int experience;
    int base_rate = 40;

    public abstract PROFESSION getPROFESSION();

    public Employee(int yearEmployment, int currentYear) {
        this.yearEmployment = yearEmployment;
        this.currentYear = currentYear;
        this.experience = currentYear-yearEmployment;
    }

      public int getExperience() {
        return experience;
    }

    public double printSalary() {
        return base_rate * getExperience() * getPROFESSION().getRatio();
    }
}



