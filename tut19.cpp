#include<iostream>
using namespace std;

int sum(int a, int b) {
    int c = a + b;
    return c;
}
//call by reference using pointers
void swappointer(int* a, int* b){ 
int temp =*a;              
*a = *b;
*b= temp;
}

int main(){
    int a = 4, b=5;
//cout<<"the sum of 4 and 5 is "<<sum(4,5);
cout<<"The value of a is " << a << " and the value of b is " << b <<endl;
//swap(a,b); this will not swap a and b
// Call the swappointer function to swap the values of a and b
swappointer(&a,&b);
cout<<"The value of a is " << a << " and the value of b is " << b <<endl;
    return 0;
}