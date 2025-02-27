package ru.job4j.di.tracker;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
@AllArgsConstructor
public class StartUI {

    private Store store;
    private ConsoleInput consoleInput;

    public void add(String value) {
        store.add(consoleInput.askStr(value));
    }

    public void print() {
        for (String value : store.getAll()) {
            System.out.println(value);
        }
    }
}
