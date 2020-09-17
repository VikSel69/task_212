import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld firstBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        HelloWorld secondBean =
                (HelloWorld) applicationContext.getBean("helloworld");
        Cat firstBeanCat =
                (Cat) applicationContext.getBean("cat");
        Cat secondBeanCat =
                (Cat) applicationContext.getBean("cat");
        System.out.println(firstBean == secondBean);
        System.out.println(firstBeanCat == secondBeanCat);
    }
}