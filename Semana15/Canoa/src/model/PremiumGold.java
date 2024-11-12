package model; 

import java.util.Date; 

public class PremiumGold extends Premium {

    public static final double DISSACOUNT = 0.15; 

    public PremiumGold(String name, String document, String mail, String phone, 
	    Date subscriptionDate) {
	super(name, document, mail, phone, subscriptionDate); 

    }

    @Override
    public double calculateDissaccount(double total){
	return total - (total * DISSACOUNT); 
    }
}
