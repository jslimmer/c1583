/**   * A simple integer counter.  */ 
public class Counter {
  private int count;   
  /**   * Create new Counter, with    * count initialized to 0   */ 
  public Counter () {   count = 0;  }   /**   * Number of items counted     */  
  public int currentCount () {   return count; 
    /**                     * Increment the count by 1. */ 
    public void incrementCount(){ 
      count = count + 1;  
    }  /**  * Reset the count to 0.  */  
    public void reset () {  
      count = 0;   
    }  
  } // end of class Counter 