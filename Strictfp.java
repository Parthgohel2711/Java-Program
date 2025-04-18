// class defined with strictfp keyword
strictfp class Calculator {
   public double addition(double num1, double num2) {
      return num1 + num2;
   }
}
// Main class
public class Strictfp {
   public static void main(String[] args) {
      // creating instance
      Calculator calc = new Calculator();
      // method call
      System.out.println(calc.addition(5e+10, 6e+11));
   }
}