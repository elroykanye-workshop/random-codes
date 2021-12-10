package Pearl;
import java.util.Scanner;

public class Pearl{
  public static void main (String[]args)
  {
   Scanner sc= new Scanner (System.in);
   int N;
   int index=0;
   int max=0;
   System.out.println("please enter N values");
   System.out.println("press RETURN after each");
   N=sc.nextInt();
   
   int[]tab=new int[N];
  
  System.out.println("Enter elements of table");
  for(int i=0;i<N;i++)
  {
    tab[i]=sc.nextInt();
  }

  System.out.println("Show the table");
  
  for(int i=0;i<N;i++){
    System.out.print("["+tab[i]+"]");
  }
  
  max=tab[0];
  index=1;
  while(index<N)
  {
  if(tab[index]>max){
    max=tab[index];
    index++;
  }else{
    index++;
   }
  }
  System.out.println("The max value is:"+max);
 }
}