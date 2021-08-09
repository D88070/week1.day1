package week1.day1;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range=10;int fnum=0; int b=1;
		int i; int sum = 0;
		System.out.println("fibonacci number is " + range);
		System.out.println(fnum);
		System.out.println(b);
		for(i=2;i<range;i++)
		{
			sum=fnum+b;
			System.out.println(sum);
			fnum=b;
			b=sum;
			
		}

	

	}

}
