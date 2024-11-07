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
	    user = new Premium(name, document, mail, phone, subscriptionDate, DISSACOUNT_TEN);
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


    int getEmptyPosition(){
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
