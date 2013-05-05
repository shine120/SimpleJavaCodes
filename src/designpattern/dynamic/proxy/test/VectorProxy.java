package designpattern.dynamic.proxy.test;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.List;
import java.util.Vector;

public class VectorProxy implements InvocationHandler
{
	
	private Object ProxyObj;

	public VectorProxy(Object obj)
	{
		ProxyObj = obj;
	}
	
	public static Object factory(Object obj)
	{
		Class<?> classType = obj.getClass();
		
		return Proxy.newProxyInstance(classType.getClassLoader(),classType.getInterfaces(), new VectorProxy(obj));
		
	}
	
	
	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		
		if( null != args)
		{
			for(Object obj : args)
			{
				System.out.println(obj);
			}
		}
		
		Object object = method.invoke(ProxyObj, args);
		System.out.println(proxy.getClass());
		
		return object;
	}
	
	
	public static void main(String[] args)
	{
		List v = (List)factory(new Vector());
		v.add("new");
		v.add("e");
		v.remove(0);
	}

}
