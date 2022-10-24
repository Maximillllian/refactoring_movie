package movie;

public class NewReleaseMovie extends Movie {
    public NewReleaseMovie(String title) {
        super(title);
        this._baseCost = 0;
        this._fineCost = 3;
        this._daysBeforeFine = 0;
    }

    @Override
    public int getFrequentRenterPoints(int daysRented) {
        if (daysRented > 1) {
            return 2;
        }

        return 1;
    }
}
