package ui;

import model.Controller; 

public class Main{

    private Controller controller;

    public Main(){
	controller = new Controller(); 
    }

    public static void main(String[] args){

	Main main = new Main(); 

	main.controller.addPerson("PersonA", "A00", "Colombia", 60, 1.65); 
	main.controller.addPerson("PersonB", "A10", "Colombia", 60, 1.65); 
	main.controller.addPerson("PersonC", "A20", "Colombia", 60, 1.65); 

	main.controller.generateStadistics(); 
	System.out.println(main.controller.printMatrix()); 
	
	System.out.println("*********************************************************"); 
	System.out.println(main.controller.printMatrixRotate()); 
	


    }
}
