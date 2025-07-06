#include<iostream>
using namespace std;
int main(){
    char name[10];
    cout<<"Enter name : ";
    cin>>name;
    cout<<"name is "<<name<<endl;
    /*it will fill 4 spaces of name yash ... rest of the spaces will be null character or will be zero and it will print characters upto null value ...
    whenever null value comes it will stop or terminate ... and if there are characters after null value ... it will not print those characters...*/
    cout<<"character on third position is "<<name[2]<<endl;

    /* now i am entering value after null value ... lets see if it will print or not..*/

    cout<<"Enter character at 6th position of array :";
    cin>>name[5];
    cout<<"It will Only print yash not v because of null value on 5th place in array"<<endl;
    cout<<name;

}

/*Output
Enter name : Yash
name is Yash
character on third position is s
Enter character at 6th position of array :V
It will Only print yash not v because of null value on 5th place in array
Yash
*/
