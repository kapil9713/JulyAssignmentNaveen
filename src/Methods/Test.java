package Methods;

public class Test {

	public static void main(String[] args) {

		
		
		Registration reg=new Registration("ravi", "sharma", 30, "ravi90", "ravi@123");
		
		System.out.println(reg.getName()+" "+reg.lastname+ reg.age+" "+" "+reg.getUsername()+" "+reg.getPassword());
		
		reg.setName("kapil");
		System.out.println(reg.getName()+" "+reg.lastname+ reg.age+" "+" "+reg.getUsername()+" "+reg.getPassword());

		
		System.out.println("********************");
		
		Company com=new Company();
		com.setName("om");
		String name = com.getName();
		System.out.println(name);
		
		com.setId(1);
		int id = com.getId();
		System.out.println(id);
		
		com.setEmail("om@gmail.com");
		String email = com.getEmail();
		System.out.println(email);
		
		
		
		
	}

}
