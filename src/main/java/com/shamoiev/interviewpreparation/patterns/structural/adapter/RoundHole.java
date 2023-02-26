package com.shamoiev.interviewpreparation.patterns.structural.adapter;

public class RoundHole {
    private final double radius;

    public RoundHole(double radius) {
        this.radius = radius;
    }

    public boolean fit(RoundPeg  roundPeg) {
        return this.radius >= roundPeg.getRadius();
    }
}
