class Batch
{
    public int Fees;
    public String name;

    public Batch(int ino,String str)
    {
        Fees=ino;
        name=str;
    }

   
    public String toString() 
    {
        return Fees +  name;            //8000+PPA=8000PPA
    }
}

class Main
{
    public static void main(String Args[])
    {
        Batch bobj=new Batch(8000,"PPA");

        Batch cfobj=new Batch(3000,"Computer Foundation");

        System.out.println(bobj.toString());
        System.out.println(cfobj.toString());

        System.out.println(bobj.hashCode());
        System.out.println(cfobj.hashCode());
    }
}