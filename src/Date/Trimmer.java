package Date;

import java.util.Objects;

public class Trimmer implements AparatAgricol {

	//schimbat parintii



	protected String Brand, utilizare;
	protected double greutate;
	protected double putere;
	protected boolean acumulatori;
	
	public Trimmer()
	{
		Brand=null;
		utilizare=null;
		greutate=0;
		putere=0;
		acumulatori=false;
	}
	
	
	public Trimmer(String Brand, String utilizare,double greutate, double putere, boolean acumulatori) {
	
		this.Brand = Brand;
		this.utilizare = utilizare;
		this.greutate = greutate;
		this.putere = putere;
		this.acumulatori = acumulatori;
	}
	
	public Trimmer(Trimmer t)
	{
		this.Brand = t.Brand;
		this.utilizare = t.utilizare;
		this.greutate = t.greutate;
		this.putere = t.putere;
		this.acumulatori = t.acumulatori;
	}
	
    @Override
	public String toString() {
		return "TrimmerElectric [Brand=" + Brand + ", utilizare=" + utilizare + ", greutate=" + greutate + ", putere="
				+ putere + ", acumulatori=" + acumulatori + "]";
	}

	
	public double getGreutate() {
		return greutate;
	}


	public void setGreutate(double greutate) {
		this.greutate = greutate;
	}


	public double getPutere() {
		return putere;
	}


	public void setPutere(double putere) {
		this.putere = putere;
	}


	public boolean isAcumulatori() {
		return acumulatori;
	}


	public void setAcumulatori(boolean acumulatori) {
		this.acumulatori = acumulatori;
	}


	public String getBrand() {
		return Brand;
	}


	public void setBrand(String brand) {
		Brand = brand;
	}


	public String getUtilizare() {
		return utilizare;
	}


	public void setUtilizare(String utilizare) {
		this.utilizare = utilizare;
	}

	public void alimenteaza() {
		// TODO Auto-generated method stub
	}
	
	public void taie() {
		// TODO Auto-generated method stub
	}
	
	@Override
	public int hashCode() {
		return Objects.hash(Brand, acumulatori, greutate, putere, utilizare);
	}


	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Trimmer other = (Trimmer) obj;
		return Objects.equals(Brand, other.Brand) && acumulatori == other.acumulatori
				&& Double.doubleToLongBits(greutate) == Double.doubleToLongBits(other.greutate)
				&& Double.doubleToLongBits(putere) == Double.doubleToLongBits(other.putere)
				&& Objects.equals(utilizare, other.utilizare);
	}
	
}
