package com.shamoiev.interviewpreparation.patterns.structural.adapter;

public class AdapterDemo {
    public static void main(String[] args) {
        RoundHole roundHole = new RoundHole(7);

        RoundPeg roundPeg = new RoundPeg(6);
        System.out.println(roundHole.fit(roundPeg));

        SquarePeg squarePeg = new SquarePeg(6);

        System.out.println(roundHole.fit(new SquarePegAdapter(squarePeg)));
    }
}
