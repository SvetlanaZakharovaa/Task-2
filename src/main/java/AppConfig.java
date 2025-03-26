import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
 class AppConfig {
    @Bean
    @Scope("singleton") // Можно изменить scope при необходимости
    public HelloWorld helloWorld() {
        return new HelloWorld("Hello, World!");
    }
    @Bean
    @Scope ("prototype")
    public Cat cat(){
        return new Cat("Whishkers");
    }
}


