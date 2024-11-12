package model;

public abstract class User {

    protected String name; 
    private String document; 
    private String mail; 
    private String phone; 

    public User(String name, String document, String mail, String phone){
	this.name = name; 
	this.document = document;
	this.mail = mail; 
	this.phone = phone; 
    }

    public String getName(){
	return this.name; 
    }

    public void setName(String name){
	this.name = name; 
    }

    public String getDocument(){
	return this.document;
    }

}
