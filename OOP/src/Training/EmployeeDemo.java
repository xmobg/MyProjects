package Training;

public class EmployeeDemo {

	public static void main(String[] args) {
		Employee worker1 = new Employee(2901,"Ivo","Boikov",690);
		worker1.setSalary(900);
		System.out.println(worker1.getSalary());
		worker1.raiseSalary(3);
		System.out.println(worker1.getSalary());
		System.out.println(worker1.getName());
		System.out.println(worker1.toString());
	}

}
