public class  Q8ii
{
   public static void main(String args[]) 
   {
      String str = new String("Computer");
      for(int i=1; i<str.length(); i++) 
      {
         if(str.charAt(i) == 's' ) 
         {
            System.out.println("Given string contains "+str.charAt(i));
         }
      }
   }
}