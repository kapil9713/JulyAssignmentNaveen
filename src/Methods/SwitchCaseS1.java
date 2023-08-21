package Methods;

public class SwitchCaseS1 {
	public String getStudent(String name) {
		System.out.println("Student Info");
		if(name.equals("Kapil")) {
			System.out.println("Student Data is found= : "+name);
			return name;
		}
		else if(name.equals("Angad")) {
			System.out.println("Student data is found= :"+name);
			return name;
		}
		else if(name.equals("RSSB")) {
			System.out.println("Student data is found= :"+name);
			return name;
		}
		else {
			System.out.println("Student Not found :"+ name);
		}
		return name;
		
	}
	

	public static void main(String[] args) {
		
		SwitchCaseS1 s1=new SwitchCaseS1();
		String data=s1.getStudent("Jyoti");
		System.out.println(data);
		
		
		
		
		
		
		

	}

}
