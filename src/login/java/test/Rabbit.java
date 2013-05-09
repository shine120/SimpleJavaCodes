package login.java.test;

public class Rabbit
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		for (int i = 1; i < 24; i++)
		{
			System.out.println(i + " mouth,Rabbit Numbers is "
					+ new Rabbit().getRabbitNumber(i));
		}

	}

	public int getRabbitNumber(int mouth)
	{
		// int loopNumber = mouth / 3;
		int loopNumber = mouth;
		int m1 = 1;
		int m2 = 2;
		int sum = 0;

		if (loopNumber < 2)
		{
			return 1;
		}

		else if (loopNumber < 3)
		{
			return 2;
		}

		else
		{
			for (int i = 2; i < loopNumber; i++)
			{
				sum = m1 + m2;
				m1 = m2;
				m2 = sum;
			}
		}

		return sum;

	}
}
