class Fibo
{
	public static void main(String args[])
	{
		int f1=1,f0=0,f3,n=5,i=0;
		System.out.println(f0);
                System.out.println(f1);
		while(i<(n-1))
                {
                  
                 f3=f0+f1;
                 System.out.println(f3);
                 f0=f1;
                 f1=f3;
                 i=i+1;
                
                }
			
	}
}

