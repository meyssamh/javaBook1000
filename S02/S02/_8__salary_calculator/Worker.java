package _8__salary_calculator;

public class Worker {
    private final int id;
    private final int workedHours;
    private final int hourlyWage;
    private final double salary;

    private static final int REGULAR_HOURS = 40;
    private static final double OVERTIME_RATE = 1.5;

    public Worker(int id, int workedHours, int hourlyWage) {
        this.id = id;
        this.workedHours = workedHours;
        this.hourlyWage = hourlyWage;
        this.salary = calculateSalary();
    }

    private double calculateSalary() {
        if (workedHours <= REGULAR_HOURS) {
            return workedHours * hourlyWage;
        } else {
            int overtimeHours = workedHours - REGULAR_HOURS;
            return (REGULAR_HOURS * hourlyWage) + (overtimeHours * hourlyWage * OVERTIME_RATE);
        }
    }

    public int getId() {
        return id;
    }

    public int getWorkedHours() {
        return workedHours;
    }

    public int getHourlyWage() {
        return hourlyWage;
    }

    public double getSalary() {
        return salary;
    }

    @Override
    public String toString() {
        return "Worker with ID " + id +
                " worked " + workedHours +
                " hours at " + hourlyWage +
                " per hour, earning a total salary of " + salary;
    }
}