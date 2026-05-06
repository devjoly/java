public class Calculator {
    public void sum(double a,double b){
        System.out.println("Sum:"+(a+b));
  
  }
  public void subtract(double a,double b)
  {

System.out.println("Difference:"+(a-b)}

public void multiply(double a,double b){
    System.out.println("product;"+(a*b));
}
public void divide(double a,double b){
    if(b==0){
        System.out.println("Cannot divide by zore:");
    }else{
        System.out.println("Quotient:"+(a/b));
    }
    }
}
publie class Main{
    public static void main(String[]args){
        Calculator calc=new Calculator();
        calc.sum(5,2);
        calc.subtract(5,2, 0);
        calc.multiply(5,2, 0);
        calc.divide(5,2, 0);
    }
}