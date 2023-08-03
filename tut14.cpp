#include<iostream>
using namespace std;

int main(){
    // pointer and arrays
int marks[] = {23,24, 25, 26};
int mathmarks[4];
mathmarks[0] = 78;
mathmarks[1] = 40;
mathmarks[2] = 44;
mathmarks[3] = 70;
int* p = marks;
cout<<"the value of *P is"<<*(p)<<endl;
cout<<"the value of *(p+1) is"<<*(p+1)<<endl;
cout<<"the value of *(p+2) is"<<*(p+2)<<endl;
cout<<"the value of *(p+3) is"<<*(p+3)<<endl;
    return 0;
}
