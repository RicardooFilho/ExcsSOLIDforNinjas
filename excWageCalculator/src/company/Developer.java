package company;

public class Developer implements Employees {

    String name;
    double wage;

    public Developer (String name, double wage) {
        this.name = name;
        this.wage = wage;
    }

    public double getWage() {
        if (this.wage > 3000) {
            return this.wage + (this.wage * 0.10);
        }

        return this.wage + (this.wage * 0.20);
    }
}
