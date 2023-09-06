package OOP_Interfaces;

public class College implements UGC, DU, DAVV, BHU, BU {

	@Override
	public void kamlaNehru() {
		System.out.println("BU-degree college");
		

	}

	@Override
	public void rajivGandhi() {

		System.out.println("BU-enginner");
	}

	@Override
	public void rishiRaj() {
		System.out.println("BU-dental");
	}

	@Override
	public void aryaMahila() {

		System.out.println("BHU-polytechnic");
	}

	@Override
	public void vasantCollege() {

		System.out.println("BHU-arts");
	}

	@Override
	public void nehruCollege() {

		System.out.println("BHU-pharma");
	}

	@Override
	public void index() {

		System.out.println("DAVV-science");
	}

	@Override
	public void MGMMedical() {

		System.out.println("DAVV-medical");
	}

	@Override
	public void apex() {

		System.out.println("DAVV-enginner");
	}

	@Override
	public void shreeramCommerce() {

		System.out.println("DU-commerce");
	}

	@Override
	public void daulatRam() {

		System.out.println("DU-enginner");
	}

	@Override
	public void Hindu() {

		System.out.println("DU-arts");
	}

	@Override
	public void affliatedUniversity() {

		System.out.println("university grant commission");
	}

	// common
	public void collegeRegistration() {
		System.out.println("college registration");
	}

	
	public void collegeFees(int i) {
		System.out.println("college fees="+i);
	}

	@Override
	public void universityRegistration() {

		System.out.println("university registration");
	}

	@Override
	public void degreeApply() {
		
		System.out.println("Apply degree");
		
	}

	@Override
	public void nameCorrection() {

		System.out.println("Name correction");
	}

	@Override
	public void universityFees() {

		System.out.println("UGC Fees=5000");
		
		
	}

	
	

}
