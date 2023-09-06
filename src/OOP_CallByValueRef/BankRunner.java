package OOP_CallByValueRef;

public class BankRunner {

	public static void main(String[] args) {

		
		Bank bk1=new Bank();
		
		System.out.println("name="+bk1.name+" "+bk1.city); //kapil pune
		
		bk1.getInfo(bk1);
		
		bk1.name="Pooja"; 
		bk1.city="Indore";
		
		System.out.println("name="+bk1.name+" "+bk1.city); //pooja indore
		
	}

}
