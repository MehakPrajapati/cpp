#include<iostream>
using namespace std;

struct employee
{
    /* data */
    int eid;
    char favchar;
    float salary;
};

int main() {
    // Create an employee variable and assign values
    struct employee harry;
    harry.eid = 1;
    harry.favchar = 'c';
    harry.salary = 120000;

    // Print the information
    cout << "Employee ID: " << harry.eid << endl;
    cout << "Favorite Character: " << harry.favchar << endl;
    cout << "Salary: $" << harry.salary << endl;

    return 0;
}







