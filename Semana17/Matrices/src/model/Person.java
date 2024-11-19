package model; 

public class Person{
    private String name; 
    private String id; 
    private String nationality; 
    private double weight; 
    private double height; 
    private double imc; 

    public Person(String name, String id, String nationality, double weight, 
	    double height){
	this.name = name; 
	this.id = id; 
	this.nationality = nationality; 
	this.weight = weight; 
	this.height = height; 
	this.imc = calculateImc(this.weight, this.height); 

    }

    public String getName(){
	return this.name;
    }

    public String getId(){
	return this.id;
    }
    public String getNationality(){
	return this.nationality;
    }

    public double getWeight(){
	return this.weight; 
    }

    public double getHeight(){
	return this.height; 
    }

    public double getImc(){
	return imc; 
    }

    private double calculateImc(double weight, double height){
	return weight/Math.pow(height, 2); 
    }
}
