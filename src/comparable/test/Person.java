package comparable.test;

public class Person implements Comparable<Person>
{

	
	private int sId;
	private String name;
	
	public String getName()
	{
		return name;
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public int getSid()
	{
		return sId;
	}

	public void setSid(int sid)
	{
		sId = sid;
	}
	
	
	
	public int compareTo(Person p)
	{
		return p.sId - this.sId;
	}
	
	
	
	
}
