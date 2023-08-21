package Methods;

public class Student {

	public int getStudent(String Name) {

		int marks = 0;
		System.out.println("Getting student marks :" + Name);
		if (Name.equals("Neha")) {
			System.out.println(100);
			// return 100;
		} else if (Name.equals("Somesh")) {
			System.out.println(90);
			// return 90;
		} else if (Name.equals("Amin")) {
			System.out.println(80);
			// return 80;
		} else {
			System.out.println("Student not found");
		}
		return marks;

	}

	public static void main(String[] args) {

		Student st = new Student();
		int m1 = st.getStudent("Somesh");
		System.out.println(m1);

	}

}
