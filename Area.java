import java.util.*;
class Demo
{
        void area()
	{int a;
	Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number");
                a=sc.nextString();
   
		
                float b;
		
	        b=4f*3.14f*a*a;             
		System.out.println("Area is "+b);

	
	}
 	void area(int b)
	{float a;
	 a=4f*3.14f*b*b;
	System.out.println("Area is "+a);
        }
         int area()
	{int a;
	Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number");
                a=sc.nextString();
                float b;
		
	        b=4f*3.14f*a*a;        
		return b;

	
	}
	void area(int l,int b)
	{   
		
                int c;
		
	        c=l*b;             
		System.out.println("Area is "+c);

	
	}
	public static void main(String args[])
	{
	int a;
	Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number");
                b=sc.nextString();
	Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number");
                l=sc.nextString();
	Scanner sc=new Scanner(System.in);
                System.out.println("Enter a number");
                b=sc.nextString();
       	Demo d=new Demo();
	d.area();
	d.area(b);
	d.area(l,b);
	}
}
