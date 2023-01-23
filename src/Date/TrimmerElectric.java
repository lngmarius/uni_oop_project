package Date;

import java.io.Serializable;
import java.util.Objects;

public class TrimmerElectric extends Trimmer implements AparatAgricol, Serializable
{

	protected String Model, sistemTaiere, tipAcumulator;
	protected int diametruTaiere,tensiune;
	
	public TrimmerElectric() {
		super();
		this.diametruTaiere = 0;
		this.tensiune = 0;
		Model = null;
		this.sistemTaiere = null;
		this.tipAcumulator = null;
	}
	
	public TrimmerElectric(String Brand, String utilizare,double greutate, double putere, boolean acumulatori,String model, String sistemTaiere, String tipAcumulator,int diametruTaiere, int tensiune) {
		super(Brand,utilizare,greutate,putere,acumulatori);
		this.diametruTaiere = diametruTaiere;
		this.tensiune = tensiune;
		Model = model;
		this.sistemTaiere = sistemTaiere;
		this.tipAcumulator = tipAcumulator;
	}

	

	public TrimmerElectric(TrimmerElectric t)
	{
		this.Brand = t.Brand;
		this.utilizare = t.utilizare;
		this.greutate = t.greutate;
		this.putere = t.putere;
		this.acumulatori = t.acumulatori;
		
		this.diametruTaiere = t.diametruTaiere;
		this.tensiune = t.tensiune;
		this.Model = t.Model;
		this.sistemTaiere = t.sistemTaiere;
		this.tipAcumulator = t.tipAcumulator;		
	}

	public int getDiametruTaiere() {
		return diametruTaiere;
	}

	public void setDiametruTaiere(int diametruTaiere) {
		this.diametruTaiere = diametruTaiere;
	}

	public int getTensiune() {
		return tensiune;
	}
	
	public boolean getAcumulatori()
	{
		return acumulatori;
		
	}

	public void setTensiune(int tensiune) {
		this.tensiune = tensiune;
	}

	public String getModel() {
		return Model;
	}

	public void setModel(String model) {
		Model = model;
	}

	public String getSistemTaiere() {
		return sistemTaiere;
	}

	public void setSistemTaiere(String sistemTaiere) {
		this.sistemTaiere = sistemTaiere;
	}

	public String getTipAcumulator() {
		return tipAcumulator;
	}

	public void setTipAcumulator(String tipAcumulator) {
		this.tipAcumulator = tipAcumulator;
	}

	@Override
	



	public void taie() {
		// TODO Auto-generated method stub
		if (acumulatori)
			System.out.println("Trimmer "+Brand+ " "+Model+" are sistemul de taiere "+sistemTaiere+" si taie pe un diametru de: "+ diametruTaiere+" si are acumulatori.");
		else
			System.out.println("Trimmer "+Brand+ " "+Model+" are sistemul de taiere "+sistemTaiere+" si taie pe un diametru de: "+ diametruTaiere+" si se conecteaza la priza.");
	}

	
	

	@Override
	public void alimenteaza() {
		// TODO Auto-generated method stub
		if (acumulatori)
		System.out.println("Trimmer "+Brand+ " "+Model+" alimentat de un motor electric pe acumulatori");
		else
		System.out.println("Trimmer "+Brand+ " "+Model+" alimentat de un motor electric de la priza");

	
}

	@Override
	public String toString() {
		return "Trimmer [Model=" + Model + ", sistemTaiere=" + sistemTaiere + ", tipAcumulator=" + tipAcumulator
				+ ", diametruTaiere=" + diametruTaiere + ", tensiune=" + tensiune + ", Brand=" + Brand + ", utilizare="
				+ utilizare + ", greutate=" + greutate + ", putere=" + putere + ", acumulatori=" + acumulatori + "]";
	}
	
	
	@Override
	public int hashCode() {
		return Objects.hash(Model, diametruTaiere, sistemTaiere, tensiune, tipAcumulator);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		TrimmerElectric other = (TrimmerElectric) obj;
		return Objects.equals(Model, other.Model) && diametruTaiere == other.diametruTaiere
				&& Objects.equals(sistemTaiere, other.sistemTaiere) && tensiune == other.tensiune
				&& Objects.equals(tipAcumulator, other.tipAcumulator);
	}
	
	}
