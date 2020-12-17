SingleDigitTests.singleDigit1(5)/*
A whole bunch of methods for determining whether or not a number has 1 digit
*/

public class SingleDigitTests{
   public static boolean singleDigit1(int i){
      /*
      Checks if i is a single digit integer
      Inputs:
         int i: an integer
      Outputs: 
         return: true is i is single digit, false otherwise
      */
      if(i <= 9){
         if(i >= -9){
            return true;
         }
         else{
            return false;
         }
      }
      else{
         return false;
      }
   }
   
   public static boolean singleDigit2(int i){
      /*
      Checks if i is a single digit integer
      Inputs:
         int i: an integer
      Outputs: 
         return: true is i is single digit, false otherwise
      */
      if((-9 <= i) && (i <= 9)) return true;
      else return false;
   }
   
   
   public static void testSingleDigit1(){
      /*
      Tests whether singleDigit1 works as expected
      */
      
      StdOut.println("------------------------------");
      StdOut.println("Testing singleDigit1():");
      
      //Test 1.1
      Testing.testEquals("Test 1.1", singleDigit1(4), true);
      
      //Test 1.2
      Testing.testEquals("Test 1.2", singleDigit1(9), true);
      
      //Test 1.3
      Testing.testEquals("Test 1.3", singleDigit1(10), false);
      
      //Test 1.4
      Testing.testEquals("Test 1.4", singleDigit1(100), false);
      
      //Test 1.5
      Testing.testEquals("Test 1.5", singleDigit1(0), true);
      
      //Test 1.6
      Testing.testEquals("Test 1.6", singleDigit1(-5), true);
      
      //Test 1.7
      Testing.testEquals("Test 1.7", singleDigit1(-9), true);
      
      //Test 1.8
      Testing.testEquals("Test 1.8", singleDigit1(-10), false);
      
      //Test 1.9
      Testing.testEquals("Test 1.9", singleDigit1(-100), false);
      StdOut.println("------------------------------");
   }
   
   public static void testSingleDigit2(){
      /*
      Tests whether singleDigit1 works as expected
      */
      StdOut.println("------------------------------");
      StdOut.println("Testing singleDigit2():");
      
      //Test 2.1
      Testing.testEquals("Test 2.1", singleDigit2(4), true);
      
      //Test 2.2
      Testing.testEquals("Test 2.2", singleDigit2(9), true);
      
      //Test 2.3
      Testing.testEquals("Test 2.3", singleDigit2(10), false);
      
      //Test 2.4
      Testing.testEquals("Test 2.4", singleDigit2(100), false);
      
      //Test 2.5
      Testing.testEquals("Test 2.5", singleDigit2(0), true);
      
      //Test 2.6
      Testing.testEquals("Test 2.6", singleDigit2(-5), true);
      
      //Test 2.7
      Testing.testEquals("Test 2.7", singleDigit2(-9), true);
      
      //Test 2.8
      Testing.testEquals("Test 2.8", singleDigit2(-10), false);
      
      //Test 2.9
      Testing.testEquals("Test 2.9", singleDigit2(-100), false);
      StdOut.println("------------------------------");
      
   }
   
   public static void main(String[] args){
      testSingleDigit1();
      testSingleDigit2();
   }
      
   
}