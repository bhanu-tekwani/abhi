import java.util.*;
class Demo
{
        void area()
	{
		int a;
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter a Radius of Circle");
                a=sc.nextInt();
		float b;
		b=4*3.14f*a*a;             
		System.out.println("Area of circle is "+b);
	}
	
 	void area(int b)
	{
	 	float a;
	 	a=4*3.14f*b*b;
	 	System.out.println("Area of Circle "+a);
	}
        
	void area(int l,int b)
	{   
		int c;
		c=l*b;             
		System.out.println("Area is Rectange is  "+c);
	}
	
	public static void main(String args[])
	{       
		int b,l;
		float d1;
		Scanner sc=new Scanner(System.in);
                System.out.println("Enter a Length");
                l=sc.nextInt();
                System.out.println("Enter a Breadth");
                b=sc.nextInt();
       		Demo d=new Demo();
		d.area();
		d.area(b);
		d.area(l,b);
	}
}
