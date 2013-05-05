package designpattern.dynamic.proxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Proxy;

public class Clinet
{

	/**
	 * @param args
	 */
	public static void main(String[] args)
	{
		RealSubject realSubject = new RealSubject();
		InvocationHandler handler = new DynamicSubject(realSubject);
		
		Class<?> classType = handler.getClass();
		
		Subject subject = (Subject)Proxy.newProxyInstance(classType.getClassLoader(),realSubject.getClass().getInterfaces() , handler);
		
		//System.out.println(subject.getClass());
		subject.request();
	}

}
