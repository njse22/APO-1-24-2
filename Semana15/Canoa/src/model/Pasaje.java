package model; 

import java.util.Date;

public abstract class Pasaje {

	private String name;
	private int number;
	private String from;
	private String to;
	private Date outDate;
	private double kilometers;

    public Pasaje(String name, int number, String from, String to, 
	    Date outDate, double kilometers) {
		this.name = name;
		this.number = number;
		this.from = from;
		this.to = to;
		this.outDate = outDate;
		this.kilometers = kilometers;
    }

	public void setName(String name) {
    	this.name = name;
	}

	public String getName() {
    	return name;
	}

	public void setNumber(int number) {
    	this.number = number;
	}

	public int getNumber() {
    	return number;
	}

	public void setFrom(String from) {
    	this.from = from;
	}

	public String getFrom() {
    	return from;
	}

	public void setTo(String to) {
    	this.to = to;
	}

	public String getTo() {
    	return to;
	}

	public void setOutDate(Date outDate) {
    	this.outDate = outDate;
	}

	public Date getOutDate() {
    	return outDate;
	}

	public void setKilometers(double kilometers) {
    	this.kilometers = kilometers;
	}

	public double getKilometers() {
    	return kilometers;
	}

}
