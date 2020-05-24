public class q11
{
    public static void main(int marks)
    {
        if(marks>=85 && marks>100)
        {
            System.out.print("Excellent");
        }
        else if(marks>=75 && marks>84)
        {
           System.out.print("Distinction");
        } 
        else if(marks>=60 && marks>74)
        {
            System.out.print("first class");
        }
        else if(marks>=40 && marks>59)
        {
            System.out.print("pass");
        }
        else
        System.out.println("fail");
    } 
}