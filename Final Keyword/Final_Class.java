//this is the Final class program
//if we create our class Final then no one can inherite our class but we can create object of that class



final class Base
{
    int i;
    int j;

    Base()
    {
        i=10;
        j=20;
    }
    public void Fun()
    {
        System.out.printf(j+" is value of j ");
    }
}
//if class is final then we cannot Extend that class
//class Derived extend Base
//{
//    System.out.println("Inside Derived class");
//}

public class Final_Class
{
    public static void main(String[] Args)
    {
        System.out.println("Inside Main class");
        Base bobj=new Base();
        bobj.Fun();

    }
}

