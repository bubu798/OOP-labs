package lab5.task4;

public class BadAlbum extends Album {
    private boolean isPalindrome(int number) {
        int numberRev = 0;
        int initialNumber = number;

        while (number > 0) {
            numberRev *= 10;
            numberRev += number % 10;
            number /= 10;
        }

        if (numberRev == initialNumber) return true;
        return false;
    }
    public void addSong(Song song) {
        if (song.name.length() == 3 && isPalindrome(song.id)) cantece.add(song);
    }
}
