package model; 

import java.util.Date;

public class Economico extends Pasaje {

    private String grupoAvordaje; 

    public Economico(String name, int number, String from, String to, 
	    Date outDate, double kilometers, String grupoAvordaje){

	super(name, number, from, to, outDate, kilometers); 

	this.grupoAvordaje = grupoAvordaje;
    }
}
