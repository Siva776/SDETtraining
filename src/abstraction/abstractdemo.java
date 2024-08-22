package abstraction;


	abstract class car{
		abstract void run();
	}
class honda extends car{
	public void run()
	{
		System.out.println("honda car is running");
	}
}
public class abstractdemo {
	public static void main(String[] args) {
		honda h = new honda();
		h.run();

	}
}
