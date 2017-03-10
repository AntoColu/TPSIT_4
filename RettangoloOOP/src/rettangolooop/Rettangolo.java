package rettangolooop;

public class Rettangolo {

    private double L1;
    private double L2;

    public Rettangolo(double x, double y) {
        this.L1 = x;
        this.L2 = y;
    }

    public double calcolaArea() {
        return this.L1 * this.L2;
    }

    public double calcolaPeri() {
        return 2 * (this.L1 + this.L2);
    }
}
