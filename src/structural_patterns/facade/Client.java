package structural_patterns.facade;

public class Client {
    public static void main(String[] args) {
        HomeTheaterFacade homeTheater = new HomeTheaterFacade();
        homeTheater.watchMovie("The Matrix");
        // After watching the movie
        homeTheater.endMovie();
    }
}
