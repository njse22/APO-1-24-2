package model; 

import java.util.Date; 

public class Ejecutivo extends Pasaje{

    private String chairCode; 

    public Ejecutivo(String name, int number, String from, String to, 
	    Date outDate, double kilometers, String chairCode){

	super(name, number, from, to, outDate, kilometers); 

	this.chairCode = chairCode; 
    }
}
