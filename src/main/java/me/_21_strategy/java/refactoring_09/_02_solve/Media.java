package me._21_strategy.java.refactoring_09._02_solve;

public enum Media {
    VIDEO {
        @Override
        public void play() {
            System.out.println("Video: play");
        }

        @Override
        public void loop() {
            System.out.println("Video: loop");
        }

        @Override
        public void stop() {
            System.out.println("Video: stop");
        }
    },
    MUSIC {
        @Override
        public void play() {
            System.out.println("Music: play");
        }

        @Override
        public void loop() {
            System.out.println("Music: loop");
        }

        @Override
        public void stop() {
            System.out.println("Music: stop");
        }
    },
    NULL {
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

    public abstract void play();
    public abstract void loop();
    public abstract void stop();
}
