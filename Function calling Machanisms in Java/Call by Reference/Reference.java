///////////////////////////////////////////////////////////////////////////////////////
//                                                                                   //
// In Java We can Pass Parameters to the Function in Three Ways As Follows:          //
//  1.Call by Value                                                                  //
//  2.call by Address                                                                //
//  3.call by Reference                                                              //
//                                                                                   //
//          for use of this Three Ways We See Above Program:                         //
//                                                                                   //
///////////////////////////////////////////////////////////////////////////////////////


class MyInteger
{
    public int No;

    public MyInteger(int X)
    {
        this.No = X;
    }

}

class Demo
{
    public void Swap(MyInteger X,MyInteger Y)
    {
        int iTemp;

        iTemp = X.No;
        X.No = Y.No;
        Y.No = iTemp;
    }
}

public class Reference
{
    public static void main(String [] args)
    {
        MyInteger obj1 = new MyInteger(11);
        MyInteger obj2 = new MyInteger(21);

        Demo dobj = new Demo();

        System.out.println("Values Before Swapping obj1="+obj1.No+"obj2="+obj2.No);

        dobj.Swap(obj1,obj2);

        System.out.println("Values After Swapping obj1="+obj1.No+"obj2="+obj2.No);
    }

}