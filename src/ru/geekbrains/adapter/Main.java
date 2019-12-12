package ru.geekbrains.adapter;

public class Main {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(10);
        RoundPeg roundPeg = new RoundPeg(10);
        if (roundHole.fits(roundPeg)) {
            System.out.println("Круглый колышек с радиусом 10 помещается в круглое отверствие с радиусом 10");
        }

        SquarePeg smallSquarePeg = new SquarePeg(5);
        SquarePeg largeSquarePeg = new SquarePeg(35);
        //roundHole.fits(smallSquarePeg);

        SquarePegAdapter smallSquarePegAdapter = new SquarePegAdapter(smallSquarePeg);
        SquarePegAdapter largeSquarePegAdapter = new SquarePegAdapter(largeSquarePeg);
        if (roundHole.fits(smallSquarePegAdapter)) {
            System.out.println("Квадратный колышек с шириной 5 помещается в круглое отверстие с радиусом 10");
        }
        if (!roundHole.fits(largeSquarePegAdapter)) {
            System.out.println("Квадратный колышек с шириной 35 не помещается в круглое отверстие с радиусом 10");
        }
    }
}
