package company;

import java.util.Arrays;

public class Accountant extends Worker {
    public Accountant(String name, String surname, int yearEmployment, int currentYear) {
        super(name, surname, yearEmployment, currentYear);
    }

    @Override
    public void setProfession() {
        this.profession=PROFESSION.ACCOUNTANT;
    }

    @Override
    public String toString() {
        return "Accountant{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience="+ getExperience()+
                ", profession="+profession+
                ", salary="+ printSalary()+
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
