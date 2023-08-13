package company;

public class Developer extends EmployeesInfos implements Employees {

    public Developer (String name, double wage) {
        super(name, wage);
    }

    public double getWage() {
        if (this.wage > 3000) {
            return this.wage + (this.wage * 0.10);
        }

        return this.wage + (this.wage * 0.20);
    }
}
