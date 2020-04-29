package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Hospital;

public interface IhospitalDao {
	public void insert(Hospital hospital);

	public List<Hospital> list();
}
