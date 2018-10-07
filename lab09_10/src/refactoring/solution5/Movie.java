package refactoring.solution5;
/*
 * Moving the getCharge method to the class Movie,
 * Encapsulate Field on the type code to ensure that all uses of the type code go through getting
 * and setting methods. Because most of the code came from other classes, most methods already
 * use the getting method. However, the constructors do access the price code 
 */
public class Movie {

	private String title;
	MovieType MovieType;
	
	public Movie(String title, MovieType MovieType) {
		this.title = title;
		this.MovieType = MovieType;
	}

	public String getTitle (){
		return title;
	}

	public MovieType getMovieType(){
	    return MovieType;
    }

	// Refactor method - refactor getCharge() to class Movie
	double getCharge(int _daysRented) {
        return MovieType.getCharge(_daysRented);
	}

    @Override
	public String toString(){
		return getTitle() +"," + " " + this.MovieType.getType()+ "," + " " + "$" + this.MovieType.getStandardCharge();
	}

}