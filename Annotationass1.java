package AnnotationTast;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
@interface Test
{

}
class Annotationass1 {
@Test
public String testcase(){
 String s="Lakshmi";
 return s;
  }
  public static void main(String[] args)
  {
	Annotationass1 t = new Annotationass1();
    System.out.println(t.testcase());
    }

}
