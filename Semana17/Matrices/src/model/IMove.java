package model; 

public interface IMove{

    String jump(double input);

    default String run(double input){
	return "default run: " + input; 
    }

}
