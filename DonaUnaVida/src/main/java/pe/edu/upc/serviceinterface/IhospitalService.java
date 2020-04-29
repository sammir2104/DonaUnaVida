package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Hospital;

public interface IhospitalService {
	public void insert(Hospital hospital);

	public List<Hospital> list();
}
