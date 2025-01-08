package me._21_strategy.java.refactoring_09._00_problem;

public class Player {
    private Media media = Media.NULL;

    public void play() {
        if (media == Media.VIDEO) {
            System.out.println("Video: play");
        } else if (media == Media.MUSIC) {
            System.out.println("Music: play");
        } else if (media == Media.NULL) {
            System.out.println("Null: play");
        } else {
            assert false;
        }
    }

    public void loop() {
        if (media == Media.VIDEO) {
            System.out.println("Video: loop");
        } else if (media == Media.MUSIC) {
            System.out.println("Music: loop");
        } else if (media == Media.NULL) {
            System.out.println("Null: loop");
        } else {
            assert false;
        }
    }

    public void stop() {
        if (media == Media.VIDEO) {
            System.out.println("Video: stop");
        } else if (media == Media.MUSIC) {
            System.out.println("Music: stop");
        } else if (media == Media.NULL) {
            System.out.println("Null: stop");
        } else {
            assert false;
        }
    }

    public void setMedia(Media media) {
        if (media == null) {
            media = Media.NULL;
        } else {
            this.media = media;
        }
    }
}
