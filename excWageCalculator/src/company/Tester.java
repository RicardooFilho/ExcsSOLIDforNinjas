package company;

public class Tester extends EmployeesInfos implements Employees {

    public Tester (String name, double wage) {
        super(name, wage);
    }

    public double getWage() {
        if (wage > 3000) {
            return this.wage + (this.wage * 0.15);
        }

        return this.wage + (this.wage * 0.20);
    }
}
