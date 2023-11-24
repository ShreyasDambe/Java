//Main.java

class Demo implements Cloneable
{
    public int ino1;
    public int ino2;

    public Demo(int x,int y)
    {
        System.out.println("Inside Parameterised Constructor");
        ino1=x;
        ino2=y;
    }

    protected Object Clone() throws CloneNotSupportedException
    {
        return super.clone();                 //return value obj
    }
}

public class Main
{
    public static void main(String Args[]) throws CloneNotSupportedException
    {
        System.out.println("Inside Main");

        Demo temp1 = new Demo(51,101);
        Demo temp2 = (Demo) temp1.Clone();     //typecast

        System.out.println("HashCode of temp1:"+temp1.hashCode());          
        System.out.println("HashCode of temp2:"+temp2.hashCode());         

       // temp1.ino1++;

        //System.out.println( temp1.ino1);          
        //System.out.println( temp1.ino2);             
        
        //hya Example madhe clone method use kelyavr temp1.ino1 chi value ++ keli tr fact temp1.ino1 chi ch value ++ honar
         //temp2.ino1 chi value ++honar nahi ti ahe tich rahil
    }
}