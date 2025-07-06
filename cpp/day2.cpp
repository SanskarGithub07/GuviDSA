// auto datatype along with other data types
#include<bits/stdc++.h>
using namespace std;

int main(){
    int age = 25;
    float price = 99.99f;
    double pi = 3.1459;
    char grade = 'F';
    bool isPassed = false;
    string name = "Virat";

    cout << age << " " << sizeof(age) << endl;
    cout << price << " " << sizeof(price) << endl;
    cout << grade <<  " " << sizeof(grade) << endl;
    cout << pi << " " << sizeof(pi) << endl;
    cout << isPassed << " " << sizeof(isPassed) << endl;
    cout << name << " " << sizeof(name) << endl;

    //Type inference (Auto) // Introduced in CPP 11 version
    auto x = 100; // Automatically it will take the associated data type
    cout << "type of x = " << typeid(x).name() << endl;
    auto y = 3.14;
}

