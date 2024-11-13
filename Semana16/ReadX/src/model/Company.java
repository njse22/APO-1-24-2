package model; 

import java.util.ArrayList;

public class Company{

    public ArrayList<User> users;
    public ArrayList<IPayable> payables;

    public Company(){
	users = new ArrayList<>();
    }

    public void createUser(String name, String id, int type){
	User newUser = null;

	if (type == 0){
	    newUser = new Regular(name, id); 
	}
	else if(type == 1){
	    newUser = new Premium(name, id); 
	}
	users.add(newUser); 
    }



    public User getUserById(String id){

	return null; 
    }

    public ArrayList<User> getUsers(){
	return users;
    }
}
