package refactoring.solution5;

public class Classic implements MovieType{
    @Override
    public double getCharge(int _daysRented){
        double thisAmount = 0;
        if (_daysRented > 5) {
            thisAmount += 2.50 * 5;
            thisAmount += (_daysRented - 5) * 0.5;
        }
        else{
            thisAmount +=  2.5 * _daysRented;
        }
        return thisAmount;
    }
    public String getType(){
        return "Classic";
    }

    public String getStandardCharge(){
        return "2.5";
    }

}