package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Hospital;
import pe.edu.upc.serviceinterface.IhospitalService;

@Named
@RequestScoped
public class HospitalController implements Serializable{
	private static final long serialVersionUID = 1L;

	@Inject
	private IhospitalService iService;

	private Hospital i;
	List<Hospital> listaHospital;

//constructor
	public void init() {
		this.listaHospital = new ArrayList<Hospital>();
		this.i = new Hospital();
		this.list();
	}

//metodos
	public String newHospital() {
		this.setI(new Hospital());
		return "hospital.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanHospital();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listaHospital = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanHospital() {
		this.init();
	}

// getters and setters
	public Hospital getI() {
		return i;
	}

	public void setI(Hospital i) {
		this.i = i;
	}

	public List<Hospital> getListaHospital() {
		return listaHospital;
	}

	public void setListaHospital(List<Hospital> listaHospital) {
		this.listaHospital = listaHospital;
	}

}
