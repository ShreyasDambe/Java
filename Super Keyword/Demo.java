class Base
{
    public int i=11;

    public Base(int x)         //public nahi lihal tr te Default consider karat
    {
        System.out.println("From Base parameterised Constructor");
    }

    public int fun()
    {
        System.out.println("From Base Fun");
        return 0;

    }
}

class Derived extends Base
{
    public int x=21;

    public Derived()                   //base(11)
    {
        super(55);
        System.out.println("From Derived Constructor");
    }

    public void gun()
    {
        
        System.out.println(super.i);

        System.out.println(this.x);

        System.out.println(super.fun());
    }
}

class Demo
{
    public static void main(String[] Args)
    {
       // Derived dobj;          //object reference: its going to refer the object but currently its not referring anything because we 
                               //not Allocate memory yet of object

        Derived dobj=new Derived();
         
        //At this point memory gets stored inside Heap and the reference gets stored inside dobj

        dobj.gun();
    }
}