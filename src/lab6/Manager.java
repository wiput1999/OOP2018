package lab6;

public class Manager extends Employee {

    private String department;

    public Manager(String name, String position, String department, double salary) {
        super(name, position, salary);
        this.department = department;
    }

    @Override
    public void showDetails() {
        System.out.println(this.getName());
        System.out.println(this.getPosition());
        System.out.println(department);
        System.out.println(this.getSalary());
    }

    public static void main(String[] args) {
        Manager manager = new Manager("Kavin", "Manager", "IT", 112456);

        manager.showDetails();
    }

}
