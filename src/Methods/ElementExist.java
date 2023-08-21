package Methods;

public class ElementExist {
	
	public boolean isElementExist() {
		System.out.println("check element is present");
		boolean flag=true;
		return flag;
	}

	public static void main(String[] args) {
		
		ElementExist ex = new ElementExist();
		if(ex.isElementExist()) {
			System.out.println("click element");
		}

	}

}
