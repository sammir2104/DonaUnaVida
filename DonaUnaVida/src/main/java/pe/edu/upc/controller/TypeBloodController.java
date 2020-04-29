package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.TypeBlood;
import pe.edu.upc.serviceinterface.ItypeBloodService;



@Named
@RequestScoped
public class TypeBloodController implements Serializable{
	private static final long serialVersionUID = 1L;

	@Inject
	private ItypeBloodService iService;

	private TypeBlood i;
	List<TypeBlood> listaTypesBlood;

//constructor
	public void init() {
		this.listaTypesBlood = new ArrayList<TypeBlood>();
		this.i = new TypeBlood();
		this.list();
	}

//metodos
	public String newTypeBlood() {
		this.setI(new TypeBlood());
		return "donor.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanTypeDonor();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listaTypesBlood = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanTypeDonor () {
		this.init();
	}

	// getters and setters
	public TypeBlood getI() {
		return i;
	}

	public void setI(TypeBlood i) {
		this.i = i;
	}

	public List<TypeBlood> getListaTypesBlood() {
		return listaTypesBlood;
	}

	public void setListaTypesBlood(List<TypeBlood> listaTypesBlood) {
		this.listaTypesBlood = listaTypesBlood;
	}

}