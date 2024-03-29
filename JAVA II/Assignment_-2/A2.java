class sleepThread extends Thread
{
      public sleepThread(String n)
      {
            super(n);
      }
      public void run()
      {
        for(int i=100;i>=1;i--)
        {
           try
           {
              Thread.sleep(6000);
              System.out.println(Thread.currentThread().getName()+":"+i);
              Thread.currentThread().setName("New Name"+i);
            //  System.out.println("CountDown : "+i);
               
           }
           catch(InterruptedException e)
           {
               e.printStackTrace();
           }
        }
       }
}
public class A2
{      
      public static void main(String args[])
      {
          sleepThread A2=new sleepThread("Original Name");
          A2.start();
      }
}
