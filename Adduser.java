import java.util.*;//Declaration of scanner class
class add
{
    void add()    //Defining method
    {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter two numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=a+b;
        System.out.println("Addition is"+c);
    }
    void add(int x,int y)
    {
        int c;
        c=x+y;
        System.out.println("Addition of two numbers is"+c);
    }
    void add(int x,int y,int z)
    {
        int w;
        w=x+y+z;
        System.out.println("Addition of three numbers is"+w);
    }
}
class Sash      //class with main method
{
    public static void main(String args[])
    {
        int a,b,c;
        Scanner in=new Scanner(System.in);
        System.out.println("Enter three numbers");
        a=in.nextInt();
        b=in.nextInt();
        c=in.nextInt();
        add d=new add();
        d.add(a,b);
        d.add(a,b,c);
        d.add();
    }
}

