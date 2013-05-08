package comparable.test.homework;

import java.util.Arrays;

public class Client
{
	public static void main(String[] args)
	{
		Dog[] dogs = { new Dog("Jack"), new Dog("Tom"), new Dog("yami") };

		Arrays.sort(dogs);
		
		
		Arrays.toString(dogs);
		
	}
}
