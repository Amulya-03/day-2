public class SimpleInterestCalculator{
   public static void calculatorSimpleInterest(double principle, double rate, double time){
   System.out.println((principle * rate * time)/100);
   }
     public static void main(String [] args){
     calculatorSimpleInterest(1000.0, 5.0, 2.0);
   }
}