package week1.day1;

public class Sumofdigit {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int a = 65785;
int sum=0,remainder=0;
while (a>0)
{
	remainder=a%10;
	sum = sum+remainder;
	a=a/10;
	
	

	}
System.out.println(sum);

}
}
