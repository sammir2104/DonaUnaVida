package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "Hospitals")
public class Hospital implements Serializable {
	
	private static final long serialVersionUID = 1L;

	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CHospital;

	@Column(name = "NHospital", nullable = false, length = 50)
	private String NHospital;

	@Column(name = "TDirectionH", nullable = false)
	private String TDireccionH;

	@Column(name = "NumHospital", nullable = false)
	private int NumHospital;

//constructor sin parametros
	public Hospital() {
		super();
		// TODO Auto-generated constructor stub
	}

//constructo con parametros
	public Hospital(int cHospital, String nHospital, String tDireccionH, int numHospital) {
		super();
		CHospital = cHospital;
		NHospital = nHospital;
		TDireccionH = tDireccionH;
		NumHospital = numHospital;
	}

//getters y setters
	public int getCHospital() {
		return CHospital;
	}

	public void setCHospital(int cHospital) {
		CHospital = cHospital;
	}

	public String getNHospital() {
		return NHospital;
	}

	public void setNHospital(String nHospital) {
		NHospital = nHospital;
	}

	public String getTDireccionH() {
		return TDireccionH;
	}

	public void setTDireccionH(String tDireccionH) {
		TDireccionH = tDireccionH;
	}

	public int getNumHospital() {
		return NumHospital;
	}

	public void setNumHospital(int numHospital) {
		NumHospital = numHospital;
	}

}
