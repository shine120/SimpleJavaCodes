package designpattern.proxy.test;

public class MainTest
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Subject proxySubject = new ProxySubject();
		proxySubject.request();
	}

}
