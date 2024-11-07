package ui; 

import java.util.Scanner;
import java.util.Date;
import model.CanoaController;

public class Main{

    private CanoaController controller;
    private Scanner reader;
    
    public Main(){
	System.out.println("Constructor de la Clase Main");
	reader = new Scanner(System.in); 
	controller = new CanoaController(); 
    }


    public static void main(String[] args){

	// Relación de Dependencia o Uso
	// CanoaController canoa = new CanoaController();
	

	Main main = new Main(); 
	main.addUser();

    }

    public void addUser(){
	System.out.println("1: Regular y 2: Premium : ");
	int option = reader.nextInt(); 
	boolean isRegular = false; 
	if(option == 1){
	    isRegular = true; 
	}

	System.out.println("Escriba el nombre del Usuario: ");
	String name = reader.next();
	reader.nextLine();

	System.out.println("Escriba el document del Usuario: ");
	String document= reader.nextLine();

	System.out.println("Escriba el mail del Usuario: ");
	String mail = reader.nextLine();
	System.out.println("Escriba el phone del Usuario: ");
	String phone = reader.nextLine();

	Date subscriptionDate = new Date(); 

	String msg = controller.addUser(name, document, mail, phone, subscriptionDate, isRegular); 
	System.out.println(msg); 
    

    }

}
