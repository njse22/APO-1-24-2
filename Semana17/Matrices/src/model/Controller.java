package model; 

import java.util.ArrayList;

public class Controller{

    // Definir las constantes que representan las
    // dimenciones de la matriz
    public final static int ROWS = 4; 
    public final static int COLUMNS = 6; 


    private ArrayList<Person> people; 
    private ArrayList<Animal> animals;

    // declaran la matriz
    private String[][] stadistics; 
    private Cat[][] cats; 

    public Controller(){
	people = new ArrayList<>(); 
	// inicializan la matriz
	stadistics = new String[ROWS][COLUMNS]; 
	animals = new ArrayList<>();

	animals.add(new Leon(102, 1.65, 5, "Leon 1"));
	animals.add(new Cat(102, 1.65, 5, "Cat 1"));
	animals.add(new Leon(102, 1.65, 5, "Leon 2"));
	animals.add(new Leon(102, 1.65, 5, "Leon 3"));

    }

    public boolean addPerson(double weight, 
	    double height, int age, String name, String id, String nationality ){
	Person newPerson = new Person(weight, height, age, name, id, nationality );
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

    public Cat[][] generateCatsMatrix(){
	Cat[][] cats = new Cat[ROWS][COLUMNS]; 

	for(int i = 0; i < ROWS; i++){
	    System.out.println("FILA: " + i);
	    System.out.println("\n");

	    for(int j = 0; j < COLUMNS; j++){

	    System.out.println("COLUMNA: " + j);
		if(animals.get(i) instanceof Cat){
		    cats[i][j] = (Cat)animals.get(i); 
		}
	    }
	}

	return cats;

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

    public ArrayList<Person> getPeople(){
	return people;
    }

}
