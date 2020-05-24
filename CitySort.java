class CitySort
{
public static void main (String args[]) throws IOException
{
    int n,len,len1,c,i,j,k=0,m=0;
     String str[]=new String[5] ;
   String s1;
  String s2,temp;
     for (i=0;i<5;i++)
   {
    str[i]= br.readLine();
  }
 
  for(i=0;i<5;i++)
  {

     for(j=i+1;j<5;j++)
  {
  if(str[j].compareTo(str[i])<0)
  {
    temp=str[i];
    str[i]=str[j];
    str[j]=temp;
   }
     }
  System.out.println(str[i]);
    }
}
}