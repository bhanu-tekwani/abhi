class Reverse
{
	public static void main(String args[])
	{
		int n=123,sum=0;
		while(n>0)
                {
                  sum=sum*10;
                  sum=sum+(n%10);
                  n=n/10;
                }                
		System.out.println("Reverse of no is: "+sum);
	
	}
}
