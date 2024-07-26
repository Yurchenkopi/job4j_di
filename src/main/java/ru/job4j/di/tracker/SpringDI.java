package ru.job4j.di.tracker;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class SpringDI {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext();
        context.scan("ru.job4j.di.tracker");
        context.refresh();
        StartUI ui = context.getBean(StartUI.class);
        for (int i = 0; i < 3; i++) {
            ui.add("Enter your name: ");
        }
        System.out.println("UI bean print info:");
        ui.print();
        StartUI anotherUI = context.getBean(StartUI.class);
        System.out.println("Another UI bean print info:");
        anotherUI.print();
    }
}
