package pe.edu.upc.daoimpl;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import pe.edu.upc.daointerface.ItypeBloodDao;
import pe.edu.upc.entity.TypeBlood;


public class TypeBloodDaoImpl implements ItypeBloodDao, Serializable {

	private static final long serialVersionUID = 1L;

	@PersistenceContext(unitName = "DonaUnaVida")
	private EntityManager em;

	@Override
	public void insert(TypeBlood typeblood) {
		try {
			em.persist(typeblood);
		} catch (Exception e) {
			System.out.println("Error al registro del Tipo de Sangre");
		}
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<TypeBlood> list() {
		List<TypeBlood> lista	= new ArrayList<TypeBlood>();
		try {
			Query q= em.createQuery("select i from TypeBlood");
			lista= (List<TypeBlood>) q.getResultList();
		} catch (Exception e) {
			System.out.println("Error al listar los tipos de sangre");
		}
		return lista;
	}
}