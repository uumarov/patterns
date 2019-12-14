package ru.geekbrains.observer;

import ru.geekbrains.observer.editor.Editor;
import ru.geekbrains.observer.listeners.EmailNotificationListener;
import ru.geekbrains.observer.listeners.LogOpenListener;

public class Main {
    public static void main(String[] args) {
        Editor editor = new Editor();
        editor.events.subscribe("open", new LogOpenListener("logfile.txt"));
        editor.events.subscribe("save", new EmailNotificationListener("admin@example.com"));

        try {
            editor.openFile("test.txt");
            editor.saveFile();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}