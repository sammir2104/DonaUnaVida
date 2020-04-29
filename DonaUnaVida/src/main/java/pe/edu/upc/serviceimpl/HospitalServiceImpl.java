package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IhospitalDao;
import pe.edu.upc.entity.Hospital;
import pe.edu.upc.serviceinterface.IhospitalService;

@Named
@RequestScoped
public class HospitalServiceImpl implements IhospitalService{
	
	@Inject
	private IhospitalDao iD;

	@Override
	public void insert(Hospital hospital) {
		try {
			iD.insert(hospital);
		}catch(Exception e) {
			System.out.println("Error en el service al insertar un Hospital");
		}
	}

	@Override
	public List<Hospital> list() {
		return iD.list();
	}

}
