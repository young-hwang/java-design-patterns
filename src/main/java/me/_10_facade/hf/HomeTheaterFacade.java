package me._10_facade.hf;

public class HomeTheaterFacade {
    Amplifier amplifier;
    Tuner tuner;
    DvdPlayer dvdPlayer;
    CdPlayer cdPlayer;
    Projector projector;
    TheaterLights theaterLights;
    Screen screen;
    PopcornPopper popcornPopper;

    public HomeTheaterFacade(Amplifier amplifier, Tuner tuner, DvdPlayer dvdPlayer, CdPlayer cdPlayer, Projector projector, TheaterLights theaterLights, Screen screen, PopcornPopper popcornPopper) {
        this.amplifier = amplifier;
        this.tuner = tuner;
        this.dvdPlayer = dvdPlayer;
        this.cdPlayer = cdPlayer;
        this.projector = projector;
        this.theaterLights = theaterLights;
        this.screen = screen;
        this.popcornPopper = popcornPopper;
    }

    void watchMovie(String movie) {
        System.out.println("Get ready to watch a movie...");
        this.popcornPopper.on();
        this.popcornPopper.pop();
        this.theaterLights.dim(10);
        this.screen.down();
        this.projector.on();
        this.projector.wideScreenModel();
        this.amplifier.on();
        this.amplifier.setDvd(dvdPlayer);
        this.amplifier.setSurroundSound();
        this.amplifier.setVolume(5);
        this.dvdPlayer.on();
        this.dvdPlayer.play(movie);
    }

    void endMovie() {
        System.out.println("Shutting movie theater down...");
        this.popcornPopper.off();
        this.theaterLights.on();
        this.screen.up();
        this.projector.off();
        this.amplifier.off();
        this.dvdPlayer.stop();
        this.dvdPlayer.eject();
        this.dvdPlayer.off();
    }

    void listenToCd() {

    }

    void endCd() {

    }

    void listenToRadio() {

    }

    void endRadio() {

    }
}
