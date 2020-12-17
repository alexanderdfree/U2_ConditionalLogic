public class FiniteSort{
   public static void main(){ 
   
   
   }
   public static String sort3(int a, int b, int c){
      /*Given 3 integer values, return a String with the values
        sorted in ascending order of value
        Inputs:
           int a: 1st integer
           int b: 2nd integer
           int c: 3rd integer
        Output:
           return: a String with the values sorted in ascending
                   order
   
        Examples:
           sort3(4, 2, 7) -> "2, 4, 7"
           sort3(-1, 0, -5) -> "-5, -1, 0"
           sort3(5, 0, 0) -> "0, 0, 5"
           sort3(1, 2, 3) -> "1, 2, 3"
      */
      if(a < b){
         if(b < c){
            return a+", "+b+", "+c;
         }
         else if(a < c){
            return a+", "+c+", "+b;
         }
         else{
            return c+", "+a+", "+b;
         }
      }
      else if(c < a){
         return b+", "+c+", "+a;
      }
      else{
         if(c > b){
            return b+", "+a+", "+c;
         }
         else{
            return c+", "+b+", "+a;
         }
      }}
   public static void main(String args[]){
   /*Tests whether sort3() works properly*/

   StdOut.println("----------------------- -------");
   StdOut.println("Testing sort3():");
      
   //Test 1.1
   Testing.testEquals("Test 1.1", sort3(1, 1, 1), "1, 1, 1");
   Testing.testEquals("Test 1.2", sort3(1, 2, 3), "1, 2, 3");
   Testing.testEquals("Test 1.3", sort3(3, 2, 1), "1, 2, 3");
   Testing.testEquals("Test 1.4", sort3(1, 2, 1), "1, 1, 2");
   Testing.testEquals("Test 1.5", sort3(2, 1, 2), "1, 2, 2");
   Testing.testEquals("Test 1.5", sort3(2, 1, 2), "1, 2, 2");
   Testing.testEquals("Test 1.6", sort3(2, 2, 1), "1, 2, 2");
   Testing.testEquals("Test 1.7", sort3(1, 2, 2), "1, 2, 2");
   Testing.testEquals("Test 1.8", sort3(3, 1, 2), "1, 2, 3");
   Testing.testEquals("Test 1.9", sort3(2, 1, 3), "1, 2, 3");
   //keep going...
}
   

      
}