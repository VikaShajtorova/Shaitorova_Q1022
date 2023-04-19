package company;

public class Worker extends Employee{
    public Worker(int yearEmployment, int currentYear) {
        super(yearEmployment, currentYear);
    }

    public PROFESSION getPROFESSION(){
        return PROFESSION.WORKER;
    }

   }
