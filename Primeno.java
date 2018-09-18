import java.util.*;
class Prime
{
	public void sum()
	{
		int a,i=2,flag=0;
                Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number");
                a=sc.nextInt();
                for(;i<a;i++)
                {
	          if(a%i==0)
	           {System.out.println("Number is not prime");
	            flag=1;
                     break;}
	         }
	         if(flag==0)
                  System.out.println("Number is prime");
	}
}
class Primeno
{
	public static void main(String args[])
	{
             Prime g=new Prime();		
		g.sum();	
	}
}
