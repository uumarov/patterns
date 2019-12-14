package ru.geekbrains.factory.factory;

import ru.geekbrains.factory.pets.Dog;
import ru.geekbrains.factory.pets.Pet;

public class DogFactory implements PetFactory {
    @Override
    public Pet buyPet() {
        return new Dog();
    }
}
