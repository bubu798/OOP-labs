package lab5.task4;

public class ThrillerAlbum extends Album {
    public void addSong(Song song) {
        if (song.composer.equals("Michael Jackson") && song.id % 2 == 0) cantece.add(song);
    }
}
