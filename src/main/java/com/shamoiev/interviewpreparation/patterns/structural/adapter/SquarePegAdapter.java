package com.shamoiev.interviewpreparation.patterns.structural.adapter;

public class SquarePegAdapter extends RoundPeg {
    public SquarePegAdapter(SquarePeg squarePeg) {
        super(calculateRadius(squarePeg));
    }

    public static double calculateRadius(SquarePeg squarePeg) {
        return Math.sqrt(Math.pow(squarePeg.getLength() / 2, 2) * 2);
    }
}
