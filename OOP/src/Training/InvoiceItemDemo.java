package Training;

public class InvoiceItemDemo {

	public static void main(String[] args) {
	InvoiceItem invo1=new InvoiceItem("Ko2030","Parfume",10,30);
		System.out.println(invo1.getTotal());
		System.out.println(invo1.getUnitPrice());
		invo1.setUnitPrice(500);
		System.out.println(invo1.getUnitPrice());
		invo1.setQty(20);
		System.out.println(invo1.getQty());
		System.out.println(invo1.getTotal());
		System.out.println(invo1.toString());

	}

}
