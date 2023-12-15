package zad1;

public class TestMusicAlbum {

    public static void main(String[] args) {
        MusicAlbum album = new MusicAlbum("Thriller", "Michael Jackson", new double[]{4.5, 5.0, 4.8});
        System.out.println(album);
        album.addRating(4.7);
        System.out.println(album);

        RockAlbum rockAlbum = new RockAlbum("Back in Black", "AC/DC", new double[]{5.0, 4.9}, "Hard Rock");
        System.out.println(rockAlbum);
        rockAlbum.addRating(4.8);
        System.out.println(rockAlbum);
    }
}
