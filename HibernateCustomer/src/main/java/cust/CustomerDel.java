package cust;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerDel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Pavan");
    EntityManager entityManager=entityManagerFactory.createEntityManager();
    EntityTransaction entityTransaction=entityManager.getTransaction();
    
    Customer customer=entityManager.find(Customer.class,2);
    if(customer!=null) {
    	entityTransaction.begin();
    	entityManager.remove(customer);
    	entityTransaction.commit();
    }
    else {
    	System.out.println("Data not found");
    }
	}

}
