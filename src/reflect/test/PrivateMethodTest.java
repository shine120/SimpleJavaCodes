package reflect.test;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;


public class PrivateMethodTest
{

	/**
	 * @param args
	 * @throws InvocationTargetException 
	 * @throws IllegalAccessException 
	 * @throws IllegalArgumentException 
	 * @throws NoSuchFieldException 
	 * @throws SecurityException 
	 */
	public static void main(String[] args) throws ClassNotFoundException,NoSuchMethodException, IllegalArgumentException, IllegalAccessException, InvocationTargetException, SecurityException, NoSuchFieldException
	{
		Private p = new Private();
		Class<?> class1 = p.getClass();
		Class<?> class2 = Class.forName("reflect.test.Private");
		Class<?> class3 = Private.class;
		
		
		//调用方法使用 私有的方法
		Method method = class1.getDeclaredMethod("sayHello", new Class[]{String.class});
		method.setAccessible(true);
		String str = (String) method.invoke(p, new Object[]{"houjing"});
		System.out.println(str);
		
		
		//调用私有属性
		Field field = class2.getDeclaredField("name");
		field.setAccessible(true);
		field.set(p, "lisi");
		
		System.out.println(p.getName());
		
		
		
		
		

	}

}
