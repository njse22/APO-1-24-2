package model; 

import java.util.ArrayList;

public class Controller{

    // Definir las constantes que representan las
    // dimenciones de la matriz
    public final static int ROWS = 4; 
    public final static int COLUMNS = 6; 


    private ArrayList<Person> people; 

    // declaran la matriz
    private String[][] stadistics; 

    public Controller(){
	people = new ArrayList<>(); 
	// inicializan la matriz
	stadistics = new String[ROWS][COLUMNS]; 

    }

    public boolean addPerson(String name, String id, String nationality, double weight, 
	    double height ){
	Person newPerson = new Person(name, id, nationality, weight, height);
	return people.add(newPerson); 
    }



    public void generateStadistics(){
	stadistics[0][0] = "Name"; 
	stadistics[0][1] = "Id"; 
	stadistics[0][2] = "Nationality"; 
	stadistics[0][3] = "Weight"; 
	stadistics[0][4] = "Height"; 
	stadistics[0][5] = "IMC"; 

	// recorriudo de una matriz 
	for(int j = 0; j < COLUMNS; j++){
	    for(int i = 1; i < ROWS; i++){

		if(people.get(i-1) != null){

		    if(j == 0){
			stadistics[i][j] = people.get(i-1).getName(); 
		    }
		    else if( j == 1){
			stadistics[i][j] = people.get(i-1).getId(); 
		    }
		    else if(j == 2){
			stadistics[i][j] = people.get(i-1).getNationality(); 
		    }
		    else if(j == 3){
			stadistics[i][j] = people.get(i-1).getWeight() + ""; 
		    }
		    else if(j == 4){
			stadistics[i][j] = people.get(i-1).getHeight() + ""; 
		    }
		    else if(j == 5){
			stadistics[i][j] = people.get(i-1).getImc() + ""; 
		    }
		}
	    }
	}
    }


    public String printMatrix(){
	String msg = ""; 

	// recorriudo de una matriz 
	for(int i = 0; i < ROWS; i++){
	    // System.out.println("COLUMNA: " + i);
	    msg += "\n"; 
	    for(int j = 0; j < COLUMNS; j++){
	    //System.out.println("FILA: " + j);
		msg += stadistics[i][j] + "\t "; 
	    }
	}
	return msg; 
    }
    
    public String printMatrixRotate(){
	String msg = ""; 

	// recorriudo de una matriz 
	for(int j = 0; j < COLUMNS; j++){
	    // System.out.println("COLUMNA: " + i);
	    msg += "\n"; 
	    for(int i = 0; i < ROWS; i++){
	    //System.out.println("FILA: " + j);
		msg += stadistics[i][j] + " "; 
	    }
	}
	return msg; 
    }

}
