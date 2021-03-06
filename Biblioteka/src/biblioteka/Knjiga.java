package biblioteka;

import java.util.LinkedList;

public class Knjiga {
	
	private String naslov;
	private String ISBN;
	private LinkedList<Autor> autori;
	private String izdavac;
	private int izdanje;
	
	public String getNaslov() {
		return naslov;
	}
	public void setNaslov(String naslov) {
		this.naslov = naslov;
	}
	public String getISBN() {
		return ISBN;
	}
	public void setISBN(String iSBN) {
		ISBN = iSBN;
	}
	public LinkedList<Autor> getAutori() {
		return autori;
	}
	public void setAutori( LinkedList<Autor> autori) {
		this.autori = autori;
	}
	public String getIzdavac() {
		return izdavac;
	}
	public void setIzdavac(String izdavac) {
		this.izdavac = izdavac;
	}
	public int getIzdanje() {
		return izdanje;
	}
	public void setIzdanje(int izdanje) {
		this.izdanje = izdanje;
	}
	@Override
	public String toString() {
		return "Knjiga [naslov=" + naslov + ", ISBN=" + ISBN + ", autori=" + autori + ", izdavac=" + izdavac
				+ ", izdanje=" + izdanje + ", getNaslov()=" + getNaslov() + ", getISBN()=" + getISBN()
				+ ", getAutori()=" + getAutori() + ", getIzdavac()=" + getIzdavac() + ", getIzdanje()=" + getIzdanje()
				+ ", getClass()=" + getClass() + ", hashCode()=" + hashCode() + ", toString()=" + super.toString()
				+ "]";
	}
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((ISBN == null) ? 0 : ISBN.hashCode());
		return result;
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Knjiga other = (Knjiga) obj;
		if (ISBN == null) {
			if (other.ISBN != null)
				return false;
		} else if (!ISBN.equals(other.ISBN))
			return false;
		return true;
	}
	
	
	
}
