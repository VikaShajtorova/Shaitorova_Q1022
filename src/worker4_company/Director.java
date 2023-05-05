package worker4_company;

import java.util.Arrays;

public class Director extends Employee {

    Employee[] employees;

    @Override
    public void setProfession() {
        this.profession =PROFESSION.DIRECTOR;

    }


    public Director(String name, String surname, int yearEmployment, int currentYear) {
        super(name, surname, yearEmployment, currentYear);

    }

    @Override
    public double printSalary() {
      if(employees==null){
          return super.printSalary();
      }else {
          return super.printSalary()+(employees.length*100);
      }
    }

    @Override
    public String toString() {
        return "Director{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience="+ getExperience()+
                ", profession="+profession+
                ", salary="+ printSalary()+
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
