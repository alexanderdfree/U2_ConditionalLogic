public class SingleDigit{
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
      }}
   
   public static boolean singleDigit2(int i){
      if((-9 <= i) && (i <= 9)) return true;
      else return false;
   }
public static boolean singleDigit3(int i){
      if(!(i > 9) && !(i < -9)) return true;
      else return false;
   }
   public static boolean singleDigit4(int i){
      if(!((i >9) || (i < -9))) return true;
      else return false;
   }
   public static boolean singleDigit5(int i){
      boolean toReturn = true;
      if(i < -9){
         toReturn = false;
      }
      if(i > 9){
         toReturn = false;
      }
      return toReturn;


   }
   public static boolean singleDigit6(int i){
      boolean toReturn = false;
      if(i > -10){
         if(i < 10){
            toReturn = true;
         }
      }
      return toReturn;
   }

   }
