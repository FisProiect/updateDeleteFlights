package Tabel;
import java.util.Calendar;
import java.util.List;

public class Zbor {
	private String codCursa, aeroportPlecare, aeroportSosire;
	private Calendar timpPlecare, timpSosire;
	private List<Avion> listPlane;
	private double pret;
	
	Zbor(String codCursa, List<Avion> listPlane, double pret, String aeroportPlecare, String aeroportSosire, Calendar timpPlecare, Calendar timpSosire) {
		this.codCursa = codCursa;
		this.listPlane = listPlane;
		this.pret = pret;
		this.aeroportPlecare = aeroportPlecare;
		this.aeroportSosire = aeroportSosire;
		this.timpPlecare = timpPlecare;
		this.timpSosire = timpSosire;
	}

	public String getCodCursa() {
		return codCursa;
	}

	public void setCodCursa(String codCursa) {
		this.codCursa = codCursa;
	}

	public String getAeroportPlecare() {
		return aeroportPlecare;
	}

	public void setAeroportPlecare(String aeroportPlecare) {
		this.aeroportPlecare = aeroportPlecare;
	}

	public String getAeroportSosire() {
		return aeroportSosire;
	}

	public void setAeroportSosire(String aeroportSosire) {
		this.aeroportSosire = aeroportSosire;
	}

	public Calendar getTimpPlecare() {
		return timpPlecare;
	}

	public void setTimpPlecare(Calendar timpPlecare) {
		this.timpPlecare = timpPlecare;
	}

	public Calendar getTimpSosire() {
		return timpSosire;
	}

	public void setTimpSosire(Calendar timpSosire) {
		this.timpSosire = timpSosire;
	}

	public List<Avion> getListPlane() {
		return listPlane;
	}

	public void setListPlane(List<Avion> listPlane) {
		this.listPlane = listPlane;
	}

	public double getPret() {
		return pret;
	}

	public void setPret(double pret) {
		this.pret = pret;
	}
	
}
