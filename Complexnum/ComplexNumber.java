public class ComplexNumber {
  // The instance variables realaand brepresenting
  // the real parts of the complex number      
  private float a;      
  private float b;
  private float a1;
  private float b1;
  
  public ComplexNumber(float a, float b){            
   this.a= a;
   this.b= b;
   this.a1=a1;
   this.b1=b1;
  } 
  public float getA(){
    return this.a;
  }
  public float getB(){
    return this.b;
  }
    public void add(ComplexNumber otherNumber){          
    this.a= this.a + otherNumber.getA();           
    this.b= this.b + otherNumber.getB(); 
  }      
  public void sub(ComplexNumber otherNumber){
    this.a= this.a - otherNumber.getA();
    this.b= this.b - otherNumber.getB();
  }

  public void mul(ComplexNumber otherNumber){
    this.a1=this.a * otherNumber.getA() - this.b * otherNumber.getB();
    
    this.b1=this.b * otherNumber.getA() + this.a * otherNumber.getB();
    this.a=this.a1;
    this.b=this.b1;
  }
  
  public void div(ComplexNumber otherNumber){
   
    this.a1=((this.a*otherNumber.getA())+(this.b*otherNumber.getB()))/((otherNumber.getA()*otherNumber.getA())+(otherNumber.getB()*otherNumber.getB()));
    this.b1=((this.b*otherNumber.getA())-(this.a*otherNumber.getB()))/((otherNumber.getA()*otherNumber.getA())+(otherNumber.getB()*otherNumber.getB()));
    this.a=this.a1;
    this.b=this.b1;
  }
  public void print(){
    
    System.out.println (this.a + " + " +this.b+ "i");
  }
}