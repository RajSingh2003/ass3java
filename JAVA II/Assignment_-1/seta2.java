import java.util.LinkedList;
import java.util.Scanner;
class seta2
{
      public static void main(String[] args)
      {
            Scanner s=new Scanner(System.in);
            LinkedList<String> a=new LinkedList<String>();
            System.out.println("Enter the NO of Friends:");
            int n=s.nextInt();
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter Friends Name:"+(i+1));
                String fri=s.next();
                a.add(fri);
            }
            System.out.println("The no Friends List Are:");
            for(String fri:a)
            {
                 System.out.println(fri);
            }
    
      }
}
