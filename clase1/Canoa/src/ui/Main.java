package ui; 

import model.Regular;
import model.Premium;
import model.User;

public class Main{

    public static void main(String[] args){
	Regular regularUser = new Regular("User1", "A00", "u@mail.com", "1234");

	Premium premiumUser = new Premium("User2", "A01", "u2@mail.com", "5678", null, 0.1 ); 

	if (premiumUser instanceof User){
	    System.out.println("Yes !! premium is a user"); 
	}


	if (regularUser instanceof User){
	    System.out.println("Yes !! regular is a user"); 
	}

	User[] users = new User[10]; 
	users[0] = regularUser; 
	users[1] = premiumUser; 

	System.out.println(users[0].getName());
	System.out.println(users[1].getName()); 


    }

}
