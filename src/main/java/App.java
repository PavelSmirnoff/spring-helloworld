import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext applicationContext =
                new AnnotationConfigApplicationContext(AppConfig.class);
        HelloWorld bean =
                (HelloWorld) applicationContext.getBean("helloworld");
        System.out.println(bean.getMessage());
        System.out.println(bean.getMessage());

        Cat cat = (Cat) applicationContext.getBean("cat");
        System.out.println(cat.getName());
        System.out.println(cat.getName());

        HelloWorld bean1 = (HelloWorld) applicationContext.getBean("helloworld");
        Cat cat1 = (Cat) applicationContext.getBean("cat");
        System.out.println(bean.equals(bean1));
        System.out.println(cat.equals(cat1));
    }
}