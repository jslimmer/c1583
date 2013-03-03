
class ChangeCalculator {

    private int numQuarters;
    private int numDimes;
    private int numNickels;
    private int numPennies;
    private int total; //the value of the change qiven by the user
    //Constructor
// this intitlizes variables and calls calcChange function
    public ChangeCalculator(int value) {
        this.total = value;
        this.numQuarters = 0;
        this.numDimes = 0;
        this.numNickels = 0;
        this.numPennies = 0;
        this.calcChange();
    }

    public int getNumQuarters() {
        return this.numQuarters;
// this returns the number of quarters
    }

    public int getNumDimes() {
        return this.numDimes;
// this returns the number of Dimes to the main
    }

    public int getNumNickels() {
        return this.numNickels;
        //this returns the  nickels
    }

    public int getNumPennies() {
        return this.numPennies;
        //this returns the pennies to the main.
    }

    private void calcChange() {
        //change calculator using while loops to decrement total
        while (total >= 25) {

            total = total - 25;
            ++numQuarters;
        }
   
        while (total >= 10) {

            total = total - 10;
            ++numDimes;

        }
   
        while (total >= 5) {

            total = total - 5;
            ++numNickels;
        }
    
        while (total >= 1) {
            total = total - 1;
            ++numPennies;
        }
    }

    public void calculateChange() {
        calcChange();
    }
}
