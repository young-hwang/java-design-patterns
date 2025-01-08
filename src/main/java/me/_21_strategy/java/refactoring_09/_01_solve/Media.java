package me._21_strategy.java.refactoring_09._01_solve;

public abstract class Media {
    public abstract void play();
    public abstract void loop();
    public abstract void stop();
    public static final Media NULL = new Media() {

        @Override
        public void play() {
            System.out.println("Null: play");
        }

        @Override
        public void loop() {
            System.out.println("Null: loop");
        }

        @Override
        public void stop() {
            System.out.println("Null: stop");
        }
    };
}
