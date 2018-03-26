package Training;

public class AccountDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Account Acc1= new Account("G1","Georgi",300);
		Account Acc2=new Account("P1","Pavlin",0);
		Acc1.transferTo(Acc2, 150);
		System.out.println(Acc2.getBalance());
		System.out.println(Acc1.toString());
		Acc1.credit(200);
		System.out.println(Acc1.toString());
		Acc2.debit(200);
	}

}
