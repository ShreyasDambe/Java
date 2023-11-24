//Main.java

class Demo
{
    public int ino1;
    public int ino2;

    public Demo(int x,int y)
    {
        System.out.println("Inside Parameterised Constructor");
        ino1=x;
        ino2=y;
    }
}

public class Main
{
    public static void main(String Args[])
    {
        Demo obj1 = new Demo(11,12);
        Demo obj2 = obj1;

        System.out.println(obj1.hashCode());          //580
        System.out.println(obj2.hashCode());          //580   This is the Hashcode of obj1 & obj2 

        obj1.ino1++;

        System.out.println(obj1.ino1);          //12
        System.out.println(obj2.ino2);          //12

       // hya Example madhe obj1.ino1 chi value ++ keli tar obj2 madhlya ino1 chi pn value ++ hotiye
        // mhanun ha Drawback kadhnyasathi apan clone method use krto....
    }
}