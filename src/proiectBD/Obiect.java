package proiectBD;

public class Obiect {

	String instructiune;
	String returnat;
	
	Obiect(String i,String r){
		this.instructiune = i;
		this.returnat = r;
	}

	public String getInstructiune() {
		return instructiune;
	}

	public void setInstructiune(String instructiune) {
		this.instructiune = instructiune;
	}

	public String getReturnat() {
		return returnat;
	}

	public void setReturnat(String returnat) {
		this.returnat = returnat;
	}
}