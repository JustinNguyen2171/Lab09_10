package refactoring.solution5;

import java.util.ArrayList;

public class RentalBasket {
    private ArrayList<RentalItem> rentals;

    public RentalBasket(){
        this.rentals = new ArrayList<>();
    }

    public void addRentalItem(RentalItem r){
        this.rentals.add(r);
    }

    public double getTotalCharge() {
        double result = 0;
        for (RentalItem r: rentals) {
            result += r.getCharge();
        }
        if (length() > 4){
            result = result * 0.9;
        }
        return result;
    }

    public ArrayList<RentalItem> getRentalItems(){
        return this.rentals;
    }

    public int length(){
        return this.rentals.size();
    }

}
