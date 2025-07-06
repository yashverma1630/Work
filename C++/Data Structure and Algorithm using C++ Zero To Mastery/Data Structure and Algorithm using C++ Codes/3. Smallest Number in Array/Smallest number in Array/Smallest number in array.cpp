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

    int smallest;
    smallest = INT_MAX; /*INT_MAX means +infinity*/

    for(int i=0; i<n; i++){
        if(a[i]<smallest){
            smallest=a[i];
        }
    }
    cout<<"smallest number in array is : "<<smallest;
}

/*output
Enter n : 5
Enter Values : 2 4 1 10 8
smallest number in array is : 1
*/
