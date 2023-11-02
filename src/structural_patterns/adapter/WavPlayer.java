package structural_patterns.adapter;

public class WavPlayer implements MediaPlayer{
    
        @Override
        public void play(String audioType, String fileName) {
            System.out.println("Playing WAV file " + fileName);
        }
}
