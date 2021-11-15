package lab5.task4;

public class DangerousAlbum extends Album {
    private boolean checkForPrime(int inputNumber) {
        boolean isItPrime = true;
        if (inputNumber <= 1) {
            isItPrime = false;
            return isItPrime;
        } else {
            for (int i = 2; i <= inputNumber / 2; i++) {
                if ((inputNumber % i) == 0) {
                    isItPrime = false;
                    break;
                }
            }
            return isItPrime;
        }
    }
    public void addSong(Song song) {
        if (checkForPrime(song.id)) cantece.add(song);
    }
}
