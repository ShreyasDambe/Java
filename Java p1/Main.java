/*class Student
{
   String Sname;
    int iRollno;

    Student()
    {
        Sname= "John";
        iRollno=21;
    }
    
    public void Displaydetails()
    {
        System.out.println("Student Name is:"+Sname);
        System.out.println("Student Roll no is:"+iRollno);
    }
}

public class Main
{
    public static void main(String[] Args)
    {
        Student sobj=new Student();

        sobj.Displaydetails();
    }
}*/

import java.util.*;

class Area 
{
    public void Setdim()
    {
        int  Length;
        int Breadth;
    }
    
    public int getArea(int Length,int Breadth)
    {
         int Area;
         Area=Length*Breadth;
         return Area;
    }
    
    
}

public class Main
{
    public static void main(String[] Args)
    {
       int iArea;
        Area Aobj=new Area();
        Scanner Sobj=new Scanner(System.in);
        
        System.out.println("Enter Lenght of Area=");
        int ilen=Sobj.nextInt();
        
        System.out.println("Enter Breadth of Area=");
        int ibre=Sobj.nextInt();
        
        Aobj.Setdim();
        
       iArea= Aobj.getArea(ilen,ibre);
        
        System.out.println("Area of Rectangle is="+iArea);
    }
    
}