package comparable.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

public class Client
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		Person p1 = new Person();
		p1.setSid(12);
		Person p2 = new Person();
		p2.setSid(9);
		Person p3 = new Person();
		p3.setSid(19);
		
		ArrayList<Person> arrays = new ArrayList<Person>();
		arrays.add(p1);
		arrays.add(p2);
		arrays.add(p3);
		
		
		
		
		
		for(int i = 0 ; i< arrays.size(); i++)
		{
			System.out.println(arrays.get(i).getSid());
		}
		
		Collections.sort(arrays);
		
		
		for(int i = 0 ; i< arrays.size(); i++)
		{
			System.out.println(arrays.get(i).getSid());
		}
		
	}

}
