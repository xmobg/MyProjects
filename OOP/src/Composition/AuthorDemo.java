package Composition;

public class AuthorDemo {

	public static void main(String[] args) {
		Author author1=new Author("J.J.Tolki","contactme@gmail.com",'m');
		System.out.println(author1.toString());
			author1.setEmail("zahap@abv.bg");
			System.out.println(author1.toString());
			System.out.println("My email adress is" +author1.getEmail());
			System.out.println("Hi my name is"+author1.getName());
			System.out.println("And my sex is "+author1.getGender());
	}

}
