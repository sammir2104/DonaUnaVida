package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerface.IhospitalDao;
import pe.edu.upc.entity.Hospital;

public class HospitalDaoImpl implements IhospitalDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "DonaUnaVida")
	private EntityManager em;

	@Override
	public void insert(Hospital hospital) {
		try {
			em.persist(hospital);
		} catch (Exception e) {
			System.out.println("Error al registro del Hospital");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Hospital> list() {
		List<Hospital> lista	= new ArrayList<Hospital>();
		try {
			Query q= em.createQuery("select i from Hospital");
			lista= (List<Hospital>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar los Hospitales");
		}
		return lista;
	}

}
