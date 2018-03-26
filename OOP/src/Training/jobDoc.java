package Training;

public class jobDoc {
		String name;
		int age;
		int personalNumber;
		String position;
		double bonus;
		double salary;
		int exp;
		jobDoc(){
			name=this.name;
		}
		jobDoc(int age,int personalNumber,String position,double bonus,double salary,int exp){
			this();
			age=this.age;
			personalNumber=this.personalNumber;
			position=this.position;
			bonus=this.bonus;
			salary=this.salary;
			exp=this.exp;
		}
		double salaryFormula(double bonus,double salary) {
			salary=salary*bonus;
			System.out.println(salary);
			return salary;
		}
		int workingHours(int hours,int brake) {
			hours=(5*hours)-(5*brake);
			System.out.println(hours);
			return hours;
		}
		String levelUp(String position) {
			if(position.equalsIgnoreCase("worker")&&this.exp==1) {
				this.position="manager";
				return this.position;
			}else {
				return null;
			}
		
		}
}
