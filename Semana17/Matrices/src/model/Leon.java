package model; 

public class Leon extends Mammal{

    public Leon(double weight, double height, int age, String name){
	super(weight, height, age, name);
    }

    @Override
    public String communication(){
	return "Hello, from Leon";
    }
}
