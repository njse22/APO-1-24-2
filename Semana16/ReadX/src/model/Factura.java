package model; 

public class Factura implements IPayable{


    @Override
    public String generatePay(int input){
	return "Factura"; 
    }
}
