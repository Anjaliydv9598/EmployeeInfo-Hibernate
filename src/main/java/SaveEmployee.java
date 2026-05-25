import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import org.hibernate.cfg.Configuration;

public class SaveEmployee {

	 public static void main(String [] args) {
		 
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("java");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
	    	Employee e = new Employee(2,"Anjali" , "asd@gmail.com" , 1234567890 , "gurgaon" );
	    	
	    	et.begin();
		 
	    	em.persist(e);
	    	et.commit();
	    	System.out.println("Data Saved Successfully");

	        // Close Resources
	        em.close();
	        emf.close();
	    }

}
