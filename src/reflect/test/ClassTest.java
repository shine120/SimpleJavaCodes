package reflect.test;

public class ClassTest
{

	/**
	 * @param args
	 * @throws ClassNotFoundException 
	 */
	public static void main(String[] args) throws ClassNotFoundException 
	{
		Class<?> classType = Child.class;
		System.out.println(classType);
		classType = classType.getSuperclass();
		System.out.println(classType);
		classType = classType.getSuperclass();
		System.out.println(classType);
		classType = classType.getSuperclass();
		System.out.println(classType);
		System.out.println("--------------------------");
		
		Class<?> classType2 = Class.forName("reflect.test.Parent");
		System.out.println(classType2);
		
		
		
		
	}

}

class Parent
{

}

class Child extends Parent
{

}