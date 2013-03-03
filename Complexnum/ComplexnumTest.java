public class ComplexnumTest{
  private ComplexNumber a;
  private ComplexNumber b;
  private ComplexNumber c;
  private ComplexNumber d;
  
  public ComplexnumTest(){
    this.init();
  }
  public static void main(String[]args){
    ComplexnumTest test= new ComplexnumTest();
    test.testInitialState();
      test.testAdd();
    test.testSub();
    test.testMul();
    test.testDiv();
    
    
  }
  private void init(){
    this.a = new ComplexNumber(2,3);
    this.b = new ComplexNumber(4,6);
    this.c = new ComplexNumber(-6,-5);
    this.d = new ComplexNumber(0,0);
  }
  
  public void testInitialState(){
    this.init();
    assert (this.a.getA() == 2);
    assert (this.a.getB() == 3);
    assert (this.b.getA() == 4);
    assert (this.b.getB() == 6);
    assert (this.c.getA() ==-6);
    assert (this.c.getB() ==-5);
    assert (this.d.getA() ==0);
    assert (this.d.getB() ==0);
    System.out.println("passed initial test!!");
      
  }
  public void testAdd(){
    this.init();
    this.a.add(this.b);
    assert(this.a.getA()==6);
    assert(this.a.getB()==9);
    this.c.add(this.d);
    assert(this.c.getA()==-6);
    assert(this.c.getB()==-5);
    System.out.println("passed add test!!");
  }
  public void testSub(){
    this.init();
    this.a.sub(this.b);
    assert(this.a.getA()==-2);
    assert(this.a.getB()==-3);
    this.c.sub(this.d);
    assert(this.c.getA()==-6);
    assert(this.c.getB()==-5);
    System.out.println("passed subtraction test!!");
  }
  public void testMul(){
    this.init();
    this.a.mul(this.b);
    assert(this.a.getA()==-10);
    assert(this.a.getB()==24);
    this.c.mul(this.d);
    assert(this.c.getA()==0);
    assert(this.c.getB()==0);
    System.out.println("passed multiplication test!!");
  }
  public void testDiv(){
    this.init();
    this.a.div(this.b);
    assert(this.a.getA()==0.5);
    assert(this.a.getB()==0);
    this.c.div(this.d);
    assert(this.c.getA()!=1);
    assert(this.c.getB()!=1);
    System.out.println("passed division test!!");
  }
  
}