package ru.geekbrains.factory.factory;

import ru.geekbrains.factory.pets.Rat;
import ru.geekbrains.factory.pets.Pet;

public class RatFactory implements PetFactory {
    @Override
    public Pet buyPet() {
        return new Rat();
    }
}
