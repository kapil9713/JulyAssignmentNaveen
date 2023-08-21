package Methods;

public class SimpleInterest {

	public int simpleInterest(int p, int r, int t) {
		int si = p * r * t / 100;
		return si;

	}
	
	public int profit(int sp,int cp) {
		int profit=sp-cp;
		return profit;
	}
	public int loss(int cp,int sp) {
		int loss=cp-sp;
		return loss;
	}
	public int profitPercentage(int p,int cp) {
		int percent=p/cp*100;
		return percent;
	}
	public int lossPercentage(int l,int cp) {
		int loss=l/cp*100;
		return loss;
	}
	

	public static void main(String[] args) {
		
		SimpleInterest si=new SimpleInterest();
		
		int interest=si.simpleInterest(1000, 10, 2);
		System.out.println(interest);
		
		int profit = si.profit(200, 100);
		System.out.println("P="+profit);
		
		int loss=si.loss(500, 300);
		System.out.println("L="+loss);
		
		int profitPercentage = si.profitPercentage(100, 1000);
		System.out.println("P%="+profitPercentage);
		
		int lossPercentage = si.lossPercentage(200, 1000);
		System.out.println("L%="+lossPercentage);

	}

}
