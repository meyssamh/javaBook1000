package _4__salary_calculator;

import java.util.Scanner;

public class SalaryCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter number of workers:");
        int workersAmount = scanner.nextInt();

        Worker highestPaidWorker = null;

        for (int i = 1; i <= workersAmount; i++) {
            System.out.println("Enter worker ID:");
            int workerId = scanner.nextInt();

            System.out.println("Enter worker salay:");
            long workerSalary = scanner.nextLong();

            Worker worker = new Worker(workerId, workerSalary);
            worker.printWorkerInfo();

            if (highestPaidWorker == null ||
                    worker.getNetIncome() > highestPaidWorker.getNetIncome()) {
                highestPaidWorker = worker;
            }
        }

        scanner.close();

        if (highestPaidWorker != null) {
            System.out.println("Highest Paid Worker:");
            highestPaidWorker.printWorkerInfo();
        }
    }
}