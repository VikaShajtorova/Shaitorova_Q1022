package company;

public enum PROFESSION {
    DIRECTOR(2.6),
    WORKER(2.0);
    private double ratio;

    PROFESSION(double ratio) {
        this.ratio = ratio;
    }

    public double getRatio() {
        return ratio;
    }
}
