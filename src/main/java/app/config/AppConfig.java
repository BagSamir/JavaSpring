package app.config;

import app.model.Animal;
import app.model.Cat;
import app.model.Dog;
import app.model.Timer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "app")
public class AppConfig {

    @Bean("cat")
    public Animal getCat() {
        return new Cat("meow-meow");
    }

    @Bean("dog")
    public Animal getDog() {
        return new Dog("gav-gav");
    }

    @Bean("timer")
    public Timer getTimer() {
        return new Timer();
    }
}
