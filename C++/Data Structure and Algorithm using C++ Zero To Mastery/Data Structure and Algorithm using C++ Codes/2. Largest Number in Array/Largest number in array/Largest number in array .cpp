#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter n : ";
    cin>>n;

    cout<<"Enter Values in Array : ";
    int a[n];
    for(int i=0;i<n;i++){
        cin>>a[i];
    }

    int largest=INT_MIN;
    for(int i=0;i<n;i++){
        if(a[i]>largest){
            largest=a[i];
        }
    }

    cout<<"Largest Number is "<<largest;
}

/*Output
Enter n : 5
Enter Values in Array : 1 2 5 10 4
Largest Number is 10
*/
