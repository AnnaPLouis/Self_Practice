package day31_tasks.employeeTask;

public class Tester extends Employee{

    public Tester(String name, int age, char gender, String id, String jobTitle, double salary, String companyName) {
        super(name, age, gender, id, jobTitle, salary, companyName);

    }

    @Override
    public void work() {
        System.out.println("Tester " + getName() + " is testing");
    }
}
