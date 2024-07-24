package ru.job4j.di.tracker;

public class Main {
    public static void main(String[] args) {
        Context context = new Context();
        try {
            context.reg(Store.class);
            context.reg(ConsoleInput.class);
            context.reg(StartUI.class);
        } catch (Exception e) {
            e.printStackTrace();
        }
        StartUI ui = context.get(StartUI.class);
        for (int i = 0; i < 3; i++) {
            ui.add("Enter your name: ");

        }
        ui.print();
    }
}
