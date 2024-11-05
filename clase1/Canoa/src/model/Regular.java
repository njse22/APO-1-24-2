package model; 

public class Regular extends User{

    public Regular(String name, String document, String mail, String phone){
	super(name, document, mail, phone); 
    }

    @Override
    public String toString(){
	return super.name;  
    }

}
