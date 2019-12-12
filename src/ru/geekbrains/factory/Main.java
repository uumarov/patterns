package ru.geekbrains.factory;

import ru.geekbrains.factory.factory.RatFactory;
import ru.geekbrains.factory.factory.CatFactory;
import ru.geekbrains.factory.factory.DogFactory;

public class Main {
    private static Application appConfig() {
        Application application;
        String petName = "rat";

        switch (petName) {
            case "dog":
                application = new Application(new DogFactory());
                break;
            case "rat":
                application = new Application(new RatFactory());
                break;
            case "cat":
                application = new Application(new CatFactory());
                break;
            default:
                throw new RuntimeException("Unknown pet: " + petName);
        }
        return application;
    }

    public static void main(String[] args) {
        Application app = appConfig();
        app.saySomething();
    }
}
