#include<iostream>
using namespace std;
int length(char input[]){

    int count = 0;
    for(int i=0;input[i]!='\0';i++){
        count++;
    }
    return count;
}


int reverse(char input[]){
    int s = 0;
    int e = length(input) - 1;

    while (s<e){
        swap(input[s],input[e]);
        s++;
        e--;
    }
}


int main(){
    char a[101];
    cout<<"Enter Values in array : ";
    cin.getline(a,101);
    cout<<endl;
    cout<<"Original Array : "<<a<<endl;
    reverse(a);
    cout<<"Reversed Array : "<<a<<endl;
}
