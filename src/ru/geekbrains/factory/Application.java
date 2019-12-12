package ru.geekbrains.factory;

import ru.geekbrains.factory.factory.PetFactory;
import ru.geekbrains.factory.pets.Pet;

public class Application {
    private Pet pet;

    public Application(PetFactory factory) {
        pet = factory.buyPet();
    }

    public void saySomething() {
        pet.saySomething();
    }
}
