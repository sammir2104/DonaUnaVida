package pe.edu.upc.entity;

import java.io.Serializable;
import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "UnityBlood")
public class UnityBlood implements Serializable {
	
	private static final long serialVersionUID = 1L;

//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CUnityBlood;
	
	@Column(name="DFechaVencimiento",nullable=false)
	private Date DFechaVencimiento;
	
	@Column(name = "NumLote", nullable = false)
	private int NumLote;

//constructores

	public UnityBlood() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public UnityBlood(int cUnityBlood, Date dFechaVencimiento, int numLote) {
		super();
		CUnityBlood = cUnityBlood;
		DFechaVencimiento = dFechaVencimiento;
		NumLote = numLote;
	}

//getters y setters
	public int getCUnityBlood() {
		return CUnityBlood;
	}

	public void setCUnityBlood(int cUnityBlood) {
		CUnityBlood = cUnityBlood;
	}

	public Date getDFechaVencimiento() {
		return DFechaVencimiento;
	}

	public void setDFechaVencimiento(Date dFechaVencimiento) {
		DFechaVencimiento = dFechaVencimiento;
	}

	public int getNumLote() {
		return NumLote;
	}

	public void setNumLote(int numLote) {
		NumLote = numLote;
	}
	
}
