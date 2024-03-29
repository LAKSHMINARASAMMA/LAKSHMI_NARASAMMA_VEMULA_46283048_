package AnnotationTast;
import java.lang.annotation.ElementType;
import java.lang.annotation.Annotation;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
@Target(ElementType.TYPE)
@Retention(RetentionPolicy.RUNTIME)

@interface Info
{
    int AuthorID();
    //String AuthorName(); //default = "optional";
   // String Supervisor();// default= "optional";
    String Date();
    String Time();
    int Version();
    //String Description();//default "optional";
}
@Info(AuthorID=23,Date="15 Dec 2022",Time="9",Version=2)
 class Developer1 {
    Developer1() {
        System.out.println("data\n");
    }
}
public class Developer{
    public static void main(String[] args) {
    	
        Developer1 developer = new Developer1();
        
        Class c1=developer.getClass();
        Annotation a=c1.getAnnotation(Info.class);
        Info info=(Info)a;
        System.out.println(info.AuthorID()+"\n");
        System.out.println(info.Date()+"\n");
        System.out.println(info.Time()+"\n");
        System.out.println(info.Version());

    }
}

