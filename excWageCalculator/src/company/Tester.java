package company;

public class Tester implements Employees {

    String name;
    double wage;

    public Tester (String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    public double getWage() {
        if (wage > 3000) {
            return this.wage + (this.wage * 0.15);
        }

        return this.wage + (this.wage * 0.20);
    }
}
