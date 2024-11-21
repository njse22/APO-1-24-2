package ui;

import model.Controller; 
import model.Cat; 

public class Main{

    private Controller controller;

    public Main(){
	controller = new Controller(); 
    }

    public static void main(String[] args){

	Main main = new Main(); 

	main.controller.addPerson( 60, 1.65, 10, "PersonA", "A00", "Colombia"); 
	main.controller.addPerson( 60, 1.65, 10, "PersonB", "A10", "Colombia"); 
	main.controller.addPerson( 60, 1.65, 10, "PersonC", "A20", "Colombia"); 

	main.controller.generateStadistics(); 
	System.out.println(main.controller.printMatrix()); 
	
	System.out.println("*********************************************************"); 
	// System.out.println(main.controller.printMatrixRotate()); 
	
	System.out.println(main.controller.getPeople().get(0).communication());
	System.out.println(main.controller.getPeople().get(0).jump(10));
	System.out.println(main.controller.getPeople().get(0).run(10));

	System.out.println("*********************************************************"); 

	Cat[][] catsResult = main.controller.generateCatsMatrix();

	for(int i = 0; i < catsResult.length; i++){
	    System.out.println("\n");
	    for(int j = 0; j < catsResult[0].length; j++ ){
		if(catsResult[i][j] != null){
		    System.out.print( i + "," + j + " "+ catsResult[i][j].getName() + "\t");
		}
	    }
	}

    }
}
