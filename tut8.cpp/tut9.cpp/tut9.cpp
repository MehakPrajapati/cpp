#include<iostream>

using namespace std;

int main(){
    int age;
    
    cout<<"tell me my age"<<endl;
    cin>>age;
   //selection control structure: if else -if else ladder
    if(age<18){
        cout<<"you can not come to my party"<<endl;
    }
    else if (age==18){
    cout<<"you aree a kid and you will get a kidd pass to the party"<<endl;
}
else {
    cout<<"you can come to the party"<<endl;
}
    /*cout<<"this is tutorial 9";
    int age;
    cout<<"tell me your age"<<endl;
    cin>>age;
     //selection control structure: switch case statements
   switch(age)
   {
    case 18:
    cout<<"you are 18"<<endl;
    break;

    case 22:
     cout<<"you are 22"<<endl;
    break;

    default:
    cout<<"no special cases"<<endl;
    break;
   }*/
    return 0;
}