package NumberPrograms;

public class AmstrongNumber 
{
	public static void main(String[] args) {
		int n=153;
		
		int temp=n;
		int res=0;
		
		while(n>0)
		{
			int r=n%10;
			res=res+(r*r*r);
			n=n/10;
			
		}
		
		if(res==temp)
		{
			System.out.println("Amstrong Number");
		}
		else {System.out.println("Not");}
	}
}
