package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IdonorDao;
import pe.edu.upc.entity.Donor;
import pe.edu.upc.serviceinterface.IdonorService;

@Named
@RequestScoped
public class DonorServiceImpl implements IdonorService{
	
	@Inject
	private IdonorDao iD;

	@Override
	public void insert(Donor donor) {
		try {
			iD.insert(donor);
		}catch(Exception e) {
			System.out.println("Error en el service al insertar un Hospital");
		}
	}

	@Override
	public List<Donor> list() {
		return iD.list();
	}
}
