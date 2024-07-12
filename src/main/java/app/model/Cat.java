package app.model;

import org.springframework.stereotype.Component;

@Component
public class Cat extends Animal {
    private String message;

    public Cat(String text) {
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
