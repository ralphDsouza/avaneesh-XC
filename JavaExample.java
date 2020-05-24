public class JavaExample
{
    public static void main(int marks)
    {
    	int name=Avaneesh;
    	int roll =10;
    	System.out.println( name"/n"roll"/n"marks"/n");
        if(marks>=90)
        {
            System.out.print("Science with computer");
        }
        else if(marks>=80 && marks>89)
        {
           System.out.print("Science");
        } 
        else if(marks>=70 && marks>79)
        {
            System.out.print("commercee with maths");
        }
        else if(marks>=60 && marks>690)
        {
            System.out.print("Commerce");
        }
        else
        System.out.println("invalid");
    }
}