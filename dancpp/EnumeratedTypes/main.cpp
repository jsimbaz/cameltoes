/* 
 * File:   main.cpp
 * Author: Daniel
 *
 * Created on 09 October 2012, 18:23
 
 *If you were to explicitely define an enumerator to a value, the next
 *default values would continue from this i.e.
 *
 *
 *          enum Color {
 *           COLOR_BLACK = -3,
 *           COLOR_BLUE, this would == -2
 *           COLOR_RED, this would == -1 (and so on
 *           COLOR_GINGER = 5,
 *           GINGER_PUBES this would == 6 as another explicit value has been assigned
 *          };
 *
 * Enumerated types would be useful would be good for returning error codes
 * from failed/passed functions etc.
 * 
 */
#include <cstdlib>
#include <iostream>

using namespace std;


int main(int argc, char** argv) {
    enum Color{
        //each type is assigned a default value starting 0++
       
        COLOR_BLACK, // 0
        COLOR_BLUE,  // 1
        COLOR_RED    // 2
    }; 
    
    //Declare a variable of enumerated type Color
    Color myColor = COLOR_RED; //2
    
    cout << myColor; //This should print the value 2 to the screen
    
    return 0;
}

