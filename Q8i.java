public class Q8i
{
   public static void main(String args[]) 
   {
      String str = new String("Computer");
      for(int i=1; i<str.length(); i++) {
         if(str.charAt(i) == 'a'|| str.charAt(i) == 'e'|| str.charAt(i) == 'i' || str.charAt(i) == 'o' || str.charAt(i) == 'u') 
         {
            System.out.println("Given string contains "+str.charAt(i));
         }
      }
   }
}