/** @author Rob Nebeker  */

public class Main {
   public static void main (String args[]) {
      int array[] = {20,20,40};
      int num1 = 15, num2 = 0;
      int result = 0;
      try {
         result = num1/num2;
         System.out.println("The result is " +result);
         
         for(int i = 2; i >= 0; i--) {
            System.out.println("The value  " +array[i]);
         }
      } catch (ArrayIndexOutOfBoundsException e) {
         System.out.println("Error out of Bound "+e);
      } catch (ArithmeticException e) {
         System.out.println ("Can't be divided by Zero "+e);
      }
   }
}
