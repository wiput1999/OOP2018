package midterm;

public class PopSong extends Song {

    private int sale;

    PopSong(String title, String artist) {
        this.setArtist(artist);
        this.setTitle(title);
    }

    @Override
    public boolean isPopular() {
        if (sale > 100000) {
            return true;
        }
        return false;
    }
}
