package worker4_company;

import java.util.Arrays;

public abstract class Employee extends Person {
    private int yearEmployment;
    private int currentYear;
    public int experience;
    final int base_rate = 40;
    Employee[] employees;
    protected PROFESSION profession;

    public Employee(String name, String surname, int yearEmployment, int currentYear) {
        super(name, surname);
        this.yearEmployment = yearEmployment;
        this.currentYear = currentYear;
        setProfession();

    }

    public Employee(String name, String surname, PROFESSION profession) {
        super(name, surname);
        this.profession = profession;
    }

    public void addWorker(Employee employee) {
        if (employees == null) {
            employees = new Employee[1];
            employees[0] = employee;
        } else {
            employees = Arrays.copyOf(employees, employees.length + 1);
            employees[employees.length - 1] = employee;
        }
    }

    public abstract void setProfession();


    public int getExperience() {
        return experience = currentYear - yearEmployment;
    }


    public double printSalary() {
        return base_rate * getExperience() * profession.getRatio();
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                ", experience=" + experience +
                ", profession=" + profession +
                ", salary=" + printSalary() +
                '}';
    }
}



