import java.util.*;
class Array
{
	public static void main(String args[])
	{
		int n,i,s=0,j,t=0;
		Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a Length of Array");
	        n=sc.nextInt();
		System.out.println("Enter Elements of Array");
		int a[]=new int[n];
		for(i=0;i<a.length;i++)
		{ 
			a[i]=sc.nextInt();
		}
		for(i=0;i<n;i++)
		{
			for(j=0;j<n-1;j++)
			{ 
				if(a[j]>a[j+1])				
				{
				t=a[j+1];
				a[j+1]=a[j];
				a[j]=t;
				}
			}
		}
		for(i=0;i<n;i++)
		{ 
			System.out.println(a[i]);
		}				
	}
}
