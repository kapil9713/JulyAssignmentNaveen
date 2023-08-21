package Methods;

public class Book   {
	
	public void rssbBook() {
		
		Awareness();
		Soul();
		Master();
		illusion();
		System.out.println("all the available book");
	}
	public void Awareness() {
		System.out.println("Awareness of the divine");
	}
	public void Soul() {
		System.out.println("Science of the soul");
	}
	public void Master() {
		System.out.println("Great master");
	}
	private void illusion() {
		System.out.println("Concept and illusion");
	}
	
	
	
	
	public static void main(String[] args) {
		Book bk=new Book();
		bk.rssbBook();
		
		Book1 bk1= new Book1();
		bk1.illusion();
	}

}
