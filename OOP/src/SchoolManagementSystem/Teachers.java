package SchoolManagementSystem;
//this class is responsible for keeping the track of the teachers name,id and salary.
public class Teachers {
	private int id;
	private String name;
	private int salary;
	private int salaryearn;
	/**
	 * Create a new Teacher object.
	 * @param id for teacher.
	 * @param name for teacher.
	 * @param salary salary for teacher.
	 */
	public Teachers(int id,String name,int salary) {
			this.id=id;
			this.name=name;
			this.salary=salary;
			this.salaryearn=0;
	}
	/**
	 * 
	 * @return the name of the teacher
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * 
	 * @return the id of the teacher
	 */
	public int getId() {
		return this.id;
	}
	/**
	 * 
	 * @return the id of the teacher
	 */
	public int getSalary() {
		return this.salary;
	}
	/**
	 * 
	 * @set salary
	 */
	public void setSalary(int salary) {
		this.salary=salary;
	}
	
	public void receiveSalary(int salary) {
	salaryearn+=salary;
	School.updateTotalMoneySpent(salary);
	}
}
