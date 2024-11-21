package model; 

public abstract class Animal{

    protected double weight; 
    protected double height; 
    protected int age; 

    public Animal(double weight, double height, int age){

	this.weight = weight; 
	this.height = height; 
	this.age = age;

    }

    public double getWeight(){
	return this.weight; 
    }

    public double getHeight(){
	return this.height; 
    }

    public abstract String communication();

}
