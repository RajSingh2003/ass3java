import java.util.TreeSet;
import java.util.Scanner;
class setb1
{
      public static void main(String[] args)
      {
            Scanner s=new Scanner(System.in);
            TreeSet<Integer> a=new TreeSet<Integer>();
            System.out.println("Enter the NO of Integer:");
            int n=s.nextInt();
            System.out.println("Enter Integer No:");
            for(int i=0;i<n;i++)
            {
                int ax=s.nextInt();
                a.add(ax);
            }
            System.out.println("The Sorted Integer are");
            System.out.println(a);
           
      }
}
