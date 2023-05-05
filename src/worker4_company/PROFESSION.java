package worker4_company;

public enum PROFESSION {
    DIRECTOR(2.6),
    DIRECTOR2(2.3),
    WORKER(2.0),
    ACCOUNTANT(2.0),
    SECRETARY(2.0),
    ENGINEER(2.0),
    INTERN(1);
    private double ratio;

    PROFESSION(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }
}
