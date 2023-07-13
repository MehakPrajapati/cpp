#include<iostream>

using namespace std;
int main(){
   // pointer in c++ ------> data type which holds the adress of other data types
   int a=3;
   int *b=&a;
   //&---> adress of operator
   cout<<"the adress of a is"<<&a<<endl;

   cout<<"the adress of a is"<<b<<endl;
    
   //*----> (value at) dereference operator
  cout<<"the value at adress of b is"<<*b;
  // pointer to pointer
  int** c=&b;
  cout<<"the adress of b is"<<&b<<endl;
  cout<<"the adress of b is"<<c<<endl;
  cout<<"the vale at address c is" <<*c<<endl;
  cout<<"the vale at address  value_at(value_at(c)) is" <<**c<<endl;
    return 0;
}