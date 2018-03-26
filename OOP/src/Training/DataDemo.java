package Training;

public class DataDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Date date1=new Date(24,2,1991);
		System.out.println(date1.toString());
		date1.setDate(21, 12, 1995);
		System.out.println(date1.toString());
		date1.setMonth(2);
		System.out.println(date1.toString());
		System.out.println(date1.getYear());
		System.out.println(date1.getDay());
	}

}
