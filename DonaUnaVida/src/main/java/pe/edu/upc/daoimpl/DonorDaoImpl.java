package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerface.IdonorDao;
import pe.edu.upc.entity.Donor;

public class DonorDaoImpl implements IdonorDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "DonaUnaVida")
	private EntityManager em;

	@Override
	public void insert(Donor donor) {
		try {
			em.persist(donor);
		} catch (Exception e) {
			System.out.println("Error al registro del Donante");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Donor> list() {
		List<Donor> lista	= new ArrayList<Donor>();
		try {
			Query q= em.createQuery("select i from Donor");
			lista= (List<Donor>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar los Donadores");
		}
		return lista;
	}
}