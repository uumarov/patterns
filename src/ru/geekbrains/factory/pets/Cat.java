package ru.geekbrains.factory.pets;

public class Cat implements Pet {
    @Override
    public void saySomething() {
        System.out.println("meow");
    }
}
