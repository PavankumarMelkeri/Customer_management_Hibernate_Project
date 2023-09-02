package cust;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class CustomerUpdate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
     EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("Pavan");
     EntityManager entityManager=entityManagerFactory.createEntityManager();
     EntityTransaction entityTransaction=entityManager.getTransaction();
     
     Customer customer=entityManager.find(Customer.class,2);
     customer.setPhno(8765988);
     
     entityTransaction.begin();
     entityManager.merge(customer);
     entityTransaction.commit();
	}

}
