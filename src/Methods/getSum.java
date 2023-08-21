package Methods;

public class getSum {
	
	
	public int getSum(int a,int b) {
		int sum=a+b;
		return sum;
	}

	public static void main(String[] args) {
		
		getSum s1=new getSum();
		int sum=s1.getSum(200, 100);
		System.out.println(sum);

	}

}
