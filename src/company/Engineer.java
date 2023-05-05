package company;

import java.util.Arrays;

public class Engineer extends Worker{
    public Engineer(String name, String surname, int yearEmployment, int currentYear) {
        super(name, surname, yearEmployment, currentYear);
    }

    @Override
    public void setProfession() {
       this.profession = PROFESSION.ENGINEER;
    }

    @Override
    public String toString() {
        return "Engineer{" +
                "experience=" + getExperience() +
                ", employees=" + Arrays.toString(employees) +
                ", profession=" + PROFESSION.ENGINEER+
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
