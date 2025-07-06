#include<iostream>
using namespace std;
int main(){
    int n;
    cout<<"Enter n : ";
    cin>>n;

    int a[n];
    cout<<"Enter values : ";
    for(int i=0;i<n;i++){
        cin>>a[i];
    }

    cout<<"Normal : ";
    for(int i=0;i<n;i++){
        cout<<a[i]<<" ";
    };

    cout<<endl;

    cout<<"Reverse : ";
    for(int i=n-1;i>=0;i--){
        cout<<a[i]<<" ";
    }
}

/*Output

Enter n : 5
Enter values : 1 2 3 4 5
Normal : 1 2 3 4 5
Reverse : 5 4 3 2 1

*/
