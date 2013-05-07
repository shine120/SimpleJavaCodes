package process.test;

public class Client
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		new SayHello().start();
		new Thread(new SayHelloRunable()).start();
		for (int i = 0; i < 10; i++)
		{
			System.out.println(i);
		}

		// System.out.println("__________________________________");

	}
}
