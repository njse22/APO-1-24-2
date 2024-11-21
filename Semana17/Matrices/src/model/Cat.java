package model; 

public class Cat extends Mammal {

    public Cat(double weight, double height, int age, String name){
	super(weight, height, age, name);
    }

    @Override
    public String communication(){
	return "Hello, from cat";
    }
}
