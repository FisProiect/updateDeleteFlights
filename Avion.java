package Tabel;

import java.util.Calendar;
import java.util.List;

enum tipAvion {
	Personal, Comercial
}
public class Avion extends Zbor {
	private tipAvion type;
	private int cls1, cls2;
	
	public Avion(String codCursa, List<Avion> listPlane, double pret, String aeroportPlecare, String aeroportSosire, Calendar timpPlecare, Calendar timpSosire, tipAvion type, int cls1, int cls2) {
		super(codCursa, listPlane, pret, aeroportPlecare, aeroportSosire, timpPlecare, timpSosire);
		this.type = type;
		this.cls1 = cls1;
		this.cls2 = cls2;
	}

	public tipAvion getType() {
		return type;
	}

	public void setType(tipAvion type) {
		this.type = type;
	}

	public int getCls1() {
		return cls1;
	}

	public void setCls1(int cls1) {
		this.cls1 = cls1;
	}

	public int getCls2() {
		return cls2;
	}

	public void setCls2(int cls2) {
		this.cls2 = cls2;
	}
	
	
}
