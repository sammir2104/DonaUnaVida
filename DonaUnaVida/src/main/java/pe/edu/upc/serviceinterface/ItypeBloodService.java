package pe.edu.upc.serviceinterface;

import java.util.List;

import pe.edu.upc.entity.TypeBlood;

public interface ItypeBloodService {

		public void insert(TypeBlood typeblood);

		public List<TypeBlood> list();
}
