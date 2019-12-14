package ru.geekbrains.factory.factory;

import ru.geekbrains.factory.pets.Cat;
import ru.geekbrains.factory.pets.Pet;

public class CatFactory implements PetFactory {
    @Override
    public Pet buyPet() {
        return new Cat();
    }
}
