package Training;

public class Account {
	private String id;
	private String name;
	private int balance=0;
	Account(String id,String name){
		this.id=id;
		this.name=name;
	}
	Account(String id,String name,int balance){
		this.id=id;
		this.name=name;
		this.balance=balance;
	}
	public String getID() {
		return id;
	}
	public String getName() {
		return name;
	}
	public int getBalance() {
		return balance;
	}
	public int credit(int amount) {
		balance+=amount;
		return balance;
	}
	public void debit(int amount) {
		if(amount<=balance) {
			balance-=amount;
		}
		else {
			System.out.println("Amount exceeded balance");
		}
		
	}

	public void transferTo(Account bank, int amount) {
		if(amount<=balance) {
			balance-=amount;
			bank.credit(amount);
			System.out.println("Transfer is succesful");
		}
		else {
			System.out.println("Not enough money");
		}
		
			
	}
	public String toString() {
		return "Account id: "+id+" name: "+name+" balance: "+balance;
	}
}
