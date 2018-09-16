package lab6;

public class Employee implements EmployeeInterface {

	private String name;
	private String position;
	private double salary;

	public Employee(String name, String position, double salary) {
		this.name = name;
		this.position = position;
		this.salary = salary;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
	}

	public double calSalary(int hour, double rate) {
		salary = hour * rate;
		return hour * rate;
	}

	public void showDetails() {
		System.out.println(name);
		System.out.println(position);
		System.out.println(salary);
	}

	public static void main(String[] args) {
		Employee employee = new Employee("Prayut", "Prime Minister", 112000);

		employee.showDetails();
	}

}
