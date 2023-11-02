package structural_patterns.adapter;

public class MediaPlayerAdapter implements MediaPlayer{
    MediaPlayer advancedMediaPlayer;
    
    public MediaPlayerAdapter(String audioType){
        if(audioType.equalsIgnoreCase("mp3")){
            advancedMediaPlayer = new MP3Player();
        } else if(audioType.equalsIgnoreCase("wav")){
            advancedMediaPlayer = new WavPlayer();
        }
    }
    
    @Override
    public void play(String audioType, String fileName) {
        if(audioType.equalsIgnoreCase("mp3")){
            advancedMediaPlayer.play(audioType, fileName);
        } else if(audioType.equalsIgnoreCase("wav")){
            advancedMediaPlayer.play(audioType, fileName);
        }
    }

    
}
