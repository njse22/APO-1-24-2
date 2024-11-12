package model;

import java.util.Date;

public class CanoaController {

    public static final int USERS_SIZE = 15; 
    public static final double DISSACOUNT_TEN = 0.1;


    private User[] users; 

    public CanoaController(){
	System.out.println("Constructor de la clase Controller");
	users = new User[USERS_SIZE]; 
    }


    public String addUser(String name, String document, String mail, String phone, 
	    Date subscriptionDate, boolean isRegular){

	User user = null;
	String msg = "";
	int position = getEmptyPosition();

	if(isRegular){
	   user = new Regular(name, document, mail, phone);
	   msg += "El usuario de tipo Regular: " + user; 

	}
	else{
	    user = new Premium(name, document, mail, phone, subscriptionDate);
	    msg += "El usuario de tipo Premium: " + user; 
	}

       if(position != -1){
	   users[position] = user;
	   msg += " a sido agregada ";
       }
       else{
	   msg += " NO a sido agregada";
       }
       return msg;
    }

    public double calculateDissacountPremiumUser(User premium, double total){
	//return total - (total * DISSACOUNT_TEN); 
	return ( (Premium) premium ).calculateDissaccount(total); 
    }

    public double calculateCostPassenger(String userDocument, Pasaje pasaje, double kilometers){
	// tipo de pasaje -> valor por kilometro
	// kilometros recorridos 
	User user = getUserByDocument(userDocument); 
	double total = 0.0;

	if(pasaje instanceof Economico){
	    total += (80*kilometers) + 50000;
	}
	else if (pasaje instanceof Ejecutivo){
	    total += 120*kilometers + 80000;
	}

	if (user instanceof Premium){
	    total = calculateDissacountPremiumUser(user, total);
	}

	return total; 
    }


    private User getUserByDocument(String document){

	User user = null; 
	boolean isFound = false;

	for(int i = 0; i < USERS_SIZE && !isFound; i++){
	    if(users[i].getDocument().equals(document)){
		user = users[i]; 
		isFound = true;
	    }
	}
	return user; 
    }

    // ¿Cual es la visivilidad del método? 
    private int getEmptyPosition(){
	int position = -1; 
	boolean isFound = false;

	for(int i = 0; i < USERS_SIZE && !isFound; i++){
	    if(users[i] == null){
		position = i; 
		isFound = true;
	    }
	}

	return position;
    }
}
