package SchoolManagementSystem;
import java.util.ArrayList;
import java.util.List;

public class Main {

	public static void main(String[] args) {
			Teachers lizzy = new Teachers(1,"Lizzy",500);
			Teachers melisa=new Teachers(2,"Melisa",800);
			Teachers johnny=new Teachers(3,"Johnny",400);
			
			List<Teachers> teacherList=new ArrayList<>();
			teacherList.add(lizzy);
			teacherList.add(melisa);
			teacherList.add(johnny);
			
			Student ana=new Student(1,"Ana",4);
			Student john=new Student(2,"john",6);
			Student tobby=new Student(3,"tobby",3);
			
			List<Student> studentList = new ArrayList<>();
			studentList.add(ana);
			studentList.add(john);
			studentList.add(tobby);
			School pmg= new School(teacherList,studentList);
			ana.payFees(5000);
			john.payFees(10000);
			System.out.println("PMG has earned: "+pmg.getTotalMoneyEarnd());
			System.out.println("School pay salary");
			lizzy.receiveSalary(lizzy.getSalary());
			System.out.println("School has spend for salary to :"+lizzy.getName()
					+ "and now has  "+pmg.getTotalMoneyEarnd());
			johnny.receiveSalary(johnny.getSalary());
			System.out.println("School has spend for salary to :"+johnny.getName()
					+ "and now has  "+pmg.getTotalMoneyEarnd());
			
	}

}
