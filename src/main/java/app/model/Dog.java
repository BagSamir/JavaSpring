package app.model;

import org.springframework.stereotype.Component;

@Component
public class Dog extends Animal{
    private String message;

    public Dog(String text) {
        this.message = text;
    }

    @Override
    public String toString() {
        return "Im a Cat";
    }

    @Override
    void say() {
        System.out.println(message);
    }
}
