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
@Table(name = "Donors")
public class Donor implements Serializable {
	
	private static final long serialVersionUID = 1L;

	//atributos
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int CDonante;

	@Column(name = "CDNI", nullable = false)
	private int CDNI;
	
	@Column(name = "NNombreDonante", nullable = false, length = 50)
	private String NNombreDonante;

	@Column(name = "NApellidoDonante", nullable = false, length = 50)
	private String NApellidoDonante;
	
	@Column(name = "DNacimientoDonante", nullable = false)
	private Date DNacimientoDonante;
	
	@Column(name = "CTipoSangre")
	private int CTipoSangre;
	
	@Column(name = "TDirectionD", nullable = false)
	private String TDireccionD;

	public Donor() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Donor(int cDonante, int cDNI, String nNombreDonante, String nApellidoDonante, Date dNacimientoDonante,
			int cTipoSangre, String tDireccionD) {
		super();
		CDonante = cDonante;
		CDNI = cDNI;
		NNombreDonante = nNombreDonante;
		NApellidoDonante = nApellidoDonante;
		DNacimientoDonante = dNacimientoDonante;
		CTipoSangre = cTipoSangre;
		TDireccionD = tDireccionD;
	}

	public int getCDonante() {
		return CDonante;
	}

	public void setCDonante(int cDonante) {
		CDonante = cDonante;
	}

	public int getCDNI() {
		return CDNI;
	}

	public void setCDNI(int cDNI) {
		CDNI = cDNI;
	}

	public String getNNombreDonante() {
		return NNombreDonante;
	}

	public void setNNombreDonante(String nNombreDonante) {
		NNombreDonante = nNombreDonante;
	}

	public String getNApellidoDonante() {
		return NApellidoDonante;
	}

	public void setNApellidoDonante(String nApellidoDonante) {
		NApellidoDonante = nApellidoDonante;
	}

	public Date getDNacimientoDonante() {
		return DNacimientoDonante;
	}

	public void setDNacimientoDonante(Date dNacimientoDonante) {
		DNacimientoDonante = dNacimientoDonante;
	}

	public int getCTipoSangre() {
		return CTipoSangre;
	}

	public void setCTipoSangre(int cTipoSangre) {
		CTipoSangre = cTipoSangre;
	}

	public String getTDireccionD() {
		return TDireccionD;
	}

	public void setTDireccionD(String tDireccionD) {
		TDireccionD = tDireccionD;
	}
	
}
