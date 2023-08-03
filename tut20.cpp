#include<iostream>
using namespace std;
inline int product(int a, int b){
return a*b;
}
float  moneyreceived(int currentmoney , float factor =1.04){
    return currentmoney* factor;
}
//int strlen(const char *p){

//}
 int main(){
int a,b;
//cout<<"enter the value of a and b "<<endl;
//cin>>(a,b);
//cout<<"the product of a and b "<<product(a,b)<<endl;
int money = 100000;
cout<<" for vip if you have "<<money<<"rs in your bank account,you will recive "<<moneyreceived(money,1.1)<<"rs after 1 year "<<endl;



    return 0;
}