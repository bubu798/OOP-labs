package lab5.task4;

import java.util.ArrayList;

public abstract class Album {
    public ArrayList<Song> cantece = new ArrayList<Song>();
    public abstract void addSong(Song song);
    public void removeSong(Song song) {
        for (int i = 0; i < cantece.size(); i++) {
            if(song.name.equals(cantece.get(i).name)  && song.id == cantece.get(i).id && song.composer.equals(cantece.get(i).composer)) {
                cantece.remove(i);
            }
        }
    }
    @Override
    public String toString() {
        String results = "";
        for(Song s: cantece) {
            results += s.name + ", ";
        }
        StringBuffer sb= new StringBuffer(results);
        sb.deleteCharAt(sb.length()-2);
        sb.deleteCharAt(sb.length()-1);
        return "songs = {" + sb +'}';
    }
    
}

