package Date2209practice;

public class Perfectnumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 123;
		
		int sum=0;
		for(int i=0;i<=n/2;i++)
		{
			if(n %i==0)
			{
				sum=sum+i;
			}
		}
		if(sum==n)
		{
			System.out.println("perfect number");
		}
		else
		{
			System.out.println("not a perfect number");
			
		}

	}

}
