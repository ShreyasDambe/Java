//Demo.java

class Demo
{
    public int ino1;
    public int ino2;

    public Demo()
    {
        System.out.println("Inside Constructor");
    }

    protected void Finalize()
    {
        System.out.println("Inside Finalized");
    }

}

class Main
{
    public static void main(String Args[])
    {
        Demo dobj = new Demo();              //Constructor call

        //Demo fobj = new Demo();
        //dobj.Finalize();
        dobj = null;

       // System.gc();       //This is a Explicite call to call a Garbage Collector
    }
}