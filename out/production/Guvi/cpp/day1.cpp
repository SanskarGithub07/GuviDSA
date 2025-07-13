// Namespace - Like a folder used to solve collision issues for different code files
// container used to group the identifiers like functions, variables etc under a name to avoid the name conflict 
// folder1 -> code1 
// folder2 -> code2

// Aliases in C++
// Another name for a type or namespaces 
// & is used for aliases

// How is a pointer different from an alias
// An alias refers to the same variable's value at the same memory location
// A pointer just points to the same memory location as the variable

// Alias
// int &x  = y; (Declaration and initialization on the same line always)

// Pointer
// int * x = &y;
// or 
// int * x;
// x = &y; (Declaration and initialization can be on different lines)

// Pass By Value - Normal value (Assignment)
// Pass By Reference - Use Alias
// Pass By Address - Pass the Pointer

#include<bits/stdc++.h>
using namespace std;

namespace Instagram{
    void post(){
        cout << "Posting on Instagram." << endl;
    }
}

namespace Twitter{
    void post(){
        cout << "Tweeting on twitter." << endl;
    }
}

int main(){
    cout << "Hello World." << endl;
    Instagram::post();
    Twitter::post(); // Use reference operator ::

    int x = 100;
    int &y = x; 
    int * z = &x;
    cout << *z << endl;

    cout << "Value of x equals: " << x << endl;
    cout << "Value of y equals: " << y << endl;
    
    x++;
    
    cout << "Value of x equals: " << x << endl;
    cout << "Value of y equals: " << y << endl;

    int m = 100;
    int n = m;

    cout << "Value of x equals: " << n << endl;
    cout << "Value of y equals: " << m << endl;
    
    n++;
    
    cout << "Value of x equals: " << n << endl;
    cout << "Value of y equals: " << m << endl;

    string name1 = "Java";
    string name2 = "C++";
    string &n1 = name1;
    string &n2 = name2;

    cout << n1 + " " + n2 << endl;

    return 0;
}
