#include<iostream>
using namespace std;

int main(){
    char a[19];
    cout<<"Enter values in a : ";
    cin.getline(a,19);/*this means we have 18 storage */
    cout<<endl;
    cout<<"Final Output is : "<<a;
}

/*Output
Enter values in a : Hello Yash

Final Output is : Hello Yash
*/
