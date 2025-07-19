#include<bits/stdc++.h>
using namespace std;

// in cpp a variable is by default private in C++
class A{
    public:
        int a;

    private:
        int b;

    public:
        A(int val1, int val2){
            this->a = val1;
            this->b = val2;
        }
        void display(){
            cout << "A class display method." << endl;
        }

};

class MyClass{
    public:
        void show();
};

void MyClass :: show(){
    cout << "Show implemented outside class." << endl;
    return;
}

// In cpp classes are terminated using semi colon

int main(){
    // cout << "Hello World" << endl;
    // A * a = new A(2, 3);
    // a->display();
    MyClass m;
    m.show();
    return 0;
}

// Scope resolution operator ::
// used to define the member function outside the class body

// ref_type classname::function_name{

// }

//Setter getter everything remains same in CPP