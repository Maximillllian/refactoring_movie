package movie;


public abstract class Movie {
    private String _title;
    protected double _baseCost;
    protected double _fineCost;
    protected int _daysBeforeFine;

    public Movie(String title) {
        _title = title;
    }

    public String getTitle () {
        return _title;
    }

    public double getBaseCost() {
        return this._baseCost;
    }

    public double getFineCost() {
        return this._fineCost;
    }

    public int getDaysBeforeFine() {
        return this._daysBeforeFine;
    }

    public int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
}
