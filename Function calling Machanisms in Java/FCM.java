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

class Demo
{
    public void Swap(int ival1,int ival2)
    {
        int Temp=0;

        Temp = ival1;
        ival1 = ival2;
        ival2 = Temp;
    }
}

class FCM
{
    public static void main(String Args[])
    {
        int ino1 = 11;
        int ino2 = 21;

        Demo dobj = new Demo();

        dobj.Swap(ino1,ino2);
        System.out.println("Values After Swapping ino1="+ino1+"ino2="+ino2);
    }
}