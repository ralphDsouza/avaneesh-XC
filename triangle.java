public class triangle
{
    public static void main(String args[])
    {
        int n,num=1;
        for(int i=1;i<=4;i++)
        {
            for(int j=1;j<=i;j++)
            {
                System.out.print(num+"");
                num++;
            }
            System.out.println();
        }
    }
}