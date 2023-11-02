package structural_patterns.adapter;

public class Client {
    public static void main(String[] args) {
        MediaPlayerAdapter adapter = new MediaPlayerAdapter("mp3");
        adapter.play("mp3", "file.mp3");
        adapter = new MediaPlayerAdapter("wav");
        adapter.play("wav", "file.wav");
    }
}
