///////////////////////////////////////////////////////////////////////////////////////
//                                                                                   //
// In C++ We can Pass Parameters to the Function in Three Ways As Follows:           //
//  1.Call by Value                                                                  //
//  2.call by Address                                                                //
//  3.call by Reference                                                              //
//                                                                                   //
//          for use of this Three Ways We See Above Program:                         //
//                                                                                   //
///////////////////////////////////////////////////////////////////////////////////////



#include<iostream>

using namespace std;

void SwapCBv(int inum1,int inum2)         //Defination of Call by Value
{
    int iTemp=0;
    
    iTemp=inum1;
    inum1=inum2;
    inum2-iTemp;

}

void SwapCBa(int* iptr1,int* iptr2)         //Defination of Call by Address
{
    int iTemp=0;
    
    iTemp=*iptr1;
    *iptr1=*iptr2;
    *iptr2=iTemp;

}

void SwapCBr(int &Ref1,int &Ref2)              //Defination of Call by Reference
{
    int iTemp=0;
    
    iTemp=Ref1;
    Ref1=Ref2;
    Ref2=iTemp;

}

int main()
{
    int ino1=11;
    int ino2=21;                         //for Value And Address

    int iVal1=101;
    int iVal2=201;                       //for Reference


    cout<<"Call by Value"<<"\n";
    cout<<"Values Before Swapping ino1="<<ino1<<"And ino2="<<ino2<<"\n";
    SwapCBv(ino1,ino2);
    cout<<"Values After Swapping ino1="<<ino1<<"And ino2="<<ino2<<"\n";


     cout<<"Call by Address"<<"\n";
    cout<<"Values Before Swapping ino1="<<ino1<<"And ino2="<<ino2<<"\n";
    SwapCBa(&ino1,&ino2);
    cout<<"Values After Swapping ino1="<<ino1<<"And ino2="<<ino2<<"\n";


     cout<<"Call by Reference"<<"\n";
    cout<<"Values Before Swapping iVal1="<<iVal1<<"And iVal2="<<iVal2<<"\n";
    SwapCBr(iVal1,iVal2);
    cout<<"Values After Swapping iVal1="<<iVal1<<"And iVal2="<<iVal2<<"\n";
    
    
    

}