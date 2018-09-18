import java.util.*;
class Cuboid
{
        Cuboid()
	{
		int l,b,h,a;
		Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a Length");
	        l=sc.nextInt();
		System.out.println("Enter a Breadth");
	        b=sc.nextInt();
		System.out.println("Enter a Height");
	        h=sc.nextInt();
		a=2*((l*b)+(b*h)+(l*h));
		System.out.println("Area of cuboid "+a);	
	}

	Cuboid(int l,int b,int h)
	{   
		
                int a;
		a=2*((l*b)+(b*h)+(l*h));
		System.out.println("Area of cuboid "+a);
	
	}
	public static void main(String args[])
	{
		int l,b,h;
		Scanner sc=new Scanner(System.in);
	        System.out.println("Enter a Length");
	        l=sc.nextInt();
		System.out.println("Enter a Breadth");
	        b=sc.nextInt();
		System.out.println("Enter a Height");
	        h=sc.nextInt();

        Cuboid d=new Cuboid();
	Cuboid d1=new Cuboid(l,b,h);
	}
}
