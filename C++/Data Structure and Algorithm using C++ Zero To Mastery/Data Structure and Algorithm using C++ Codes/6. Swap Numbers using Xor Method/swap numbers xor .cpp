#include<iostream>
using namespace std;

int main(){
    int a, b;
    cout<<"Enter a = ";
    cin>>a;

    cout<<"Enter b = ";
    cin>>b;

    cout<<"Before Swapping"<<endl;
    cout<<"a = "<<a<<endl;
    cout<<"b = "<<b<<endl;

    a = a^b;
    b = a^b;
    a = a^b;

    cout<<"After Swapping"<<endl;
    cout<<"a = "<<a<<endl;
    cout<<"b = "<<b<<endl;
}

/*Output
Enter a = 5
Enter b = 7
Before Swapping
a = 5
b = 7
After Swapping
a = 7
b = 5
*/

