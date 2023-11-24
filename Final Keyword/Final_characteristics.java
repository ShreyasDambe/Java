//This is the Final Characteristics program
//if We use Final Keyword for Characteristic them we cannot change Value of the characteristics

class Demo
{
    final public int i;
   // int j;

    public Demo()
    {
        this.i=11;
     //   j=22;
    }

    public void fun()
    {
        System.out.println(this.i);
       // System.out.println(j);
       // i++;                                      //Not Allowed
    }
}

public class Final_characteristics
{
    public static void main(String[] Args)
    {
        Demo dobj=new Demo();

        dobj.fun();
    }
}