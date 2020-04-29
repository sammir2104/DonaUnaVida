package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.TypeBlood;

public interface ItypeBloodDao {
	public void insert(TypeBlood typeblood);

	public List<TypeBlood> list();
}