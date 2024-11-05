package model; 

import java.util.Date; 

public class Premium extends User {

    private Date subscriptionDate; 
    private double dissacount; 

    public Premium(String name, String document, String mail, String phone, 
	    Date subscriptionDate, double dissacount){
	super(name, document, mail, phone); 

	this.subscriptionDate = subscriptionDate; 
	this.dissacount = dissacount;
    }


}
