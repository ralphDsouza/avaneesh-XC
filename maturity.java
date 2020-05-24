public class maturity
{
      public static void main(char ch,double p,double r,int n,double mp,double rd_rate,int time_in_months)
      {
        {
        switch(ch)
        {
        case'A':
        double amt=p * Math.pow(1+r/100,n);
        System.out.println("amount="+amt);
        break;
        case'B':
        double b=mp*time_in_months*(mp*time_in_months*(time_in_months+1)/2.0)*(rd_rate/100.0)*(1/12.0);
        System.out.println("maturity amount"+ b);
        break;
        default: System.out.println("invalid");
        break;
      }
     }
} 
}     