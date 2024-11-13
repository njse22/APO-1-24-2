package model; 

public class Premium extends User implements IPayable {

    public Premium(String name, String id){
	super(name, id); 
    }

    @Override
    public String generatePay(int input){
	return "Generate Payment from Premium User";
    }
}
