import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.hibernate.cfg.Configuration;

public class SaveEmployee {

	 public static void main(String [] args) {
		 
		 EntityManagerFactory emf=Persistence.createEntityManagerFactory("java");
			EntityManager em=emf.createEntityManager();
			EntityTransaction et=em.getTransaction();
			
//	    	Employee e = new Employee(2,"Alia" , "aad@gmail.com" ,21,300000, 1233456890 , "Chandigarh",false , 'F' );
	    	
	    	
//	    	et.begin();
		 
//	    	em.persist(e);
//	    	em.merge(e);
//	    	et.commit();
//	    	System.out.println("Data Saved Successfully");
//
//			 to fetch , using JPQL
	Query query = em.createQuery("select e from Employee e");
			
	    	List <Employee> li = query.getResultList();
	    	for(Employee e2:li) {
	    		System.out.println("Employee Id : "+e2.getEid()+"\n"+"Employee Name: "+e2.getEname()+"\n"+"Employee Address : "+e2.getAddress()+"\n"+"Employee Age: " +e2.getAge()+"\n"+"Employee Email: "+e2.getEmail()+"\n"+"Employee Phone Number: "+e2.getEphone()+"\n"+"Employee's Gender :"+e2.getGender()+"\n"+"Employee Salary : "+e2.getSalary());
	    	
	    
	    		
//	        // Close Resources
//	        em.close();
//	        emf.close();
	    	
//			Employee e = new Employee(3,"Deepika" , "d@gmail.com" ,22,400000, 12334890 , "Pune",true , 'F' );
	    	
	    	
	    	
	   
	 		
	    		
	    		
	    		
	    	}
	    }

}
