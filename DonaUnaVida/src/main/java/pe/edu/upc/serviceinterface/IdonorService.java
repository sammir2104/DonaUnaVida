package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.Donor;

public interface IdonorService {
	public void insert(Donor donor);

	public List<Donor> list();
}
