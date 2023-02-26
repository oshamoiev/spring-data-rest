package com.shamoiev.interviewpreparation.patterns.creational.prototype;

import java.util.Objects;

public abstract class Shape {
    private int x;
    private int y;
    private String color;

    public Shape() {
    }

    public Shape(Shape target) {
        if (target != null) {
            this.x = target.x;
            this.y = target.y;
            this.color = target.color;
        }
    }

    public abstract Shape clone();

    @Override
    public boolean equals(Object obj) {
        if (!(obj instanceof Shape shape)) {
            return false;
        }

        return shape.x == x && shape.y == y && Objects.equals(shape.color, color);
    }
}
