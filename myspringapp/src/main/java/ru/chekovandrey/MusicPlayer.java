package ru.chekovandrey;

public class MusicPlayer {
    private Music music;

    // IoC
    public MusicPlayer(Music music) {
        this.music = music;
    }

    public MusicPlayer(){}

    public void setMusic(Music music){ //Spring из конфигурац. файла ищет метод set"name"
        this.music=music;              //name=music, поэтому он ищет setMusic и выполняет
    }

    public void playMusic(){
        System.out.println("Playing: "+music.getSong());
    }
}
