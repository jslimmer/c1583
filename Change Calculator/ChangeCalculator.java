// Jazonda Wesley
// February 6, 2013
// CSCI 1583-601
// Assignment 3

class ChangeCalculator{
  private int changeValue;
  private int numQuarters;
  private int numDimes;
  private int numNickels;
  private int numPennies;
  
  // Constructor
  public ChangeCalculator(int value){
    this.changeValue = value;
    this.numQuarters = -1;
    this.numDimes = -1;
    this.numNickels = -1;
    this.numPennies = -1;
  }
  
  // Queries to retrieve instance variable values
  public int getNumQuarters(){
    return this.numQuarters;
  }
  
  public int getNumDimes(){
    return this.numDimes;
  }
  
  public int getNumNickels(){
    return this.numNickels;
  }
  
  public int getNumPennies(){
    return this.numPennies;
  }
  
  public void calculateChange(){
    while (this.changeValue >= 25){
      this.changeValue = (this.changeValue - 25);
      ++this.numQuarters;
    }
    
    while (this.changeValue >= 10){
      this.changeValue = (this.changeValue - 10);
      ++this.numDimes;
    }
    
    while (this.changeValue >= 5){
      this.changeValue = (this.changeValue - 5);
      ++this.numNickels;
    }
    
    while (this.changeValue >= 1){
      this.changeValue = (this.changeValue - 1);
      ++this.numPennies;
    }
    
    System.out.println("Number of quarters:" + this.numQuarters);
    System.out.println("Number of dimes:" + this.numDimes);
    System.out.println("Number of nickels:" + this.numNickels);
    System.out.println("Number of pennies:" + this.numPennies);
  }
}