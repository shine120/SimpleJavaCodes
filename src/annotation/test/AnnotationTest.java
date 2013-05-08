package annotation.test;

import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;






@Retention(RetentionPolicy.RUNTIME)
public @interface AnnotationTest
{
	String hello() default "shine";
	String world();
}
