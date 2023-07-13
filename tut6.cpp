#include<iostream>
/*there are two type of header files
1. system header files: it comes with the compiler
2. user define header file: it is written by the programmer */

using namespace std;

int main(){
    int a=5,b=10;

    cout<<"operators in c++:"<<endl;
    cout<<"1 following are the type of operators in c++"<<endl;
    //arithmetic operators
    cout<<"the value of a + b is "<<a+b<<endl;
    cout<<"the value of a - b is"<<a-b<<endl;
    cout<<"the value of a -- is"<<a--<<endl;
    cout<<"the value of a ++ is"<<a++<<endl;
    cout<<"the value of a % b is"<<a%b<<endl;
    cout<<"the value of a * b is"<<a*b<<endl;
    cout<<"the value of a / b is"<<a/b<<endl;
    cout<<"the value of a - b is"<<a-b<<endl;
    cout<<"the value of ++a is"<<++a<<endl;
    cout<<endl;

    /*assignment operators-->used to assign vaalue of variables
    int a=3,b=9
    char d='d';
    
    comparison operators*/
    cout<<"2.following are the type of comparison operators in c++"<<endl;
    cout<<"the value of a==b is "<<(a==b)<<endl;
    cout<<"the value of a > b is "<<(a>b)<<endl;
    cout<<"the value of a < b is "<<(a<b)<<endl;
    cout<<"the value of a <= b is "<<(a<=b)<<endl;
    cout<<"the value of a >= b is "<<(a>=b)<<endl;
    cout<<"the value of a != b is "<<(a!=b)<<endl;
    cout<<endl;
    //logical operators
    cout<<"the value of this logical and operator((a==b) && (a<b)) is :" <<((a==b) && (a<b))<<endl;
    cout<<"the value of this logical or operator((a==b) ||(a<b)) is :" <<((a==b) || (a<b))<<endl;


    cout<<"the value of this logical or operator(!(a==b) ||(a<b)) is :" <<(!(a==b) || (a<b))<<endl;

    return 0;
}