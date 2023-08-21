package Methods;

public class SwitchCase2 {
	
	public String getStudentInfo(String name) {
		
		switch (name) {
		case "Kapil":
			System.out.println("student found"+name);
			
			return name;
		case "RSSB":
			System.out.println("student found"+name);
			
			return name;
		case "Amit":
			System.out.println("student found"+name);
			
			return name;
		case "sehore":
			System.out.println("student found"+name);
			
			return name;

		default:
			System.out.println("student not found"+name);
			break;
		}
		return name;
	}

	public static void main(String[] args) {
		
		SwitchCase2 s2=new SwitchCase2();
		String data=s2.getStudentInfo("RSSB");
		System.out.println(data);
		
		
		
		
		

	}

}
