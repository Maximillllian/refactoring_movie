import java.util.Enumeration;
import java.util.Vector;


class Customer {
    private String _name;
    private Vector _rentals = new Vector();

    public Customer(String name) {
        _name = name;
    }

    public void addRental(Rental arg) {
        _rentals.addElement(arg);
    }

    public String getName() {
        return _name;
    }

    public String statement() {
        double totalCost = 0;
        int frequentRenterPoints = 0;

        Enumeration rentals = _rentals.elements();
        String result = "Учет аренды для " + getName() + "\n";
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            double cost = each.calculateCost();
            //определить сумму для каждой строки
            // добавить очки для активного арендатора
            frequentRenterPoints += each.getMovie().getFrequentRenterPoints(each.getDaysRented());
            //показать результаты для этой аренды
            result += "\t" + each.getMovie().getTitle() + "\t" + String.valueOf(cost) + "\n";
            totalCost += cost;
        }
        //добавить нижний колонтитул
        result += "Сумма задолженности составляет " + String.valueOf(totalCost) + "\n";
        result += "Вы заработали " + String.valueOf(frequentRenterPoints) + " очков за активность";
        return result;
    }
}
