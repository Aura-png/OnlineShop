package proiectBD;

import java.util.ArrayList;

public class Produs {

	String instructiune;
	int cantitate;
	ArrayList<Integer> idProdus = new ArrayList<Integer>();
	ArrayList<String> produse = new ArrayList<String>();
	ArrayList<Integer> pret = new ArrayList<Integer>();
	ArrayList<String> firma = new ArrayList<String>();
	
	Produs(String i) {
		this.instructiune = i;
	}

	public String getInstructiune() {
		return instructiune;
	}

	public void setInstructiune(String instructiune) {
		this.instructiune = instructiune;
	}
	
	
}
