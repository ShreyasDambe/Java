//import Java.lang;

class Hello
{
    public static void main(String args[])
    {
        int ino = 11;

        Integer iobj = ino;            //Wrapper autoboxing

        System.out.println(iobj);       //11

        System.out.println(ino);          //11

        int j = iobj;                 //auto unboxing

        System.out.println(j);            //11
    }
}