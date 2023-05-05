package company;

import java.util.Arrays;

public class Director2 extends Director {
    public Director2(String name, String surname, int yearEmployment, int currentYear) {
        super(name, surname, yearEmployment, currentYear);
    }

    @Override
    public double printSalary() {
        if(employees==null){
            return super.printSalary();
        }else {
            return super.printSalary()+(employees.length*50);
        }
    }

    @Override
    public void setProfession() {
        this.profession= PROFESSION.DIRECTOR2;
    }


    @Override
    public String toString() {
        return "Director2{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience="+ getExperience()+
                ", profession="+profession+
                ", salary="+ printSalary()+
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
