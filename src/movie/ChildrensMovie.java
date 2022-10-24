package movie;

public class ChildrensMovie extends Movie {
    public ChildrensMovie(String title) {
        super(title);
        this._baseCost = 1.5;
        this._fineCost = 1.5;
        this._daysBeforeFine = 3;
    }
}
