import java.util.*;
class Arm
{
        void arm(int a)
	{
		int sum=0,b,c;
		b=a;
		while(a>0)
                {
                  sum=sum*10;
		c=a%10;
                  sum=sum+(c*c*c);
                  a=a/10;
                }  
	        if(b==sum)              
		System.out.println("It is a Armstrong no");
	        else
		System.out.println("It is not a Armstrong no");

	
	}
}
class Palin
{
        void palin(int a)
	{
		int sum=0,b;
		b=a;
		while(a>0)
                {
                  sum=sum*10;
                  sum=sum+(a%10);
                  a=a/10;
                }  
	        if(b==sum)              
		System.out.println("It is a palindrome no");
	        else
		System.out.println("It is not a palindrome no");

	
	}
}
class Fibo
{
	 void fibo(int a)
	{
		int f1=1,f0=0,f3,i=0;

		System.out.println(f0);
                System.out.println(f1);
		while(i<(a-1))
                {
                  
                 f3=f0+f1;
                 System.out.println(f3);
                 f0=f1;
                 f1=f3;
                 i=i+1;
                
                }
			
	}
}

class Reverse
{
        void rev(int a)
	{
		int sum=0;

		while(a>0)
                {
                  sum=sum*10;
                  sum=sum+(a%10);
                  a=a/10;
                }                
		System.out.println("Reverse of no is: "+sum);
	
	}
}
class Prime
{
	public void primeno(int a)
	{
		int i=2,flag=0;
               
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
class Fact
{
                void fact(int a)
	{
		int f=1;
	        
		int i=1;
		while(i<=a)
                {
                  f=f*i;
                  i=i+1;
                }
		System.out.println("Factorial of no is: "+f);
	
	}
}
class Choice
{
	public static void main(String args[])
	{   int a,b;
            Scanner sc=new Scanner(System.in);
                System.out.println("Enter a Choice 1)Prime 2)Factorial 3)Reverse 4)Palindrone 5)Fibonacci 6)Armstrong");
                b=sc.nextInt();	
		System.out.println("Enter a number");
		a=sc.nextInt();	
                switch(b)
	{case 1:
         Prime g=new Prime();
	 g.primeno(a);
          break;
	 case 2:
	Fact g1=new Fact();
	 g1.fact(a);
         break;
	case 3:
	Reverse g2=new Reverse();
	 g2.rev(a);
         break;
	case 4:
	Palin g3=new Palin();
	 g3.palin(a);
         break;
	case 5:
	Fibo g4=new Fibo();
	 g4.fibo(a);
         break;
	case 6:
	Arm g5=new Arm();
	 g5.arm(a);
         break;
	default:
	System.out.println("Invalid Input");
	}
    
        
	}
}
