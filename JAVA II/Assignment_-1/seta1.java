import java.util.ArrayList;
import java.util.Scanner;
class seta1
{
      public static void main(String[] args)
      {
            Scanner s=new Scanner(System.in);
            ArrayList<String> a=new ArrayList<String>();
            System.out.println("Enter the NO of Cities:");
            int n=s.nextInt();
            for(int i=0;i<n;i++)
            {
                System.out.println("Enter Cities Name:"+(i+1));
                String city=s.next();
                a.add(city);
            }
            System.out.println("The Cities List Are :");
            System.out.println(a);
            a.remove(1);
            System.out.println(a);
            a.clear();
            System.out.println("Cities List After Remove:");
            System.out.println(a);
           
           
            
      }
}
