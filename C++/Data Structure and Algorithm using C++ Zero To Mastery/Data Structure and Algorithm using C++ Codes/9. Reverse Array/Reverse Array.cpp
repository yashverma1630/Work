#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter n : ";
    cin>>n;

    int a[n];
    cout<<"Enter Values : ";
    for(int i=0;i<n;i++){
        cin>>a[i];
    }

    cout<<"Before Reverse : "<<endl;
    cout<<"Array : ";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    }

    cout<<endl;

    /* Reverse Code */

    int start = 0;
    int end = n-1;

    while (start<=end){
        swap(a[start],a[end]);
        start++;
        end--;
    }

    /* End */

    cout<<"After Reverse : "<<endl;
    cout<<"Reversed Array : ";
    for(int i=0; i<n; i++){
        cout<<a[i]<<" ";
    }
}
/* Output

Enter n : 5
Enter Values : 1 2 3 4 5
Before Reverse :
Array : 1 2 3 4 5
After Reverse :
Reversed Array : 5 4 3 2 1

*/
