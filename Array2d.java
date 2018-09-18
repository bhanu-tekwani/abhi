import java.util.*;
class Array2d
{
	public static void main(String args[])
	{
		int n,i,j,k;
		int [][]a=new int [2][2];
		int [][]b=new int [2][2];
		int [][]c=new int [2][2];
		Scanner sc=new Scanner(System.in);
		System.out.println("1)Sum of matrix 2)Multiplication of matrix 3)Transpose");
	     	System.out.println("Enter a Choice");
		n=sc.nextInt();
		switch(n)
		{	
		case 1:
		System.out.println("Enter Elements of Array 1");
		for(i=0;i<2;i++)
		{ 
			for(j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Elements of Array 2");
		for(i=0;i<2;i++)
		{ 
			for(j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Sum of both Arrays is:");
		for(i=0;i<2;i++)
		{ 
			for(j=0;j<2;j++)
			{
				c[i][j]=a[i][j]+b[i][j];
				System.out.print(c[i][j]+"\t");
				
			}
System.out.println();
		}break;
		
		case 2:
		System.out.println("Enter Elements of Array 1");
		for(i=0;i<2;i++)
		{ 
			for(j=0;j<2;j++)
			{
				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Enter Elements of Array 2");
		for(i=0;i<2;i++)
		{ 
			for(j=0;j<2;j++)
			{
				b[i][j]=sc.nextInt();
			}
		}
		System.out.println("Multiplication of both Arrays is:");
		for(i=0;i<2;i++)
		{ 
			for(j=0;j<2;j++)
			{
				for(k=0;k<2;k++)
				{
				c[i][j] +=a[i][k]*b[k][j];
				}
			}
		}
		for(i=0;i<2;i++)
		{ 
			for(j=0;j<2;j++)
			{
				System.out.println(c[i][j]);
			}
		}
		break;
		case 3:
		System.out.println("Enter Elements of Array 1");
		for(i=0;i<2;i++)
		{ 
			for(j=0;j<2;j++)
			{

				a[i][j]=sc.nextInt();
			}
		}
		System.out.println("Transpose of Array is");
		for(i=0;i<2;i++)
		{ 
			for(j=0;j<2;j++)
			{
				c[i][j]=a[j][i];
				System.out.println(c[i][j]);
			}
		}
		default :
		System.out.println("Invalid Input");
		}
					
	}
}
