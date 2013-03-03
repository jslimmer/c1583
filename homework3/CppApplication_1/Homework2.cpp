/* 
 * File:   Homework2.cpp
 * Author: jeremyslimmer
 *
 * Created on February 4, 2013, 5:37 PM
 */
#include <iostream>
#include <cstdlib>
#include <cmath>


using namespace std;
 


/*
 * 
 */
int main(int argc, char *argv[]) {
    int menuChoice=0;
    float area_circle=0;
    float diameter_circle=0;
    const float PI =  3.1415926535;
    float height_cylinder=0;
    float rectangle_height=0;
    float rectangle_width=0;
    float hexahedron_depth=0;
    
        
    
    
    cout<<"Welcome to Geometry'R'Us"<<endl<<"Please select one of the Following:"<<endl<<endl;
    cout<<"Circles and Cylinders: "<<endl;
    cout<<"Choose 1 for the Area of a Circle:"<<endl;
    cout<<"Choose 2 for the Circumference of a Circle:"<<endl;
    cout<<"Choose 3 for the Volume of a Cylinder:"<<endl<<endl;
    cout<<"Squares, Rectangles, and Hexahedrons:"<<endl;
    cout<<"Choose 4 for the Perimeter of a Square or Rectangle:"<<endl;
    cout<<"Choose 5 for the Area of a Square or Rectangle:"<<endl;
    cout<<"Choose 6 for the Volume of a Hexahedron:"<<endl;
    cin>>menuChoice;
    cout<<endl;
    cout<<endl;
            
            
        switch( menuChoice )
	{
                case 1:
                   cout<<"Please enter the diameter of the circle: "<<endl;
                   cin>>diameter_circle;
                   
                   area_circle = PI*((diameter_circle/2)*(diameter_circle/2));
                   cout<<"The area of the circle is: "<<area_circle<<endl;
    
                    break; 
                
                case 2: 
	   
                        break; 
	 
                case 3:
                        break; 
	
                case 4:
	   
                        break; 
	
                case 5 :
	   
                         break;
                
                case 6:
                        
                        break;
            
                default :
	   
                        break;
	

    
    return 0;
}
}
