package company;

public class DBA implements Employees{

    String name;
    double wage;

    public DBA (String name, double wage) {
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
