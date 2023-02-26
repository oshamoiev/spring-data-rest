package com.shamoiev.interviewpreparation.patterns.creational.prototype;

public class Circle extends Shape {
    private int radius;

    public Circle() {
    }

    public Circle(Circle target) {
        super(target);
        if (target != null) {
            radius = target.radius;
        }
    }

    @Override
    public Shape clone() {
        return new Circle(this);
    }

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Circle shape) || !super.equals(obj)) return false;
        return shape.radius == radius;
    }
}
