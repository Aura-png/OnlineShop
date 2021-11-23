package proiectBD;

import java.util.ArrayList;

public class Client {
	
	String instructiune;
	ArrayList<String> emails = new ArrayList<String>();
	ArrayList<Integer> id=new ArrayList<Integer>();
	ArrayList<String> parola = new ArrayList<String>();
	public Client() {
		
	}

	public Client(String i){
		instructiune=i;
	}
	
	public String getInstructiune() {
		return instructiune;
	}
	public void setInstructiune(String instructiune) {
		this.instructiune = instructiune;
	}
	
	
}
