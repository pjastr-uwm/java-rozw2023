package zad1;

import java.util.Arrays;
import java.util.Objects;

class MusicAlbum {
    private String title;
    private String artist;
    private double[] ratings;

    public MusicAlbum(String title, String artist, double[] ratings) {
        this.title = title;
        this.artist = artist;
        this.ratings = ratings == null ? new double[0] : ratings.clone();
    }

    public void addRating(double rating) {
        double[] temp = new double[ratings.length+1];
        for(int i=0;i<ratings.length;i++){
            temp[i] = ratings[i];
        }
        temp[ratings.length]  = rating;
        ratings = temp;
    }

    public void removeLastRating() {
        if (ratings.length>0) {
            double[] temp = new double[ratings.length-1];
            for(int i=0;i<ratings.length-1;i++){
                temp[i] = ratings[i];
            }
            ratings = temp;
        }
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getArtist() {
        return artist;
    }

    public void setArtist(String artist) {
        this.artist = artist;
    }

    public double[] getRatings() {
        return ratings.clone();
    }

    public void setRatings(double[] ratings) {
        if (ratings != null)
            this.ratings = ratings.clone();
    }

    @Override
    public String toString() {
        return getClass().getSimpleName() +
                ": title='" + title + '\'' +
                ", artist='" + artist + '\'' +
                ", ratings=" + Arrays.toString(ratings);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        MusicAlbum that = (MusicAlbum) o;
        return Objects.equals(title, that.title) &&
                Objects.equals(artist, that.artist) &&
                Arrays.equals(ratings, that.ratings);
    }

    @Override
    public int hashCode() {
        int result = Objects.hash(title, artist);
        result = 31 * result + Arrays.hashCode(ratings);
        return result;
    }
}
