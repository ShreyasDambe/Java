//Hello.java

import java.util.Scanner;

class Hello
{
    public static void main(String Args[])
    {
        Scanner Sobj = new Scanner(System.in);

        System.out.println("Enter your Name:");
        String Name = Sobj.nextLine();

        System.out.println("Enter your Age:");
        byte iAge = Sobj.nextByte();

        System.out.println("Enter your Percentage:");
        float fPer = Sobj.nextFloat();

        System.out.println("Your Name is:"+Name);
        System.out.println("Your Age is:"+iAge);
        System.out.println("Your Percentage is:"+fPer);
    }
}


