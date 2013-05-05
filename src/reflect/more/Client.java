package reflect.more;

public class Client
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{

		ProxySubject proxySubject = new ProxySubject();
		Subject subject = (Subject) proxySubject.init(new RealSubject());
		subject.hi();
	}

}
