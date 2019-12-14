package ru.geekbrains.factory.pets;

public class Dog implements Pet {
    @Override
    public void saySomething() {
        System.out.println("woof woof");
    }
}
