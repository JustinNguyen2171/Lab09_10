package refactoring.solution5;

import java.util.ArrayList;
import java.util.List;

public class Customer {
	
    private String name;
    private RentalBasket r;
    
    public Customer (String name, RentalBasket r) {
        this.name = name;
        this.r = r;
    }
	
	public void addRentalBasket(RentalBasket rb) {
		this.r = rb;
	}
	
	public String getName (){
		return name;
	}

	public RentalBasket getRentalBasket(){
        return this.r;
    }

}
