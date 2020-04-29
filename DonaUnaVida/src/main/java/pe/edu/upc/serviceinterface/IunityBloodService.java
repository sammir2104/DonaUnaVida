package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.UnityBlood;

public interface IunityBloodService {
	public void insert(UnityBlood unityblood);

	public List<UnityBlood> list();
}
