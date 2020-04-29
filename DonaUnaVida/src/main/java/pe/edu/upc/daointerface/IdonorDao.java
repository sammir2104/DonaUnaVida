package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.Donor;

public interface IdonorDao {
	public void insert(Donor donor);

	public List<Donor> list();
}
