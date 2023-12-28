package structural_patterns.facade;

public class HomeTheaterFacade {
    private TV tv;
    private DVDPlayer dvdPlayer;
    private AudioSystem audioSystem;
    private Lights lights;

    public HomeTheaterFacade() {
        tv = new TV();
        dvdPlayer = new DVDPlayer();
        audioSystem = new AudioSystem();
        lights = new Lights();
    }

    public void watchMovie(String movie) {
        lights.dimLights();
        tv.turnOn();
        dvdPlayer.play(movie);
        audioSystem.setSource("DVD");
        audioSystem.turnOn();
    }

    public void endMovie() {
        lights.turnOnLights();
        tv.turnOff();
        dvdPlayer.stop();
        dvdPlayer.eject();
        audioSystem.turnOff();
    }
}
