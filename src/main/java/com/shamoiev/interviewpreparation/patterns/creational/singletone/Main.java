package com.shamoiev.interviewpreparation.patterns.creational.singletone;

public class Main {
    public static void main(String[] args) {
        ThreadFoo threadFoo = new ThreadFoo();
        ThreadBar threadBar = new ThreadBar();
        threadFoo.run();
        threadBar.run();
    }

    static class ThreadFoo implements Runnable {

        @Override
        public void run() {
            Singleton foo = Singleton.getInstance("Foo");
            System.out.println(foo.getValue());
        }
    }

    static class ThreadBar implements Runnable {

        @Override
        public void run() {
            Singleton bar = Singleton.getInstance("Bar");
            System.out.println(bar.getValue());
        }
    }

}
