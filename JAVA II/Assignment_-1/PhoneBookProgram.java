import java.io.*;
import java.util.*; 

public class PhoneBookProgram 
{
    public static void main(String[] args)throws IOException
     {
      
        Scanner scanner = new Scanner(System.in);
        Hashtable<String, String> a = new Hashtable<>();

        System.out.print("Enter File Name: ");
        String k = scanner.next();
        File f=new File(k);

        // Input a name or phone number
       
        FileReader fr=new FileReader(f);
        BufferedReader br=new BufferedReader(fr);
        String line;
        String[] pt;
        
   
            while ((line = br.readLine()) != null) 
            {
                // Split the line into fields using tabs
                pt = line.split(" ");

                if (pt.length == 2) {
                    String pn = pt[0].trim();
                    String nm = pt[1].trim();
                    a.put(pn,nm);
                }
            }
         System.out.println("Students Details");
         for(String p:a.keySet())
         {
            System.out.println("Mobile: "+p+ "Name:"+a.get(p));
          }  
         System.out.println("Enter Phone No Search:");   
         String l=scanner.next();
         if(a.containsKey(l))
            System.out.println("Found :"+a.get(l));
        else
               System.out.println("Not Found :"+a.get(l));
        
    }

}
