abstract class RBI
{
    public int IFSC=51;             //characteristics

    public RBI()
    {
        System.out.println("Inside RBI Constructor");
    }

    public void Details()
    {
        System.out.println("Details of RBI");
    }

  // inn C++ --->  Virtual void interest()=0;

    abstract public void interest();                      //Abstract Method

}

class PNB extends RBI
{
    
    public void interest()
    {
        System.out.println("Rate of interest is 5.5%");
    }

    public void FD()
    {
        System.out.println("FD of PNB");
    }
}

class Demo
{
    public static void main(String[] Args)
    {
        //RBI Robj=new RBI();            we cannot create object of Abstract class

        RBI Robj;                         //Allowed //This is the Reference

        PNB Pobj=new PNB();

        Pobj.Details();

        Pobj.interest();

        Pobj.FD();
    }
}