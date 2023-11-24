//This is the Final Method program
//if we create final method then we cannot inherite that method
//we can Define this(final) method in Derived class but with different prototype but it is not consider as Methos Overriding
  
class Base
{
    public void Fun()
    {
        System.out.println("Inside Base Fun");
    }

    final public void Gun()
    {
        System.out.println("Inside Base Gun");
    }
}

class Derived extends Base
{
    public void Fun()                       //overriding Allowed
    {
        System.out.println("Inside Desived Fun");
    }

   // public void Gun()           
    //{
      //  System.out.println("Inside Derived Gun");
    //}

}

public class Final_Method
{
    public static void main(String[] Args)
    {
        Base bobj=new Base();
        bobj.Fun();
        bobj.Gun();

        Derived dobj=new Derived();
        dobj.Fun();
    }
    
}
