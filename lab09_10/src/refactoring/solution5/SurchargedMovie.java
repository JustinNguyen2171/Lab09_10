package refactoring.solution5;

public class SurchargedMovie implements MovieType {

    private MovieType movieType;
    private RentalBasket rb;

    public SurchargedMovie(MovieType movieType, RentalBasket r){
        this.movieType = movieType;
        this.rb = r;
    }

    @Override
    public double getCharge(int _daysRented) {
        double Amount = 0;
        Amount += this.movieType.getCharge(_daysRented);
        Amount = applySurcharge(Amount);
        return Amount;
    }

    private double applySurcharge(double amount){
        amount = amount * 1.1;
        return amount;
    }

    public String getType(){
        return this.movieType.getType();
    }

    public String getStandardCharge(){
        return this.movieType.getStandardCharge();
    }
}
