package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerface.IunityBloodDao;
import pe.edu.upc.entity.UnityBlood;


public class UnityBloodDaoImpl implements IunityBloodDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "DonaUnaVida")
	private EntityManager em;

	@Override
	public void insert(UnityBlood unityblood) {
		try {
			em.persist(unityblood);
		} catch (Exception e) {
			System.out.println("Error al registro de Unidad de Sangre");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<UnityBlood> list() {
		List<UnityBlood> lista	= new ArrayList<UnityBlood>();
		try {
			Query q= em.createQuery("select i from UnityBlood");
			lista= (List<UnityBlood>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar los unidades de sangre");
		}
		return lista;
	}
}