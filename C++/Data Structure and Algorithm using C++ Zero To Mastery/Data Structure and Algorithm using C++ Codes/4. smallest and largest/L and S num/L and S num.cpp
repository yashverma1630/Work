#include<iostream>
using namespace std;

int main(){
    int n;
    cout<<"Enter n : ";
    cin>>n;

    int a[n];
    cout<<"Enter values : ";
    for (int i=0;i<n;i++){
        cin>>a[i];
    }

    int largest = INT_MIN ;/* INT_MIN means -infinity*/
    int smallest = INT_MAX;/*INT_MAX means +infinity*/

    for(int i=0;i<n;i++){
        if(a[i]>largest){
            largest = a[i];
        }

        if(a[i]<smallest){
            smallest = a[i];
        }
    }

    cout<<"largest number is "<<largest;
    cout<<"smallest number is "<<smallest;
}
