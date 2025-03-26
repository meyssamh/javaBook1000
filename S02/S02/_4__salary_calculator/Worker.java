package _4__salary_calculator;

public class Worker {
    private final int id;
    private final long salary;
    private final double taxes;
    private final double netIncome;

    public Worker(int id, long salary) {
        this.id = id;
        this.salary = salary;
        this.taxes = calculateTaxes(salary);
        this.netIncome = salary - taxes;
    }

    private double calculateTaxes(long salary) {
        if (salary <= 400000)
            return 0;
        if (salary <= 500000)
            return (salary - 400000) * 0.1;
        if (salary <= 700000)
            return (500000 - 400000) * 0.1 + (salary - 500000) * 0.15;
        return (500000 - 400000) * 0.1 + (700000 - 500000) * 0.15 + (salary - 700000) * 0.17;
    }

    public int getId() {
        return id;
    }

    public long getSalary() {
        return salary;
    }

    public double getTaxes() {
        return taxes;
    }

    public double getNetIncome() {
        return netIncome;
    }

    public void printWorkerInfo() {
        System.out.println("Worker ID: " + id + ", Salary: " + salary +
                ", Taxes: " + taxes + ", Net Income: " + netIncome);
    }
}