package designpattern.proxy.test;

public class ProxySubject extends Subject
{
	private RealSubject realSubject;
	
	public ProxySubject()
	{
		realSubject = new RealSubject();
	}
	
	@Override
	public void request()
	{
		this.prePoxy();
		realSubject.request();
		this.postPoxy();
	}
	
	
	
	private void prePoxy()
	{
		System.out.println("Pre Request");
	}
	
	private void postPoxy()
	{
		System.out.println("Post Request");
	}

}
