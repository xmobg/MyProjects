package SchoolManagementSystem;

import java.util.List;

/**
 * 
 * @author The school can have many students,
 *	implement teachers and students
 *using ArrayList; 
 */
public class School {
	private List<Teachers> teachers;
	private List<Student> student;
	private static int totalMoneyEarnd;
	private static int totalMoneySpent;
	public School(List<Teachers>teachers,List<Student>students) {
		this.teachers=teachers;
		this.student=students;
		totalMoneyEarnd=0;
		totalMoneySpent=0;
	}
	
	public List<Teachers> getTeachers(){
		return teachers;
	}
	public void AddTeacher(Teachers teacher){
		teachers.add(teacher);
	}
	public List<Student> getStudents(){
		return student;
	}
	public void AddStudent(Student students) {
		student.add(students);
	}
	public static int getTotalMoneyEarnd() {
		return totalMoneyEarnd;
	}
	public static void updateTotalMoneyEarnd(int moneyEarnd) {
		totalMoneyEarnd+=moneyEarnd;
	}
	public int getTotalMoneySpent() {
		return totalMoneySpent;
	}
	public static void updateTotalMoneySpent(int moneySpent) {
		totalMoneyEarnd-=moneySpent;
	}
	
	
	
}
