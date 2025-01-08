package me._21_strategy.java.refactoring_09._01_solve;

public class Player {
    private Media media = Media.NULL;

    public void play() {
        media.play();
    }

    public void loop() {
        media.loop();
    }

    public void stop() {
        media.stop();
    }

    public void setMedia(Media media) {
        if (media == null) {
            media = Media.NULL;
        } else {
            this.media = media;
        }
    }
}
