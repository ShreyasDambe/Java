class Hello
{
    public int i;           //instance variable
    public static int j;         //Static variable(characteristics)

    static                   //static Block
    {
        System.out.println("First static block from hello!");
    }

    static                   //static Block
    {
        System.out.println("Second static block from hello!");

        j=21;
    }

    public Hello ()                 //Constructor
    {
        System.out.println("inside Hello Constructor");

        i=11;
    }

    public void Fun()
    {
        //public static int s=10;                            // inside the Function local Static variable Cannot Allowed
        //System.out.println(s);
        System.out.println("Inside Hello Fun!!!");       
    }

    public static void Gun()
    {
        System.out.println("Inside Hello static Gun!!!");       
    }

    
}

class Demo
{
    static                   //static Block
    {
        System.out.println("First static block from Demo!");           //Executed Before the Main

    }

    public static void main(String[] Args)
    {
        System.out.println("Inside main");

        Hello.Gun();

        System.out.println(Hello.j);

        Hello Hobj=new Hello();

        Hobj.Fun();

        System.out.println(Hobj.i);
    }

  
}