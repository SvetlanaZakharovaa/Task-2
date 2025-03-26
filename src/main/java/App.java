import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App {
    public static void main(String[] args) {
        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);

        // Получаем бин HelloWorld и выводим его сообщение
        HelloWorld helloWorld = (HelloWorld) context.getBean("helloWorld");
        HelloWorld helloWorld2 = (HelloWorld) context.getBean("helloWorld");
        HelloWorld helloWorld3 = (HelloWorld) context.getBean("helloWorld");
        System.out.println("Сравнение HelloWorld: " + (helloWorld2 ==  helloWorld3));

        System.out.println(helloWorld.getMessage());

        // Получаем бин Cat два раза
        Cat cat1 = (Cat) context.getBean("cat");
        Cat cat2 = (Cat) context.getBean("cat");

        System.out.println("Имя первого кота: " + cat1.getName());
        System.out.println("Имя второго кота: " + cat2.getName());
        System.out.println("Сравнение Cat: " + (cat1 == cat2)); // Должно быть false
    }
}
