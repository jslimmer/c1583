#include <iostream>
#include <stdlib.h>

using namespace std;

int main(int argc, char *argv[])
{
  const float Quarter = 0.25f;
  const float Dime = 0.10f;
  const float Nickel = 0.05f;
  const float Penny = 0.01f;
  int numQuarter = 0;
  int numDime = 0;
  int numNickel = 0;
  int numPenny = 0;
  float initAmt = 0.00f;

  cout << "Enter an amount of change between $0.00 and $0.99.  ";
  cin >> initAmt;
  
  if (initAmt >= 1.00 || initAmt < 0.00) {
    cout << "That number isn't between 0 and .99, please enter a new number.  ";
    cin >> initAmt;
    }
  
  while (initAmt > 0.00) {
    if (initAmt >= Quarter) {
        initAmt -= Quarter;
        numQuarter++;
    } else if (initAmt >= Dime) {
        initAmt -= Dime;
        numDime++;
    } else if (initAmt >= Nickel) {
        initAmt -= Nickel;
        numNickel++;
    } else if (initAmt > 0.00){
        initAmt -= Penny;
        numPenny++;
    }
  }
  
  cout << "The # of quarters needed is: " << numQuarter << '\n'
       << "The # of dimes needed is: " << numDime << '\n'
       << "The # of nickels needed is: " << numNickel << '\n'
       << "The # of pennies needed is: " << numPenny << '\n'
       << endl;
         
  
  return 0;
}
