package SchoolManagementSystem;

//this class is responsible for keeping
//track on students- fees,name,grade.
//students have to pay 30 000 $ fee

public class Student {
	private int id;
	private String name;
	private int grade;
	private int feesPaid;
	private int feesTotal;

	
	public Student(int id,String name,int grade){
			this.id=id;
			this.name=name;
			this.grade=grade;
			this.feesPaid=0;
			this.feesTotal=30000;
	}
	public void setGrade(int grade) {
		this.grade=grade;
	}
	public void payFees(int fees) {
		this.feesPaid+=fees;
		School.updateTotalMoneyEarnd(fees);
	}
	/**
	 * 
	 * @return id of the student
	 */
	public int getId() {
		return this.id;
	}
	/**
	 * 
	 * @return the name of the student
	 */
	public String getName() {
		return this.name;
	}
	/**
	 * 
	 * @return the grade of the student
	 */
	public int getGrade() {
		return this.grade;
	}
	/**
	 * 
	 * @return fees paid
	 */
	public int getFeesPaid() {
		return this.feesPaid;
	}
	/**
	 * 
	 * @return total fees
	 */
	public int getFeesTotal() {
		return this.feesTotal;
	}
	
	public int getRemainingFees() {
		return feesTotal-feesPaid;
	}
	
	
}
