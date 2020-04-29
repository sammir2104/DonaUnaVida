package pe.edu.upc.entity;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "TypesBlood")
public class TypeBlood implements Serializable {
	
	private static final long serialVersionUID = 1L;

//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CTypeBlood;
	
	@Column(name = "TDescripcionTipoSangre", nullable = false, length = 50)
	private String TDescripcionTipoSangre;

//constructores
	public TypeBlood() {
		super();
		// TODO Auto-generated constructor stub
	}

	public TypeBlood(int cTypeBlood, String tDescripcionTipoSangre) {
		super();
		CTypeBlood = cTypeBlood;
		TDescripcionTipoSangre = tDescripcionTipoSangre;
	}
	
//getters y setters
	public int getCTypeBlood() {
		return CTypeBlood;
	}

	public void setCTypeBlood(int cTypeBlood) {
		CTypeBlood = cTypeBlood;
	}

	public String getTDescripcionTipoSangre() {
		return TDescripcionTipoSangre;
	}

	public void setTDescripcionTipoSangre(String tDescripcionTipoSangre) {
		TDescripcionTipoSangre = tDescripcionTipoSangre;
	}
}
