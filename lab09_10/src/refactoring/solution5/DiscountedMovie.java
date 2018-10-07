package refactoring.solution5;

public class DiscountedMovie implements MovieType {

    private MovieType movieType;
    private RentalBasket rb;

    public DiscountedMovie(MovieType movieType, RentalBasket r){
        this.movieType = movieType;
        this.rb = r;
    }

    @Override
    public double getCharge(int _daysRented) {
        double Amount = 0;
        Amount += this.movieType.getCharge(_daysRented);
        Amount = applyDiscount(Amount);
        return Amount;
    }

    private double applyDiscount(double amount) {
        amount = amount * 0.75;
        return amount;
    }

    public String getType(){
        return this.movieType.getType();
    }
    public String getStandardCharge(){
        return this.movieType.getStandardCharge();
    }
}
