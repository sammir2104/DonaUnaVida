package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.IunityBloodDao;
import pe.edu.upc.entity.UnityBlood;
import pe.edu.upc.serviceinterface.IunityBloodService;

@Named
@RequestScoped
public class UnityBloodServiceImpl implements IunityBloodService{
	
	@Inject
	private IunityBloodDao iD;

	@Override
	public void insert(UnityBlood unityblood) {
		try {
			iD.insert(unityblood);
		}catch(Exception e) {
			System.out.println("Error en el service al insertar una Unidad de Sangre");
		}
	}

	@Override
	public List<UnityBlood> list() {
		return iD.list();
	}
}
