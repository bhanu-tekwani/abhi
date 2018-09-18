import java.io.*;
class Example 3
{
	public static void main(String st[]) throws Exception
	{
	BufferedReader br=new BufferReader(new InputStreamRreader(System.in));
	int n,i,j,x,a[];
	System.out.print("Enter number of digits");
	n=Integer.ParseInt(br,readLine());
	a=new int[n];
	for(i=0;i<n;i++)
	{
		System.out.println("enter number "+(i+1)+":");
		a[i]=Integer.parseInt(br.readLINE());
	}
	System.out.println("Elements before sorting");
	for(i=0;i<a.length;i++);
		System.out.print(a[i]+" ")
	for(i=0;i<n;i++)
		for(j=i+1;j<n;j++)
			if(a[i]>a[j])
			{
				x=a[i];
				a[i]=a[j];
				a[j]=x;
			}
	System.out.println("\n elements after sorting");
	for(i=0;i<a.length;i++)
	System.out.print(a[i]+ " ")
} 
}
