package pe.edu.upc.serviceimpl;

import java.util.List;

import javax.enterprise.context.RequestScoped;
import javax.inject.Inject;
import javax.inject.Named;

import pe.edu.upc.daointerface.ItypeBloodDao;
import pe.edu.upc.entity.TypeBlood;
import pe.edu.upc.serviceinterface.ItypeBloodService;

@Named
@RequestScoped
public class TypeBloodServiceImpl implements ItypeBloodService{
	
	@Inject
	private ItypeBloodDao iD;

	@Override
	public void insert(TypeBlood typeblood) {
		try {
			iD.insert(typeblood);
		}catch(Exception e) {
			System.out.println("Error en el service al insertar un Tipo de Sangre");
		}
	}

	@Override
	public List<TypeBlood> list() {
		return iD.list();
	}
}
