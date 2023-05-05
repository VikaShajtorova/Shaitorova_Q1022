package company;

import java.util.Arrays;

public class Worker extends Employee{


    public Worker(String name, String surname, int yearEmployment, int currentYear) {
        super(name, surname, yearEmployment, currentYear);

    }
    @Override
    public void setProfession() {
        this.profession= PROFESSION.WORKER;

    }
    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience="+ getExperience()+
                ", profession="+profession+
                ", salary="+ printSalary()+
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
