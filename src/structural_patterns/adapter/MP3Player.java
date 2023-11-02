package structural_patterns.adapter;

public class MP3Player implements MediaPlayer{

    @Override
    public void play(String audioType, String fileName) {
        System.out.println("Playing MP3 file " + fileName);
    }
    
}
