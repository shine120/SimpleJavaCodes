package comparable.test.homework;

public class Dog implements Comparable<Dog>
{
	private String name;

	public Dog(String name)
	{
		this.name = name;
	}

	@Override
	public int compareTo(Dog d)
	{
		System.out.println("Current Dog is " + this.name.toString());
		System.out.println("Compare Dog id " + d.name.toString());
		System.out.println("------------------------------------");
		return this.name.compareTo(d.name);
	}
}
