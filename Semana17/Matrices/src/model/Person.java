package model; 

public class Person extends Mammal  implements IMove{

    private String id; 
    private String nationality; 
    private double imc; 

    public Person(double weight, double height, int age, String name, 
	    String id, String nationality){
	super(weight, height, age, name);
	this.id = id; 
	this.nationality = nationality; 
	this.imc = calculateImc(super.weight, super.height); 

    }

    public String getId(){
	return this.id;
    }
    public String getNationality(){
	return this.nationality;
    }


    public double getImc(){
	return imc; 
    }

    private double calculateImc(double weight, double height){
	return weight/Math.pow(height, 2); 
    }

    @Override
    public String communication(){
	return "Hello, from Person"; 
    }


    @Override
    public String jump(double input){
	return "The person jumps " + input + " meters";
    }

    //@Override
    //public String run(double input){
    //    return "The person runs " + input + " meters";
    //}

}
