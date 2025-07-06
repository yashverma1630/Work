#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter n : ";
    cin>>n;

    cout<<"Enter Values : ";

    int a[n];
    for(int i=0; i<n; i++){
        cin>>a[i];
    }

    int sum;
    sum = 0;
    for(int i=0;i<n;i++){
        sum = sum + a[i];
    }

    cout<<"Sum of values : "<<sum;
}

/* output
Enter n : 5
Enter Values : 1 2 3 4 5
Sum of values : 15
*/
