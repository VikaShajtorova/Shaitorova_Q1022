package worker4_company;

import java.util.Arrays;

public class Worker extends Employee implements FindEmployee{
    @Override
    public boolean findEmployeeByName(Employee employee, String name) {
        if (employees != null){
            System.out.println(Arrays.toString(employees));

        }return true;

    }

    public Worker(String name, String surname, int yearEmployment, int currentYear) {
        super(name, surname, yearEmployment, currentYear);

    }

    @Override
    public void addWorker(Employee employee) {
        if (employee.profession.equals(PROFESSION.INTERN)) {
            super.addWorker(employee);
        } else {
            System.out.println("Может принимать только стажеров");
        }
    }

    @Override
    public void setProfession() {
        this.profession = PROFESSION.WORKER;

    }

    @Override
    public String toString() {
        return "Worker{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience=" + getExperience() +
                ", profession=" + profession +
                ", salary=" + printSalary() +
                ", employees=" + Arrays.toString(employees) +
                '}';
    }
}
