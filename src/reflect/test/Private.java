package reflect.test;

public class Private
{

	/**
	 * @param args
	 */
	private String sayHello(String name)
	{
		return "Hello " + name + "NI hao";
	}
	
	
	
	private String name = "zhangsan";
	public String getName()
	{
		return name;
	}
	

}
