package movie;


public abstract class Movie {
    private String _title;

    public Movie(String title) {
        _title = title;
    }

    public String getTitle () {
        return _title;
    }
    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }

    abstract public double calculatePrice(int daysRented);
}
