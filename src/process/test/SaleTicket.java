package process.test;

public class SaleTicket implements Runnable
{

	private int ticket = 10;
	
	@Override
	public synchronized void run()
	{
		for (int i = 0; i < 20; i++)
		{
			if (ticket > 0)
			{
				try
				{
					Thread.sleep(500);
				}
				catch (InterruptedException e)
				{
					e.printStackTrace();
				}

				ticket--;
				System.out.println(Thread.currentThread().getName() + "正在卖票"
						+ this.ticket);
			}
		}

	}

}
