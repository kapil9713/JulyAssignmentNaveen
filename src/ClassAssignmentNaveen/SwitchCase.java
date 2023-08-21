package ClassAssignmentNaveen;

public class SwitchCase {

	public static void main(String[] args) {
		
		String browser="chromee";
		
		switch (browser) {
		case "chrome":
			System.out.println("chrome is launched");
			break;
		case "firefox":
			System.out.println("firefox is launched");
			break;
		case "safari":
			System.out.println("safari is launched");
			break;
		case "Edge":
			System.out.println("Edge is launched");
			break;

		default:
			System.out.println("Please pass the right browser!!");
			break;
		}
		
		
		

	}

}
