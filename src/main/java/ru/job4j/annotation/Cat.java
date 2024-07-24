package ru.job4j.annotation;

import org.springframework.stereotype.Component;
@Component
public class Cat implements Pet<Cat> {
    private String name = "Cat";

    @Override
    public String print() {
        return "Cat name = %s".formatted(name);
    }
}
