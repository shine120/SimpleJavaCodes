package annotation.test;

import java.lang.reflect.Method;

public class MyReflection
{
	public static void main(String[] args) throws SecurityException,
			NoSuchMethodException
	{
		MyAnnotation annotation = new MyAnnotation();
		Class<MyAnnotation> classType = (Class<MyAnnotation>) annotation
				.getClass();
		Method method = classType.getMethod("output", new Class[] {});
	}
}
