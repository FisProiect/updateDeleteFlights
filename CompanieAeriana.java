package Tabel;

import java.util.Calendar;
import java.util.List;


public class CompanieAeriana extends Zbor {
	private String numeCompanie;
	
	public CompanieAeriana(String codCursa, List<Avion> listPlane, double pret, String aeroportPlecare, String aeroportSosire, Calendar timpPlecare, Calendar timpSosire, String numeCompanie) {
		super(codCursa, listPlane, pret, aeroportPlecare, aeroportSosire, timpPlecare, timpSosire);
		this.numeCompanie = numeCompanie;
	}
	
	void modificareZbor() {
		
	}

	public String getNumeCompanie() {
		return numeCompanie;
	}

	public void setNumeCompanie(String numeCompanie) {
		this.numeCompanie = numeCompanie;
	}
}
