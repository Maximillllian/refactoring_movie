package movie;

public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title);
        this._baseCost = 2;
        this._fineCost = 1.5;
        this._daysBeforeFine = 2;
    }
}
