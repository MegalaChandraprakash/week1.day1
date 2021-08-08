package week1.day1;

public class ArmstrongNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
int n=371,temp,Armstrong=0;
int initialvalue =371;
while(n>0)
{
	temp=n%10;
	temp=temp*temp*temp;
	Armstrong=Armstrong+temp;
	n=n/10;
}
	if(Armstrong==initialvalue)
	{
		System.out.println("the number is armstrong");
	}
	else {
		System.out.println("the number is not armstrong");
	}
}
}
