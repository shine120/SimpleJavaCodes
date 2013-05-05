package reflect.more;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ProxySubject implements InvocationHandler
{

	private Object obj;

	public Object init(Object obj)
	{
		this.obj = obj;
		Class<?> classType = obj.getClass();
		return Proxy.newProxyInstance(classType.getClassLoader(),
				classType.getInterfaces(), this);
	}

	@Override
	public Object invoke(Object proxy, Method method, Object[] args)
			throws Throwable
	{
		method.invoke(this.obj, args);
		return null;
	}

}
