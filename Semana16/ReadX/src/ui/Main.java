package ui; 

import java.util.ArrayList;
import model.Company;
import model.IPayable; 
import model.User;
import model.Regular;
import model.Premium;
import model.Factura;

public class Main{

    public static void main(String[] args){

	Company controller = new Company(); 

	controller.createUser("User1", "A00", 0); 
	controller.createUser("User2", "A10", 1); 


	IPayable pay = new Premium("user3", "A20"); 
	User pre = new Premium("User5", "A30");

	controller.getUsers().add(pre); 
	controller.getUsers().add((User)pay); 

	System.out.println(controller.getUsers());


	for( int i = 0; i < controller.getUsers().size(); i++){
	    if(controller.getUsers().get(i) instanceof IPayable){
		System.out.println(
			( (Premium)controller.getUsers().get(i) ).generatePay(i));
	    }
	    else{
		System.out.println("No es Pagable"); 
	    }
	}

	ArrayList<IPayable> payables = new ArrayList<>();
	payables.add(new Premium("User7", "A70"));
	payables.add(new Regular("User7", "A70"));
	payables.add(new Factura());

	for(int i = 0; i < payables.size(); i++){
	    System.out.println(payables.get(i) instanceof IPayable);
	    System.out.println(payables.get(i) instanceof User);
	    System.out.println(payables.get(i) instanceof Premium);
	}


    }

}
