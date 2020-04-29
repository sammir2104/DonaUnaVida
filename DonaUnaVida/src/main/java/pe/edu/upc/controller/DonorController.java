package pe.edu.upc.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.entity.Donor;
import pe.edu.upc.serviceinterface.IdonorService;


@Named
@RequestScoped
public class DonorController implements Serializable{
	private static final long serialVersionUID = 1L;

	@Inject
	private IdonorService iService;

	private Donor i;
	List<Donor> listaDonors;

//constructor
	public void init() {
		this.listaDonors = new ArrayList<Donor>();
		this.i = new Donor();
		this.list();
	}

//metodos
	public String newDonor() {
		this.setI(new Donor());
		return "donor.xhtml";
	}

	public void insert() {
		try {
			iService.insert(i);
			cleanDonor();
			this.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void list() {
		try {
			listaDonors = iService.list();
		} catch (Exception e) {
			e.getMessage();
		}
	}

	public void cleanDonor () {
		this.init();
	}

// getters and setters
	public Donor getI() {
		return i;
	}

	public void setI(Donor i) {
		this.i = i;
	}

	public List<Donor> getListaDonors() {
		return listaDonors;
	}

	public void setListaDonors(List<Donor> listaDonors) {
		this.listaDonors = listaDonors;
	}

}
