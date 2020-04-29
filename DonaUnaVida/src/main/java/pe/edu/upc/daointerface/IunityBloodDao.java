package pe.edu.upc.daointerface;

import java.util.List;

import pe.edu.upc.entity.UnityBlood;


public interface IunityBloodDao {
	public void insert(UnityBlood unityblood);

	public List<UnityBlood> list();
}