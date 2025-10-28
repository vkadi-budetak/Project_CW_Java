import java.util.Objects;

public class Movie {
    public String title;
    public int year;
    public double rating;

    public Movie(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }
    public int getYear() {
        return year;
    }
    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "Movie{" +
                "title='" + title + '\'' +
                ", year=" + year +
                ", rating=" + rating +
                '}';
    }

    @Override
    public final boolean equals(Object o) {
        if (!(o instanceof Movie movie)) return false;

        return year == movie.year && Objects.equals(title, movie.title);
    }

    @Override
    public int hashCode() {
        return Objects.hashCode(title);
    }
}
