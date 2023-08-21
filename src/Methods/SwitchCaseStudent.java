package Methods;

public class SwitchCaseStudent {
	
	public int getStudent(String name) {
		switch (name) {
		case "A":
			System.out.println("getting marks of student=:");
		case "Neha":
			if(name.equals("Neha")) {
				return 100;
			}
		case "Somesh":
			if(name.equals("Somesh")) {
				return 90;
			}
		case "Amin":
			if(name.equals("Amin")) {
				return 80;
			}
			break;

		default:
			System.out.println("student not found");
			
			
		}
		return -1;
	}

	public static void main(String[] args) {
		
		
		Student st=new Student();
		int m1=st.getStudent("Aminn");
		System.out.println(m1);
		
		
		
		

	}

}
