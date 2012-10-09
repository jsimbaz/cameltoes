/* 
 * File:   main.cpp
 * Author: Daniel
 *
 * Created on 09 October 2012, 17:47
 */

#include <cstdlib>
#include <iostream>

using namespace std;

/*
 * 
 */
int main(int argc, char** argv) {
    cout << "bool\t\t" << sizeof(bool) << "bytes" <<endl;
    cout << "char\t\t" << sizeof(char) << "bytes" <<endl;
    cout << "wchar\t\t" << sizeof(wchar_t) << "bytes" <<endl;
    cout << "short\t\t" << sizeof(short) << "bytes" <<endl;
    cout << "int\t\t" << sizeof(int) << "bytes" <<endl;
    cout << "long\t\t" << sizeof(long) << "bytes" <<endl;
    cout << "float\t\t" << sizeof(float) << "bytes" <<endl;
    cout << "double\t\t" << sizeof(double) << "bytes" <<endl;
    cout << "long double\t\t" << sizeof(long double) << "bytes" <<endl;
    
    //interesting heirarchy
    
    cout << 5u - 10;
    
    return EXIT_SUCCESS;
}

