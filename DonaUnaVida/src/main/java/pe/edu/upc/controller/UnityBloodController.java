package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.UnityBlood;
import pe.edu.upc.serviceinterface.IunityBloodService;

@Named
@RequestScoped
public class UnityBloodController implements Serializable {
	private static final long serialVersionUID = 1L;

	@Inject
	private IunityBloodService iService;

	private UnityBlood i;
	List<UnityBlood> listaUnitysBlood;

//constructor
	public void init() {
		this.listaUnitysBlood = new ArrayList<UnityBlood>();
		this.i = new UnityBlood();
		this.list();
	}

//metodos
	public String newTypeBlood() {
		this.setI(new UnityBlood());
		return "unityblood.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanUnityBlood();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listaUnitysBlood = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanUnityBlood() {
		this.init();
	}

	public UnityBlood getI() {
		return i;
	}

	public void setI(UnityBlood i) {
		this.i = i;
	}

	public List<UnityBlood> getListaUnitysBlood() {
		return listaUnitysBlood;
	}

	public void setListaUnitysBlood(List<UnityBlood> listaUnitysBlood) {
		this.listaUnitysBlood = listaUnitysBlood;
	}

}