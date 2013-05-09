package annotation.test;

@AnnotationTest(hello = "beijing", world = "shanghai")
public class MyAnnotation
{

	@AnnotationTest(hello = "beijing", world = "shanghai")
	@Deprecated
	public void output()
	{
		System.out.println("This is Output");

	}

}
