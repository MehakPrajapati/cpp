#include<iostream>
using namespace std;
int fib(int n){
    if (n<2){
        return n;
    }
    return fib(n-2) + fib(n-1);
}
//fib(5)
//fib(4)+fib(3)
// fib(2)+fib(3)+fib(2)+fib(3)
int factorial(int n ){
    if (n<=1){
        return 1;
    }
    return n*factorial(n-1);
}

/* step by calc of factorial (4)
factorial(4)= 4*factorial(3);
factorial(4)= 4* 3 *factorial(2);
factorial(4)= 4* 3* factorial(1);
factorial(4)= 4*3*2*1;
factorial (4) = 24;
*/
int main(){
    int  a;
cout<<"enter number 1"<<endl;
cin>>a;
//cout<<"the factorial of " <<a<< "is"<<factorial(a)<<endl;
cout<<"the term in  fibonacci sequence at position "<<a<< "is" <<fib(a)<<endl;
    return 0;
}