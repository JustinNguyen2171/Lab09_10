package refactoring.solution5;

public class New implements MovieType{
    @Override
    public double getCharge(int _daysRented){
        double thisAmount = 0;
        if (_daysRented > 1) {
            thisAmount += 5 * 1;
            thisAmount += (_daysRented - 1) * 5;
        }
        else{
            thisAmount += 5* _daysRented;
        }
        return thisAmount;
    }

    public String getType(){
        return "New";
    }

    public String getStandardCharge(){
        return "5";
    }
}