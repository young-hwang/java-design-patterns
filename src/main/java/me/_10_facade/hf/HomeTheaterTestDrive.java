package me._10_facade.hf;

public class HomeTheaterTestDrive {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheaterFacade = new HomeTheaterFacade(new Amplifier(), new Tuner(), new DvdPlayer(), new CdPlayer(), new Projector(), new TheaterLights(), new Screen(), new PopcornPopper());
        homeTheaterFacade.watchMovie("Raiders of the Lost ark");
        homeTheaterFacade.endMovie();
    }
}
