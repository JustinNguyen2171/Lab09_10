package refactoring.solution5;

public class Regular implements MovieType{
    @Override
    public double getCharge(int _daysRented){
        double thisAmount = 0;
        if (_daysRented > 3) {
            thisAmount += 3 * 3;
            thisAmount += (_daysRented - 3) * 1;
        }
        else{
            thisAmount +=  3 * _daysRented;
        }
        return thisAmount;
    }

    public String getType(){
        return "Regular";
    }

    public String getStandardCharge(){
        return "3";
    }
}