package worker4_company;

public class Intern extends Employee{
    public Intern(String name, String surname, PROFESSION profession) {
        super(name, surname, profession);
    }

    @Override
    public void setProfession() {
        this.profession = PROFESSION.INTERN;
    }

    @Override
    public String toString() {
        return "Intern{" +
                "profession=" + profession +
                ", name='" + name + '\'' +
                ", surname='" + surname + '\'' +
                '}';
    }
}
