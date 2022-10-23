package movie;

public class RegularMovie extends Movie {
    public RegularMovie(String title) {
        super(title);
    }

    public double calculatePrice(int daysRented) {
        double amount = 2;
        if (daysRented > 2) {
            amount += (daysRented - 2) * 1.5;
        }

        return amount;
    }
}
