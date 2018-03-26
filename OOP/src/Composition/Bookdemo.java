package Composition;

public class Bookdemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Author Ch= new Author("Cara Hunter","ch.writer@gmail.com",'f');
		System.out.println(Ch);
		Book cTH=new Book("Close to Home",Ch,3.99,10);
		System.out.println(cTH);
		cTH.setPrice(9.99);
		cTH.setQty(30);
		System.out.println("name is: "+cTH.getName());
		System.out.println("name is: "+cTH.getPrice());
		System.out.println("name is: "+cTH.getQty());
		System.out.println("Author is: "+cTH.getAuthor());
		System.out.println("Author is: "+cTH.getAuthor().getName());
		System.out.println("Author is: "+cTH.getAuthor().getEmail());
		System.out.println("The author email is:"+cTH.getAuthor().getName());
		
	}

}
