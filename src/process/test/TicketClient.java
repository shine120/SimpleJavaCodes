package process.test;

public class TicketClient
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		SaleTicket saleTicket = new SaleTicket();
		
		
		new Thread(saleTicket,"first").start();
		new Thread(saleTicket,"second").start();
		new Thread(saleTicket,"thrid").start();
	}

}
