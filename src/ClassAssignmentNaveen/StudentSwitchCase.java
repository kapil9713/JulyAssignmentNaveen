package ClassAssignmentNaveen;

public class StudentSwitchCase {
	
	public int getStudent(String name) {
		
		int marks;
		
		switch (name) {
		case "Ravi":
			if(name.equals("Ravi")) {
				return marks=100;
			}
			
			
		

		default:
			System.out.println("Student Not found");
			break;
		}
		return -1;
		
	}

	public static void main(String[] args) {
		
		StudentSwitchCase st=new StudentSwitchCase();
		int student = st.getStudent("Ravii");
		System.out.println(student);

		
		
		
		
		
		
		
		
		
		
		
	}

}
