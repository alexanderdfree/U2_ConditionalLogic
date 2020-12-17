public class UnitTesting {
   
   public static boolean ordered(int a, int b, int c){
/* Returns true if a, b, and c are ordered smallest to
   largest, or largest to smallest

   Examples:
   ordered(1, 2, 3) -> true
   ordered(4, 2, 1) -> true
   ordered(2, 4, 1) -> false
   ordered(1, 1, 10) -> true*/
   if (a > b && b > c) return true;
   if (a < b && b < c) return true;
   if (a == b || b == c) return true;
   else return false;
   





}
public static void main(String args[]){
   /*Tests whether ordered() works properly*/

   StdOut.println("------------------------------");
   StdOut.println("Testing ordered():");
      
   //Test 1.1
   Testing.testEquals("Test 1.1", ordered(1, 1, 1), true);
   Testing.testEquals("Test 1.2", ordered(1, 2, 2), true);
   Testing.testEquals("Test 1.3", ordered(2, 2, 1), true);
   Testing.testEquals("Test 1.4", ordered(2, 1, 2), false);
   Testing.testEquals("Test 1.5", ordered(3, 2, 1), true);
   Testing.testEquals("Test 1.6", ordered(1, 2, 3), true);
   Testing.testEquals("Test 1.7", ordered(2, 1, 3), false);
   Testing.testEquals("Test 1.8", ordered(3, 1, 2), false);
   //keep going...
}

}