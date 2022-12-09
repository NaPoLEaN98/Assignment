package school;

import java.rmi.*;
import java.util.*;
import javax.persistence.*;

public class StudentManagerService extends java.rmi.server.UnicastRemoteObject implements StudentManager {

	private static final int PORT = 6000;

	public StudentManagerService() throws RemoteException {
		super(PORT); //export this object on specified TCP/IP port
	}
    public List<StudentEntity> fetchInfo(int rollNo) {
		var emf = Persistence.createEntityManagerFactory("StudentsPU");
		var em = emf.createEntityManager();	
		try{	
			var query = em.createQuery("SELECT e FROM StudentEntity e WHERE e.rollNo=?1", StudentEntity.class);	
			query.setParameter(1, student);
			return query.getResultList();
		}finally{	
			em.close();
		}
	}

	public static void main(String[] args) throws Exception {
		var naming = java.rmi.registry.LocateRegistry.createRegistry(PORT);
		naming.bind("StudentManager", new StudentManagerService());
	}
}