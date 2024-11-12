package model; 

import java.util.Date; 

public class Premium extends User {

    public static final double DISSACOUNT_TEN = 0.1;

    private Date subscriptionDate; 

    public Premium(String name, String document, String mail, String phone, 
	    Date subscriptionDate){
	super(name, document, mail, phone); 

	this.subscriptionDate = subscriptionDate; 
    }

    public double calculateDissaccount(double total){
	return total - (total * DISSACOUNT_TEN); 
    }
    
    public String toString(){
	return this.name; 
    }


}
