import java.util.Random;
class Square extends Thread {
	int x;
	int sqr;
	Square(int n) {
		x = n;
	}
	public void run() {
		sqr = x * x;
		
	}
}
class Cube extends Thread {
	int x;
	Cube(int n) {
		x = n;
	}
	public void run() {
		int cub = x * x * x;
		System.out.println("Cube of " + x + " = " + cub);
	}
}
class Number extends Thread {
	public void run() {
		Random random = new Random();
		for (int i = 0; i < 10; i++) {
			int ri = random.nextInt(100);
			System.out.println("Random Integer generated In Threads: " + ri);
			if(ri%2==0)
			{
			    System.out.println(" Random number Is: "+ ri + "  is even ");
			    Square s = new Square(ri);
		    	s.start();
		    	System.out.println("Square of Number" + ri + " = " + ri*ri);
			}
			else
			{
			    System.out.println(" Random number Is: "+ri+ "  is odd");
			    Cube c = new Cube(ri);
		    	c.start();
			}
			try {
				Thread.sleep(10);
			} catch (InterruptedException ex) {
				System.out.println(ex);
			}
		}
	}
}
public class B3    {
	public static void main(String args[]) {
		Number n = new Number();
		n.start();
	}
}
